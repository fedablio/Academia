package dao;

import model.*;
import java.sql.*;
import java.util.ArrayList;

public class HoraInicialDAO {

    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;

    public HoraInicialDAO() {
        conn = new ConnectionFactory().getConexao();
    }

    public void inserir(HoraInicial h) {
        String sql = "INSERT INTO horainicial (nome_horainicial) VALUES (?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setTime(1, h.getNome_horainicial());
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public void alterar(HoraInicial h) {
        String sql = "UPDATE horainicial SET nome_horainicial = ? WHERE codigo_horainicial = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setTime(1, h.getNome_horainicial());
            stmt.setInt(2, h.getCodigo_horainicial());
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public ArrayList<HoraInicial> listarTodos() {
        ArrayList<HoraInicial> lista = new ArrayList<>();
        String sql = "SELECT * FROM horainicial";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                HoraInicial h = new HoraInicial();
                h.setCodigo_horainicial(rs.getInt("codigo_horainicial"));
                h.setNome_horainicial(rs.getTime("nome_horainicial"));
                lista.add(h);
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return lista;
    }
}
