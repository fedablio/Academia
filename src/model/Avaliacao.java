package model;

import java.util.Date;

public class Avaliacao {
    
    private int codigo_avaliacao;
    private String nome_avaliacao;
    private double preco_avaliacao;
    private Date data_ajuste_avaliacao;

    public int getCodigo_avaliacao() {
        return codigo_avaliacao;
    }

    public void setCodigo_avaliacao(int codigo_avaliacao) {
        this.codigo_avaliacao = codigo_avaliacao;
    }

    public Date getData_ajuste_avaliacao() {
        return data_ajuste_avaliacao;
    }

    public void setData_ajuste_avaliacao(Date data_ajuste_avaliacao) {
        this.data_ajuste_avaliacao = data_ajuste_avaliacao;
    }

    public String getNome_avaliacao() {
        return nome_avaliacao;
    }

    public void setNome_avaliacao(String nome_avaliacao) {
        this.nome_avaliacao = nome_avaliacao;
    }

    public double getPreco_avaliacao() {
        return preco_avaliacao;
    }

    public void setPreco_avaliacao(double preco_avaliacao) {
        this.preco_avaliacao = preco_avaliacao;
    }
    
    
    
}
