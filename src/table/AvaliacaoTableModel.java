package table;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.table.AbstractTableModel;
import model.*;

public class AvaliacaoTableModel extends AbstractTableModel{
    
    DecimalFormat formaValor = new DecimalFormat("0.00", new DecimalFormatSymbols(new Locale("", "US")));
    
    public static final int COL_CODIGO_AVA = 0;
    public static final int COL_NOME_AVA = 1;
    public static final int COL_PRECO_AVA = 2;
    public static final int COL_DATA_AVA = 3;
    public ArrayList<Avaliacao> listarAvaliacao;

    public AvaliacaoTableModel(ArrayList<Avaliacao>l){
        listarAvaliacao = new ArrayList<>(l);
    }
    
    @Override
    public int getRowCount() {
        return listarAvaliacao.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Avaliacao a = listarAvaliacao.get(linhas);
        if(colunas == COL_CODIGO_AVA) return a.getCodigo_avaliacao();
        if(colunas == COL_NOME_AVA) return a.getNome_avaliacao();
        if(colunas == COL_PRECO_AVA) return formaValor.format(a.getPreco_avaliacao());
        if(colunas == COL_DATA_AVA) return new SimpleDateFormat("dd/MM/yyyy").format(a.getData_ajuste_avaliacao());
        return null;
    }
    
    @Override
    public String getColumnName(int colunas){
        if(colunas == COL_CODIGO_AVA) return "Código";
        if(colunas == COL_NOME_AVA) return "Nome";
        if(colunas == COL_PRECO_AVA) return "Preço R$";
        if(colunas == COL_DATA_AVA) return "Última Alteração";
        return null;        
    }
    
    
    
}
