package dao;

import java.sql.*;
import java.util.ArrayList;
import model.*;

public class AvaliacaoDAO {

    public Connection conn;
    public PreparedStatement stmt;
    public Statement st;
    public ResultSet rs;

    public AvaliacaoDAO() {
        conn = new ConnectionFactory().getConexao();
    }

    public void alterar(Avaliacao a) {
        String sql = "UPDATE avaliacao SET preco_avaliacao = ?, data_ajuste_avaliacao = ? WHERE codigo_avaliacao = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setDouble(1, a.getPreco_avaliacao());
            stmt.setDate(2, new java.sql.Date(a.getData_ajuste_avaliacao().getTime()));
            stmt.setInt(3, a.getCodigo_avaliacao());
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public ArrayList<Avaliacao> listarTodos() {
        ArrayList<Avaliacao> lista = new ArrayList<>();
        String sql = "SELECT * FROM avaliacao";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Avaliacao a = new Avaliacao();
                a.setCodigo_avaliacao(rs.getInt("codigo_avaliacao"));
                a.setNome_avaliacao(rs.getString("nome_avaliacao"));
                a.setPreco_avaliacao(rs.getDouble("preco_avaliacao"));
                a.setData_ajuste_avaliacao(rs.getDate("data_ajuste_avaliacao"));
                lista.add(a);
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return lista;
    }
}
