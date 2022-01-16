/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiogg.src.controller;

import com.mycompany.desafiogg.src.model.Banco;
import com.mycompany.desafiogg.src.model.Conta;


public class ContaController {
    private Banco banco;
    
    public ContaController(Banco banco) {
        this.banco = banco;
    }
    
    public void cadastrarConta(String titular, String cpfTitular) {
        Conta conta = new Conta();
        conta.setCodigo(this.banco.getNumeroContasRegistradas() + 1);
        conta.setSaldo(0);
        conta.setTitular(titular);
        conta.setCpfTitular(cpfTitular);
        
        this.banco.addConta(conta);
    }
}
