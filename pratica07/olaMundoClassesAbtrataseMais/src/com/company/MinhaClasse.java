package com.company;

public class MinhaClasse {
    private int valor;
    private String nome;

    public MinhaClasse(int valor, String nome){
        this.valor = valor;
        this.nome = nome;
    }

    @Override
    public String toString(){
        return nome + '\t' + valor;
    }
}
