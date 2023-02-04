package dao;

import java.sql.*;
import java.util.ArrayList;
import model.*;

public class ProfessorDAO {

    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;

    public ProfessorDAO() {
        conn = new ConnectionFactory().getConexao();
    }

    public void inserir(Professor p) {
        String sql = "INSERT INTO professor (nome_professor, celular_professor, fixo_professor) VALUES (?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, p.getNome_professor());
            stmt.setString(2, p.getCelular_professor());
            stmt.setString(3, p.getFixo_professor());
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public void alterar(Professor p) {
        String sql = "UPDATE professor SET nome_professor = ?, celular_professor = ?, fixo_professor = ? WHERE codigo_professor = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, p.getNome_professor());
            stmt.setString(2, p.getCelular_professor());
            stmt.setString(3, p.getFixo_professor());
            stmt.setInt(4, p.getCodigo_professor());
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public void excluir(int codigo_professor) {
        String sql = "DELETE FROM professor WHERE codigo_professor = " + codigo_professor;
        try {
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public ArrayList<Professor> listarProfessor() {
        ArrayList<Professor> lista = new ArrayList<>();
        String sql = "SELECT * FROM professor";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Professor p = new Professor();
                p.setCodigo_professor(rs.getInt("codigo_professor"));
                p.setNome_professor(rs.getString("nome_professor"));
                p.setCelular_professor(rs.getString("celular_professor"));
                p.setFixo_professor(rs.getString("fixo_professor"));
                lista.add(p);
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return lista;
    }

    public ArrayList<Professor> listarProfessorNome(String nome_professor) {
        ArrayList<Professor> lista = new ArrayList<>();
        String sql = "SELECT * FROM professor WHERE nome_professor LIKE '%" + nome_professor + "%' ";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Professor p = new Professor();
                p.setCodigo_professor(rs.getInt("codigo_professor"));
                p.setNome_professor(rs.getString("nome_professor"));
                p.setCelular_professor(rs.getString("celular_professor"));
                p.setFixo_professor(rs.getString("fixo_professor"));
                lista.add(p);
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return lista;
    }

    public String dao_nome_professor(String nome_professr) {
        String resultado = null;
        String sql = "SELECT nome_professor FROM professor WHERE nome_professor = '" + nome_professr + "' ";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                resultado = rs.getString("nome_professor");
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return resultado;
    }
}
