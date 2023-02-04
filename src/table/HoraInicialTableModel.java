package table;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.*;

public class HoraInicialTableModel extends AbstractTableModel{
    
    public static final int COL_CODIGO_HORAINICIAL = 0;
    public static final int COL_NOME_HORAINICIAL = 1;
    public ArrayList<HoraInicial> listarHoraInicial;
    SimpleDateFormat sdfh = new SimpleDateFormat("HH:mm");
    
    public HoraInicialTableModel(ArrayList<HoraInicial>l){
        listarHoraInicial = new ArrayList<>(l);
    }

    @Override
    public int getRowCount() {
        return listarHoraInicial.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        HoraInicial h = listarHoraInicial.get(linhas);
        if(colunas == COL_CODIGO_HORAINICIAL) return h.getCodigo_horainicial();
        if(colunas == COL_NOME_HORAINICIAL) return sdfh.format(h.getNome_horainicial());
        return null;
    }
    
    @Override
    public String getColumnName(int colunas){
        if(colunas == COL_CODIGO_HORAINICIAL) return "Código";
        if(colunas == COL_NOME_HORAINICIAL) return "Nome";
        return null;
    }
    
    
    
}
