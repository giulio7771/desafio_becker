package com.mycompany.desafiogg.src.model;

import java.util.LinkedList;
import java.util.List;


public class Conta {
    
    private float saldo;
    private String titular;
    private int codigo;
    private String cpfTitular;
    private List<MovimentacaoFinanceira> movimentacoes;
    
    public Conta() {
        this.movimentacoes = new LinkedList<MovimentacaoFinanceira>();
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<MovimentacaoFinanceira> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(List<MovimentacaoFinanceira> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }
    
    public void setCpfTitular(String cpf) {
        this.cpfTitular = cpf;
    }
    
    public String getCpfTitular() {
        return this.cpfTitular;
    }
    
    public void addMovimentacaoFinanceira(MovimentacaoFinanceira mov) {
        this.movimentacoes.add(mov);
    }
    
}
