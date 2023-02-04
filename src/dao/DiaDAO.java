package dao;

import java.sql.*;
import java.util.ArrayList;
import model.*;

public class DiaDAO {

    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;

    public DiaDAO() {
        conn = new ConnectionFactory().getConexao();
    }

    public void inserir(Dia d) {
        String sql = "INSERT INTO dia (nome_dia) VALUES (?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, d.getNome_dia());
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public void alterar(Dia d) {
        String sql = "UPDATE dia SET nome_dia = ? WHERE codigo_dia = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, d.getNome_dia());
            stmt.setInt(2, d.getCodigo_dia());
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public ArrayList<Dia> listarTodos() {
        ArrayList<Dia> lista = new ArrayList<>();
        String sql = "SELECT * FROM dia";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Dia d = new Dia();
                d.setCodigo_dia(rs.getInt("codigo_dia"));
                d.setNome_dia(rs.getString("nome_dia"));
                lista.add(d);
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return lista;
    }
}
