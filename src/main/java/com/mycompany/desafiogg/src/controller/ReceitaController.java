/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiogg.src.controller;

import com.mycompany.desafiogg.src.model.Banco;
import com.mycompany.desafiogg.src.model.Receita;
import java.time.LocalDate;


public class ReceitaController {
    
    private Banco banco;
    
    public ReceitaController(Banco banco) {
        this.banco = banco;
    }
    
    public void cadastrarReceita(
            String codigoConta,
            String valor, 
            String dataRecebimento, 
            String dataRecebimentoEsperado, 
            String descricao) 
    {
        Receita receita = new Receita();
        receita.setDataRecebimento(LocalDate.parse(dataRecebimento));
        receita.setDataRecebimentoEsperado(LocalDate.parse(dataRecebimentoEsperado));
        receita.setValor(Integer.parseInt(valor));
        
        this.banco.getConta(codigoConta).addMovimentacaoFinanceira(receita);
    }
    
}
