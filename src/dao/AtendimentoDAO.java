package dao;

import java.sql.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import javax.swing.JOptionPane;
import model.*;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public class AtendimentoDAO {

    DecimalFormat formaValor = new DecimalFormat("0.00", new DecimalFormatSymbols(new Locale("", "US")));
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;

    public AtendimentoDAO() {
        conn = new ConnectionFactory().getConexao();
    }

    public void inserir(Atendimento a) {
        String sql = "INSERT INTO atendimento (codigo_aluno,codigo_professor,codigo_dia,codigo_horainicial,codigo_horafinal,data_atendimento,preco_atendimento,pagamento_atendimento,situacao_atendimento,descricao_atendimento) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, a.getCodigo_aluno());
            stmt.setInt(2, a.getCodigo_professor());
            stmt.setInt(3, a.getCodigo_dia());
            stmt.setInt(4, a.getCodigo_horainicial());
            stmt.setInt(5, a.getCodigo_horafinal());
            stmt.setDate(6, new java.sql.Date(a.getData_atendimento().getTime()));
            stmt.setDouble(7, a.getPreco_atendimento());
            stmt.setString(8, a.getPagamento_atendimento());
            stmt.setString(9, a.getSituacao_atendimento());
            stmt.setString(10, a.getDescricao_atendimento());
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public void alterar(Atendimento a) {
        String sql = "UPDATE atendimento SET codigo_aluno=?,codigo_professor=?,codigo_dia=?,codigo_horainicial=?,codigo_horafinal=?,data_atendimento=?,preco_atendimento=?,pagamento_atendimento=?,situacao_atendimento=?,descricao_atendimento=? WHERE codigo_atendimento=?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, a.getCodigo_aluno());
            stmt.setInt(2, a.getCodigo_professor());
            stmt.setInt(3, a.getCodigo_dia());
            stmt.setInt(4, a.getCodigo_horainicial());
            stmt.setInt(5, a.getCodigo_horafinal());
            stmt.setDate(6, new java.sql.Date(a.getData_atendimento().getTime()));
            stmt.setDouble(7, a.getPreco_atendimento());
            stmt.setString(8, a.getPagamento_atendimento());
            stmt.setString(9, a.getSituacao_atendimento());
            stmt.setString(10, a.getDescricao_atendimento());
            stmt.setInt(11, a.getCodigo_atendimento());
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
            throw new RuntimeException(erro);
        }
    }

    public ArrayList<Atendimento> listarAtendimento() {
        ArrayList<Atendimento> lista = new ArrayList<>();
        String sql = "SELECT atendimento.codigo_atendimento,"
                + "atendimento.data_atendimento,"
                + "atendimento.pagamento_atendimento,"
                + "atendimento.situacao_atendimento,"
                + "professor.codigo_professor,"
                + "professor.nome_professor,"
                + "professor.celular_professor,"
                + "professor.fixo_professor,"
                + "aluno.codigo_aluno,"
                + "aluno.nome_aluno,"
                + "aluno.celular_aluno,"
                + "aluno.fixo_aluno,"
                + "dia.codigo_dia,"
                + "dia.nome_dia,"
                + "horainicial.codigo_horainicial,"
                + "horainicial.nome_horainicial,"
                + "horafinal.codigo_horafinal,"
                + "horafinal.nome_horafinal,"
                + "atendimento.preco_atendimento "
                + "FROM atendimento "
                + "INNER JOIN professor "
                + "INNER JOIN aluno "
                + "INNER JOIN dia "
                + "INNER JOIN horainicial "
                + "INNER JOIN horafinal "
                + "ON professor.codigo_professor = atendimento.codigo_professor "
                + "AND aluno.codigo_aluno = atendimento.codigo_aluno "
                + "AND dia.codigo_dia = atendimento.codigo_dia "
                + "AND horainicial.codigo_horainicial = atendimento.codigo_horainicial "
                + "AND horafinal.codigo_horafinal = atendimento.codigo_horafinal ";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Atendimento a = new Atendimento();
                a.setCodigo_atendimento(rs.getInt("codigo_atendimento"));
                a.setData_atendimento(rs.getDate("data_atendimento"));
                a.setPagamento_atendimento(rs.getString("pagamento_atendimento"));
                a.setSituacao_atendimento(rs.getString("situacao_atendimento"));
                a.setCodigo_professor(rs.getInt("codigo_professor"));
                a.setNome_professor(rs.getString("nome_professor"));
                a.setCelular_professor(rs.getString("celular_professor"));
                a.setFixo_professor(rs.getString("fixo_professor"));
                a.setCodigo_aluno(rs.getInt("codigo_aluno"));
                a.setNome_aluno(rs.getString("nome_aluno"));
                a.setCelular_aluno(rs.getString("celular_aluno"));
                a.setFixo_aluno(rs.getString("fixo_aluno"));
                a.setCodigo_dia(rs.getInt("codigo_dia"));
                a.setNome_dia(rs.getString("nome_dia"));
                a.setCodigo_horainicial(rs.getInt("codigo_horainicial"));
                a.setNome_horainicial(rs.getTime("nome_horainicial"));
                a.setCodigo_horafinal(rs.getInt("codigo_horafinal"));
                a.setNome_horafinal(rs.getTime("nome_horafinal"));
                a.setPreco_atendimento(rs.getInt("preco_atendimento"));
                lista.add(a);
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return lista;
    }

    public ArrayList<Atendimento> listarAtendimentoData(Date data_atendimento) {
        ArrayList<Atendimento> lista = new ArrayList<>();
        String sql = "SELECT atendimento.codigo_atendimento,"
                + "atendimento.data_atendimento,"
                + "atendimento.pagamento_atendimento,"
                + "atendimento.situacao_atendimento,"
                + "professor.codigo_professor,"
                + "professor.nome_professor,"
                + "professor.celular_professor,"
                + "professor.fixo_professor,"
                + "aluno.codigo_aluno,"
                + "aluno.nome_aluno,"
                + "aluno.celular_aluno,"
                + "aluno.fixo_aluno,"
                + "dia.codigo_dia,"
                + "dia.nome_dia,"
                + "horainicial.codigo_horainicial,"
                + "horainicial.nome_horainicial,"
                + "horafinal.codigo_horafinal,"
                + "horafinal.nome_horafinal,"
                + "atendimento.preco_atendimento,"
                + "FROM atendimento "
                + "INNER JOIN professor "
                + "INNER JOIN aluno "
                + "INNER JOIN dia "
                + "INNER JOIN horainicial "
                + "INNER JOIN horafinal "
                + "ON professor.codigo_professor = atendimento.codigo_professor "
                + "AND aluno.codigo_aluno = atendimento.codigo_aluno "
                + "AND dia.codigo_dia = atendimento.codigo_dia "
                + "AND horainicial.codigo_horainicial = atendimento.codigo_horainicial "
                + "AND horafinal.codigo_horafinal = atendimento.codigo_horafinal "
                + "WHERE data_atendimento = '" + data_atendimento + "' ";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Atendimento a = new Atendimento();
                a.setCodigo_atendimento(rs.getInt("codigo_atendimento"));
                a.setData_atendimento(rs.getDate("data_atendimento"));
                a.setPagamento_atendimento(rs.getString("pagamento_atendimento"));
                a.setSituacao_atendimento(rs.getString("situacao_atendimento"));
                a.setCodigo_professor(rs.getInt("codigo_professor"));
                a.setNome_professor(rs.getString("nome_professor"));
                a.setCelular_professor(rs.getString("celular_professor"));
                a.setFixo_professor(rs.getString("fixo_professor"));
                a.setCodigo_aluno(rs.getInt("codigo_aluno"));
                a.setNome_aluno(rs.getString("nome_aluno"));
                a.setCelular_aluno(rs.getString("celular_aluno"));
                a.setFixo_aluno(rs.getString("fixo_aluno"));
                a.setCodigo_dia(rs.getInt("codigo_dia"));
                a.setNome_dia(rs.getString("nome_dia"));
                a.setCodigo_horainicial(rs.getInt("codigo_horainicial"));
                a.setNome_horainicial(rs.getTime("nome_horainicial"));
                a.setCodigo_horafinal(rs.getInt("codigo_horafinal"));
                a.setNome_horafinal(rs.getTime("nome_horafinal"));
                a.setPreco_atendimento(rs.getInt("preco_atendimento"));
                lista.add(a);
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return lista;
    }

    public ArrayList<Atendimento> listarAtendimentoNomeProfessor(String nome_professor) {
        ArrayList<Atendimento> lista = new ArrayList<>();
        String sql = "SELECT atendimento.codigo_atendimento,"
                + "atendimento.data_atendimento,"
                + "atendimento.pagamento_atendimento,"
                + "atendimento.situacao_atendimento,"
                + "professor.codigo_professor,"
                + "professor.nome_professor,"
                + "professor.celular_professor,"
                + "professor.fixo_professor,"
                + "aluno.codigo_aluno,"
                + "aluno.nome_aluno,"
                + "aluno.celular_aluno,"
                + "aluno.fixo_aluno,"
                + "dia.codigo_dia,"
                + "dia.nome_dia,"
                + "horainicial.codigo_horainicial,"
                + "horainicial.nome_horainicial,"
                + "horafinal.codigo_horafinal,"
                + "horafinal.nome_horafinal,"
                + "atendimento.preco_atendimento,"
                + "FROM atendimento "
                + "INNER JOIN professor "
                + "INNER JOIN aluno "
                + "INNER JOIN dia "
                + "INNER JOIN horainicial "
                + "INNER JOIN horafinal "
                + "ON professor.codigo_professor = atendimento.codigo_professor "
                + "AND aluno.codigo_aluno = atendimento.codigo_aluno "
                + "AND dia.codigo_dia = atendimento.codigo_dia "
                + "AND horainicial.codigo_horainicial = atendimento.codigo_horainicial "
                + "AND horafinal.codigo_horafinal = atendimento.codigo_horafinal "
                + "WHERE nome_professor LIKE '%" + nome_professor + "%' ";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Atendimento a = new Atendimento();
                a.setCodigo_atendimento(rs.getInt("codigo_atendimento"));
                a.setData_atendimento(rs.getDate("data_atendimento"));
                a.setPagamento_atendimento(rs.getString("pagamento_atendimento"));
                a.setSituacao_atendimento(rs.getString("situacao_atendimento"));
                a.setCodigo_professor(rs.getInt("codigo_professor"));
                a.setNome_professor(rs.getString("nome_professor"));
                a.setCelular_professor(rs.getString("celular_professor"));
                a.setFixo_professor(rs.getString("fixo_professor"));
                a.setCodigo_aluno(rs.getInt("codigo_aluno"));
                a.setNome_aluno(rs.getString("nome_aluno"));
                a.setCelular_aluno(rs.getString("celular_aluno"));
                a.setFixo_aluno(rs.getString("fixo_aluno"));
                a.setCodigo_dia(rs.getInt("codigo_dia"));
                a.setNome_dia(rs.getString("nome_dia"));
                a.setCodigo_horainicial(rs.getInt("codigo_horainicial"));
                a.setNome_horainicial(rs.getTime("nome_horainicial"));
                a.setCodigo_horafinal(rs.getInt("codigo_horafinal"));
                a.setNome_horafinal(rs.getTime("nome_horafinal"));
                a.setPreco_atendimento(rs.getInt("preco_atendimento"));
                lista.add(a);
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return lista;
    }

    public ArrayList<Atendimento> listarAtendimentoNomeAluno(String nome_aluno) {
        ArrayList<Atendimento> lista = new ArrayList<>();
        String sql = "SELECT atendimento.codigo_atendimento,"
                + "atendimento.data_atendimento,"
                + "atendimento.pagamento_atendimento,"
                + "atendimento.situacao_atendimento,"
                + "professor.codigo_professor,"
                + "professor.nome_professor,"
                + "professor.celular_professor,"
                + "professor.fixo_professor,"
                + "aluno.codigo_aluno,"
                + "aluno.nome_aluno,"
                + "aluno.celular_aluno,"
                + "aluno.fixo_aluno,"
                + "dia.codigo_dia,"
                + "dia.nome_dia,"
                + "horainicial.codigo_horainicial,"
                + "horainicial.nome_horainicial,"
                + "horafinal.codigo_horafinal,"
                + "horafinal.nome_horafinal,"
                + "atendimento.preco_atendimento,"
                + "FROM atendimento "
                + "INNER JOIN professor "
                + "INNER JOIN aluno "
                + "INNER JOIN dia "
                + "INNER JOIN horainicial "
                + "INNER JOIN horafinal "
                + "ON professor.codigo_professor = atendimento.codigo_professor "
                + "AND aluno.codigo_aluno = atendimento.codigo_aluno "
                + "AND dia.codigo_dia = atendimento.codigo_dia "
                + "AND horainicial.codigo_horainicial = atendimento.codigo_horainicial "
                + "AND horafinal.codigo_horafinal = atendimento.codigo_horafinal "
                + "WHERE nome_aluno LIKE '%" + nome_aluno + "%' ";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Atendimento a = new Atendimento();
                a.setCodigo_atendimento(rs.getInt("codigo_atendimento"));
                a.setData_atendimento(rs.getDate("data_atendimento"));
                a.setPagamento_atendimento(rs.getString("pagamento_atendimento"));
                a.setSituacao_atendimento(rs.getString("situacao_atendimento"));
                a.setCodigo_professor(rs.getInt("codigo_professor"));
                a.setNome_professor(rs.getString("nome_professor"));
                a.setCelular_professor(rs.getString("celular_professor"));
                a.setFixo_professor(rs.getString("fixo_professor"));
                a.setCodigo_aluno(rs.getInt("codigo_aluno"));
                a.setNome_aluno(rs.getString("nome_aluno"));
                a.setCelular_aluno(rs.getString("celular_aluno"));
                a.setFixo_aluno(rs.getString("fixo_aluno"));
                a.setCodigo_dia(rs.getInt("codigo_dia"));
                a.setNome_dia(rs.getString("nome_dia"));
                a.setCodigo_horainicial(rs.getInt("codigo_horainicial"));
                a.setNome_horainicial(rs.getTime("nome_horainicial"));
                a.setCodigo_horafinal(rs.getInt("codigo_horafinal"));
                a.setNome_horafinal(rs.getTime("nome_horafinal"));
                a.setPreco_atendimento(rs.getInt("preco_atendimento"));
                lista.add(a);
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return lista;
    }

    public String descricao_atendimento(int codigo_atendimento) {
        String resultado = null;
        String sql = "SELECT descricao_atendimento FROM atendimento WHERE codigo_atendimento = " + codigo_atendimento;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                resultado = rs.getString("descricao_atendimento");
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return resultado;
    }

    public int dao_codigo_professor(String nome_professor) {
        int resultado = 0;
        String sql = "SELECT codigo_professor FROM professor WHERE nome_professor = '" + nome_professor + "' ";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                resultado = rs.getInt("codigo_professor");
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return resultado;
    }

    public String dao_nome_aluno(int codigo_aluno) {
        String resultado = null;
        String sql = "SELECT nome_aluno FROM aluno WHERE codigo_aluno = " + codigo_aluno;
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

    public int dao_codigo_aluno(String nome_aluno) {
        int resultado = 0;
        String sql = "SELECT codigo_aluno FROM aluno WHERE nome_aluno = '" + nome_aluno + "' ";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                resultado = rs.getInt("codigo_aluno");
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return resultado;
    }

    public int dao_codigo_dia(String nome_dia) {
        int resultado = 0;
        String sql = "SELECT codigo_dia FROM dia WHERE nome_dia = '" + nome_dia + "' ";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                resultado = rs.getInt("codigo_dia");
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return resultado;
    }

    public int dao_codigo_horainicial(String nome_horainicial) {
        int resultado = 0;
        String sql = "SELECT codigo_horainicial FROM horainicial WHERE nome_horainicial = '" + nome_horainicial + "' ";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                resultado = rs.getInt("codigo_horainicial");
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return resultado;
    }

    public int dao_codigo_horafinal(String nome_horafinal) {
        int resultado = 0;
        String sql = "SELECT codigo_horafinal FROM horafinal WHERE nome_horafinal = '" + nome_horafinal + "' ";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                resultado = rs.getInt("codigo_horafinal");
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return resultado;
    }

    public String dao_celular_professor(String nome_professor) {
        String resultado = null;
        String sql = "SELECT celular_professor FROM professor WHERE nome_professor = '" + nome_professor + "' ";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                resultado = rs.getString("celular_professor");
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return resultado;
    }

    public String dao_fixo_professor(String nome_professor) {
        String resultado = null;
        String sql = "SELECT fixo_professor FROM professor WHERE nome_professor = '" + nome_professor + "' ";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                resultado = rs.getString("fixo_professor");
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return resultado;
    }

    public String dao_celular_aluno(String nome_aluno) {
        String resultado = null;
        String sql = "SELECT celular_aluno FROM aluno WHERE nome_aluno = '" + nome_aluno + "' ";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                resultado = rs.getString("celular_aluno");
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return resultado;
    }

    public String dao_fixo_aluno(String nome_aluno) {
        String resultado = null;
        String sql = "SELECT fixo_aluno FROM aluno WHERE nome_aluno = '" + nome_aluno + "' ";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                resultado = rs.getString("fixo_aluno");
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return resultado;
    }

    public int dao_ultimo_atendimento() {
        int resultado = 0;
        String sql = "SELECT codigo_atendimento FROM atendimento";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.last()) {
                resultado = rs.getInt("codigo_atendimento");
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return resultado;
    }

    public double dao_preco_avaliacao(int codigo_avaliacao) {
        double resultado = 0;
        String sql = "SELECT preco_avaliacao FROM avaliacao WHERE codigo_avaliacao = " + codigo_avaliacao;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                resultado = rs.getDouble("preco_avaliacao");
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return resultado;
    }

    public JasperPrint dao_relatorio_atendimento(int codigo_atendimento) {
        JasperPrint relatorio = null;
        try {
            HashMap map = new HashMap();
            System.out.println(codigo_atendimento);
            map.put("CODIGO_ATENDIMENTO", codigo_atendimento);
            String caminho = System.getProperty("user.dir");
            String arquivoJasper = caminho + "\\src\\report\\report01.jasper";
            relatorio = JasperFillManager.fillReport(arquivoJasper, map, conn);
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
        return relatorio;
    }

    public JasperPrint dao_relatorio_professor_datas_pag(int codigo_professor, Date data_inicial, Date data_final, String pagamento_atendimento) {
        JasperPrint relatorio = null;
        try {
            HashMap map = new HashMap();
            map.put("CODIGO_PROFESSOR", codigo_professor);
            map.put("DATA_INICIAL", data_inicial);
            map.put("DATA_FINAL", data_final);
            map.put("PAGAMENTO_ATENDIMENTO", pagamento_atendimento);
            String caminho = System.getProperty("user.dir");
            String arquivoJasper = caminho + "\\src\\report\\report02.jasper";
            relatorio = JasperFillManager.fillReport(arquivoJasper, map, conn);
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
        return relatorio;
    }

    public JasperPrint dao_relatorio_professor_datas_pag_tod(int codigo_professor, Date data_inicial, Date data_final) {
        JasperPrint relatorio = null;
        try {
            HashMap map = new HashMap();
            map.put("CODIGO_PROFESSOR", codigo_professor);
            map.put("DATA_INICIAL", data_inicial);
            map.put("DATA_FINAL", data_final);
            String caminho = System.getProperty("user.dir");
            String arquivoJasper = caminho + "\\src\\report\\report03.jasper";
            relatorio = JasperFillManager.fillReport(arquivoJasper, map, conn);
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
        return relatorio;
    }

    public double dao_avaliacao_basica() {
        double resultado = 0;
        String sql = "SELECT preco_avaliacao FROM avaliacao";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.first()) {
                resultado = rs.getDouble("preco_avaliacao");
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return resultado;
    }

    public double dao_avaliacao_completa() {
        double resultado = 0;
        String sql = "SELECT preco_avaliacao FROM avaliacao";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.last()) {
                resultado = rs.getDouble("preco_avaliacao");
            }
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return resultado;
    }
}
