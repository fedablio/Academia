package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.*;

public class DiaTableModel extends AbstractTableModel{
    
    public static final int COL_CODIGO_DIA = 0;
    public static final int COL_NOME_DIA = 1;
    public ArrayList<Dia> listarDia;
    
    public DiaTableModel(ArrayList<Dia>l){
        listarDia = new ArrayList<>(l);
    }

    @Override
    public int getRowCount() {
        return listarDia.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Dia d = listarDia.get(linhas);
        if(colunas == COL_CODIGO_DIA) return d.getCodigo_dia();
        if(colunas == COL_NOME_DIA) return d.getNome_dia();
        return null;
    }
    
    @Override
    public String getColumnName(int colunas){
        if(colunas == COL_CODIGO_DIA) return "Código";
        if(colunas == COL_NOME_DIA) return "Nome";
        return null;
    }
    
}
