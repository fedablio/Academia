package dao;

import java.sql.*;
import java.util.ArrayList;
import model.*;

public class AlunoDAO {

    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;

    public AlunoDAO() {
        conn = new ConnectionFactory().getConexao();
    }

    public void inserir(Aluno a) {
        String sql = "INSERT INTO aluno (nome_aluno, celular_aluno, fixo_aluno) VALUES (?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, a.getNome_aluno());
            stmt.setString(2, a.getCelular_aluno());
            stmt.setString(3, a.getFixo_aluno());
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public void alterar(Aluno a) {
        String sql = "UPDATE aluno SET celular_aluno = ?, fixo_aluno = ? WHERE codigo_aluno = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, a.getCelular_aluno());
            stmt.setString(2, a.getFixo_aluno());
            stmt.setInt(3, a.getCodigo_aluno());
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public void excluir(int codigo_aluno) {
        String sql = "DELETE FROM aluno WHERE codigo_aluno = " + codigo_aluno;
        try {
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public ArrayList<Aluno> listarAluno() {
        ArrayList<Aluno> lista = new ArrayList<>();
        String sql = "SELECT * FROM aluno";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Aluno a = new Aluno();
                a.setCodigo_aluno(rs.getInt("codigo_aluno"));
                a.setNome_aluno(rs.getString("nome_aluno"));
                a.setCelular_aluno(rs.getString("celular_aluno"));
                a.setFixo_aluno(rs.getString("fixo_aluno"));
                lista.add(a);
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return lista;
    }

    public ArrayList<Aluno> listarAlunoNome(String nome_aluno) {
        ArrayList<Aluno> lista = new ArrayList<>();
        String sql = "SELECT * FROM aluno WHERE nome_aluno LIKE '%" + nome_aluno + "%' ";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Aluno a = new Aluno();
                a.setCodigo_aluno(rs.getInt("codigo_aluno"));
                a.setNome_aluno(rs.getString("nome_aluno"));
                a.setCelular_aluno(rs.getString("celular_aluno"));
                a.setFixo_aluno(rs.getString("fixo_aluno"));
                lista.add(a);
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return lista;
    }

    public String dao_nome_aluno(String nome_aluno) {
        String resultado = null;
        String sql = "SELECT nome_aluno FROM aluno WHERE nome_aluno = '" + nome_aluno + "' ";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                resultado = rs.getString("nome_aluno");
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return resultado;
    }
}
