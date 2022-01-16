package com.mycompany.desafiogg.src.model;

import java.time.LocalDate;
import java.util.Currency;

public class Despesa implements MovimentacaoFinanceira{
    
    private int tipoDespesaId;
    private float valor;
    private LocalDate data;

    public int getTipoDespesaId() {
        return tipoDespesaId;
    }

    public void setTipoDespesaId(int tipoDespesaId) {
        this.tipoDespesaId = tipoDespesaId;
    }

    @Override
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    
}
