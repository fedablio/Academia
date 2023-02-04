package table;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.table.AbstractTableModel;
import model.*;

public class AtendimentoTableModel extends AbstractTableModel{
    
    DecimalFormat formaValor = new DecimalFormat("0.00", new DecimalFormatSymbols(new Locale("", "US")));
    
    public static final int COL_CODIGO_ATENDIMENTO = 0;
    public static final int COL_DATA_ATENDIMENTO = 1;
    public static final int COL_CODIGO_ALUNO = 2;
    public static final int COL_NOME_ALUNO = 3;
    public static final int COL_CELULAR_ALUNO = 4;
    public static final int COL_FIXO_ALUNO = 5;
    public static final int COL_CODIGO_PROF = 6;
    public static final int COL_NOME_PROF = 7;
    public static final int COL_CELULAR_PROF = 8;
    public static final int COL_FIXO_PROF = 9;
    public static final int COL_CODIGO_DIA = 10;
    public static final int COL_NOME_DIA = 11;
    public static final int COL_CODIGO_HORAINICIAL = 12;
    public static final int COL_NOME_HORAINICIAL = 13;
    public static final int COL_CODIGO_HORAFINAL = 14;
    public static final int COL_NOME_HORAFINAL = 15;
    public static final int COL_PRECO_ATEND = 16;
    public static final int COL_PAGAMENTO_AVAL = 17;
    public static final int COL_SITUACAO_AVAL = 18;
    public ArrayList<Atendimento> listarAtendimento;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdfh = new SimpleDateFormat("HH:mm");
    
    public AtendimentoTableModel(ArrayList<Atendimento>l){
        listarAtendimento = new ArrayList<>(l);
    }

    @Override
    public int getRowCount() {
        return listarAtendimento.size();
    }

    @Override
    public int getColumnCount() {
        return 19;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Atendimento a = listarAtendimento.get(linhas);
        if(colunas == COL_CODIGO_ATENDIMENTO) return a.getCodigo_atendimento();
        if(colunas == COL_DATA_ATENDIMENTO) return sdf.format(a.getData_atendimento());
        if(colunas == COL_CODIGO_ALUNO) return a.getCodigo_aluno();
        if(colunas == COL_NOME_ALUNO) return a.getNome_aluno();
        if(colunas == COL_CELULAR_ALUNO) return a.getCelular_aluno();
        if(colunas == COL_FIXO_ALUNO) return a.getFixo_aluno();
        if(colunas == COL_CODIGO_PROF) return a.getCodigo_professor();
        if(colunas == COL_NOME_PROF) return a.getNome_professor();
        if(colunas == COL_CELULAR_PROF) return a.getCelular_professor();
        if(colunas == COL_FIXO_PROF) return a.getFixo_professor();
        if(colunas == COL_CODIGO_DIA) return a.getCodigo_dia();
        if(colunas == COL_NOME_DIA) return a.getNome_dia();
        if(colunas == COL_CODIGO_HORAINICIAL) return a.getCodigo_horainicial();
        if(colunas == COL_NOME_HORAINICIAL) return sdfh.format(a.getNome_horainicial());
        if(colunas == COL_CODIGO_HORAFINAL) return a.getCodigo_horafinal();
        if(colunas == COL_NOME_HORAFINAL) return sdfh.format(a.getNome_horafinal());
        if(colunas == COL_PRECO_ATEND) return formaValor.format(a.getPreco_atendimento());
        if(colunas == COL_PAGAMENTO_AVAL) return a.getPagamento_atendimento();
        if(colunas == COL_SITUACAO_AVAL) return a.getSituacao_atendimento();
        return null;
    }
    
    @Override
    public String getColumnName(int colunas){
        if(colunas == COL_CODIGO_ATENDIMENTO) return "Código";
        if(colunas == COL_DATA_ATENDIMENTO) return "Data";
        if(colunas == COL_CODIGO_ALUNO) return "Cód. Aluno";
        if(colunas == COL_NOME_ALUNO) return "Aluno";
        if(colunas == COL_CELULAR_ALUNO) return "Celular";
        if(colunas == COL_FIXO_ALUNO) return "Fixo";
        if(colunas == COL_CODIGO_PROF) return "Cód. Prof.";
        if(colunas == COL_NOME_PROF) return "Professor";
        if(colunas == COL_CELULAR_PROF) return "Celular"; 
        if(colunas == COL_FIXO_PROF) return "Fixo";
        if(colunas == COL_CODIGO_DIA) return "Cód. Dia";
        if(colunas == COL_NOME_DIA) return "Dia";
        if(colunas == COL_CODIGO_HORAINICIAL) return "Cód. Inicial";
        if(colunas == COL_NOME_HORAINICIAL) return  "Inicial";
        if(colunas == COL_CODIGO_HORAFINAL) return  "Cód. Final";
        if(colunas == COL_NOME_HORAFINAL) return  "Final";
        if(colunas == COL_PRECO_ATEND) return "Preço";
        if(colunas == COL_PAGAMENTO_AVAL) return "Pagamento"; //Adimplente ou Inadimplente
        if(colunas == COL_SITUACAO_AVAL) return "Situação";   //Avaliação ou Reavaliação     
        return null;
    }
    
}
