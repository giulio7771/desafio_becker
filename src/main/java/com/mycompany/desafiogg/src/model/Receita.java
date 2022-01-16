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
public class Receita implements MovimentacaoFinanceira{
    
    private Currency valor;
    private LocalDate dataRecebimento;
    private LocalDate dataRecebimentoEsperado;
    private String descricao;

    @Override
    public Currency getValor() {
        return valor;
    }

    public void setValor(Currency valor) {
        this.valor = valor;
    }

    public LocalDate getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(LocalDate dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public LocalDate getDataRecebimentoEsperado() {
        return dataRecebimentoEsperado;
    }

    public void setDataRecebimentoEsperado(LocalDate dataRecebimentoEsperado) {
        this.dataRecebimentoEsperado = dataRecebimentoEsperado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
