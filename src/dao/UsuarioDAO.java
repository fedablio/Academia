package dao;

import java.sql.*;
import model.*;

public class UsuarioDAO {

    private Connection conn;
    public PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;

    public UsuarioDAO() {
        conn = new ConnectionFactory().getConexao();
    }

    public boolean dao_autenticar_acesso(String login_usuario, String senha_usuario) {
        boolean resultado = false;
        String sql = "SELECT login_usuario, senha_usuario FROM usuario WHERE login_usuario = '" + login_usuario + "' AND senha_usuario = '" + senha_usuario + "' ";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                resultado = true;
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return resultado;
    }

    public void alterar(Usuario u) {
        String sql = "UPDATE usuario SET senha_usuario = ? WHERE login_usuario = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, u.getSenha_usuario());
            stmt.setString(2, u.getLogin_usuario());
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
}
