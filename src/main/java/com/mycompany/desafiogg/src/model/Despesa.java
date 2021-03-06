/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiogg.src.model;

import java.time.LocalDate;
import java.util.Currency;

/**
 *
 * @author giuliog
 */
public class Despesa implements MovimentacaoFinanceira{
    
    private int tipoDespesaId;
    private Currency valor;
    private LocalDate data;

    public int getTipoDespesaId() {
        return tipoDespesaId;
    }

    public void setTipoDespesaId(int tipoDespesaId) {
        this.tipoDespesaId = tipoDespesaId;
    }

    @Override
    public Currency getValor() {
        return valor;
    }

    public void setValor(Currency valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    
}
