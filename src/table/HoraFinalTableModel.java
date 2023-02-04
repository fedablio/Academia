package table;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.*;

public class HoraFinalTableModel extends AbstractTableModel{
    
    public static final int COL_CODIGO_HORAFINAL = 0;
    public static final int COL_NOME_HORAFINAL = 1;
    public ArrayList<HoraFinal> listarHoraFinal;
    SimpleDateFormat sdfh = new SimpleDateFormat("HH:mm");
    
    public HoraFinalTableModel(ArrayList<HoraFinal>l){
        listarHoraFinal = new ArrayList<>(l);
    }

    @Override
    public int getRowCount() {
        return listarHoraFinal.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        HoraFinal h = listarHoraFinal.get(linhas);
        if(colunas == COL_CODIGO_HORAFINAL) return h.getCodigo_horafinal();
        if(colunas == COL_NOME_HORAFINAL) return sdfh.format(h.getNome_horafinal());
        return null;
    }
    
    @Override
    public String getColumnName(int colunas){
        if(colunas == COL_CODIGO_HORAFINAL) return "Código";
        if(colunas == COL_NOME_HORAFINAL) return "Nome";
        return null;
    }
    
    
    
}

