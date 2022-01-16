/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiogg.src.model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author giuliog
 */
public class Banco {
    List<Conta> contas;
    private String nome;
    private int codigo;
    
    public Banco() {
        this.contas = new LinkedList<Conta>();
    }
    
    public void addConta(Conta conta) {
        this.contas.add(conta);
    }
    
    public int getNumeroContasRegistradas() {
        return this.contas.size();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Conta getConta(String codigoConta) {
        int codigoContaInt = Integer.parseInt(codigoConta);
        for (Conta conta : contas) {
            if (conta.getCodigo() == codigoContaInt) {
                return conta;
            }
        }
        
        return null;
    }
    
     public Conta getConta(int codigoConta) {
        for (Conta conta : contas) {
            if (conta.getCodigo() == codigoConta) {
                return conta;
            }
        }
        
        return null;
    }
    
    
}
