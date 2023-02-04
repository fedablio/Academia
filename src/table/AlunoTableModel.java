package table;

import java.util.*;
import javax.swing.table.*;
import model.*;

public class AlunoTableModel extends AbstractTableModel{
    
    public static final int COL_CODIGO_ALUNO = 0;
    public static final int COL_NOME_ALUNO = 1;
    public static final int COL_CELULAR_ALUNO = 2;
    public static final int COL_FIXO_ALUNO = 3;
    public ArrayList<Aluno> listarAluno;
    
    public AlunoTableModel(ArrayList<Aluno>l){
        listarAluno = new ArrayList<>(l);
    }

    @Override
    public int getRowCount() {
        return listarAluno.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Aluno a = listarAluno.get(linhas);
        if(colunas == COL_CODIGO_ALUNO) return a.getCodigo_aluno();
        if(colunas == COL_NOME_ALUNO) return a.getNome_aluno();
        if(colunas == COL_CELULAR_ALUNO) return a.getCelular_aluno();
        if(colunas == COL_FIXO_ALUNO) return a.getFixo_aluno();
        return null;
    }
    
    @Override
    public String getColumnName(int colunas){
        if(colunas == COL_CODIGO_ALUNO) return "Código";
        if(colunas == COL_NOME_ALUNO) return "Nome";
        if(colunas == COL_CELULAR_ALUNO) return "Celular";
        if(colunas == COL_FIXO_ALUNO) return "Fixo";     
        return null;
    }
    
}
