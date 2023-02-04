package model;

import java.sql.Time;
import java.util.Date;

public class Atendimento {
    
    private int codigo_atendimento;
    private Date data_atendimento;
    private int codigo_aluno;
    private String nome_aluno;
    private String celular_aluno;
    private String fixo_aluno;
    private int codigo_professor;
    private String nome_professor;
    private String celular_professor;
    private String fixo_professor;
    private int codigo_dia;
    private String nome_dia;
    private int codigo_horainicial;
    private Time nome_horainicial;
    private int codigo_horafinal;
    private Time nome_horafinal;
    private double preco_atendimento;
    private String pagamento_atendimento;
    private String situacao_atendimento;
    private String descricao_atendimento;

    public String getCelular_aluno() {
        return celular_aluno;
    }

    public void setCelular_aluno(String celular_aluno) {
        this.celular_aluno = celular_aluno;
    }

    public String getCelular_professor() {
        return celular_professor;
    }

    public void setCelular_professor(String celular_professor) {
        this.celular_professor = celular_professor;
    }

    public int getCodigo_aluno() {
        return codigo_aluno;
    }

    public void setCodigo_aluno(int codigo_aluno) {
        this.codigo_aluno = codigo_aluno;
    }

    public int getCodigo_atendimento() {
        return codigo_atendimento;
    }

    public void setCodigo_atendimento(int codigo_atendimento) {
        this.codigo_atendimento = codigo_atendimento;
    }

    public int getCodigo_dia() {
        return codigo_dia;
    }

    public void setCodigo_dia(int codigo_dia) {
        this.codigo_dia = codigo_dia;
    }

    public int getCodigo_horafinal() {
        return codigo_horafinal;
    }

    public void setCodigo_horafinal(int codigo_horafinal) {
        this.codigo_horafinal = codigo_horafinal;
    }

    public int getCodigo_horainicial() {
        return codigo_horainicial;
    }

    public void setCodigo_horainicial(int codigo_horainicial) {
        this.codigo_horainicial = codigo_horainicial;
    }

    public int getCodigo_professor() {
        return codigo_professor;
    }

    public void setCodigo_professor(int codigo_professor) {
        this.codigo_professor = codigo_professor;
    }

    public Date getData_atendimento() {
        return data_atendimento;
    }

    public void setData_atendimento(Date data_atendimento) {
        this.data_atendimento = data_atendimento;
    }

    public String getDescricao_atendimento() {
        return descricao_atendimento;
    }

    public void setDescricao_atendimento(String descricao_atendimento) {
        this.descricao_atendimento = descricao_atendimento;
    }

    public String getFixo_aluno() {
        return fixo_aluno;
    }

    public void setFixo_aluno(String fixo_aluno) {
        this.fixo_aluno = fixo_aluno;
    }

    public String getFixo_professor() {
        return fixo_professor;
    }

    public void setFixo_professor(String fixo_professor) {
        this.fixo_professor = fixo_professor;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public String getNome_dia() {
        return nome_dia;
    }

    public void setNome_dia(String nome_dia) {
        this.nome_dia = nome_dia;
    }

    public Time getNome_horafinal() {
        return nome_horafinal;
    }

    public void setNome_horafinal(Time nome_horafinal) {
        this.nome_horafinal = nome_horafinal;
    }

    public Time getNome_horainicial() {
        return nome_horainicial;
    }

    public void setNome_horainicial(Time nome_horainicial) {
        this.nome_horainicial = nome_horainicial;
    }

    public String getNome_professor() {
        return nome_professor;
    }

    public void setNome_professor(String nome_professor) {
        this.nome_professor = nome_professor;
    }

    public String getPagamento_atendimento() {
        return pagamento_atendimento;
    }

    public void setPagamento_atendimento(String pagamento_atendimento) {
        this.pagamento_atendimento = pagamento_atendimento;
    }

    public double getPreco_atendimento() {
        return preco_atendimento;
    }

    public void setPreco_atendimento(double preco_atendimento) {
        this.preco_atendimento = preco_atendimento;
    }

    public String getSituacao_atendimento() {
        return situacao_atendimento;
    }

    public void setSituacao_atendimento(String situacao_atendimento) {
        this.situacao_atendimento = situacao_atendimento;
    }

    

    
    
}
