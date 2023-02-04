package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.*;

public class ProfessorTableModel extends AbstractTableModel{
    
    public static final int COL_CODIGO_PROFESSOR = 0;
    public static final int COL_NOME_PROFESSOR = 1;
    public static final int COL_CELULAR_PROFESSOR = 2;
    public static final int COL_FIXO_PROFESSOR = 3;
    public ArrayList<Professor> listarProfessor;
    
    public ProfessorTableModel(ArrayList<Professor>l){
        listarProfessor = new ArrayList<>(l);
    }

    @Override
    public int getRowCount() {
        return listarProfessor.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Professor p = listarProfessor.get(linhas);
        if(colunas == COL_CODIGO_PROFESSOR) return p.getCodigo_professor();
        if(colunas == COL_NOME_PROFESSOR) return p.getNome_professor();
        if(colunas == COL_CELULAR_PROFESSOR) return p.getCelular_professor();
        if(colunas == COL_FIXO_PROFESSOR) return p.getFixo_professor();
        return null;
    }
    
    @Override
    public String getColumnName(int colunas){
        if(colunas == COL_CODIGO_PROFESSOR) return "Código";
        if(colunas == COL_NOME_PROFESSOR) return "Nome";
        if(colunas == COL_CELULAR_PROFESSOR) return "Celular";
        if(colunas == COL_FIXO_PROFESSOR) return "Fixo";     
        return null;
    }
    
}

