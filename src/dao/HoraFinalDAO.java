package dao;

import model.*;
import java.sql.*;
import java.util.ArrayList;

public class HoraFinalDAO {

    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;

    public HoraFinalDAO() {
        conn = new ConnectionFactory().getConexao();
    }

    public void inserir(HoraFinal h) {
        String sql = "INSERT INTO horafinal (nome_horafinal) VALUES (?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setTime(1, h.getNome_horafinal());
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public void alterar(HoraFinal h) {
        String sql = "UPDATE horafinal SET nome_horafinal = ? WHERE codigo_horafinal = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setTime(1, h.getNome_horafinal());
            stmt.setInt(2, h.getCodigo_horafinal());
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public ArrayList<HoraFinal> listarTodos() {
        ArrayList<HoraFinal> lista = new ArrayList<>();
        String sql = "SELECT * FROM horafinal";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                HoraFinal h = new HoraFinal();
                h.setCodigo_horafinal(rs.getInt("codigo_horafinal"));
                h.setNome_horafinal(rs.getTime("nome_horafinal"));
                lista.add(h);
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return lista;
    }
}
