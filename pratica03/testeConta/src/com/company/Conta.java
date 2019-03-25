package com.company;

public class Conta {
    private int numero;
    private double saldo;
    private String nome;

    public Conta(int numero, String nome){
        this.nome = nome;
        this.numero = numero;
        this.saldo = 0;
    }

    public Conta(int numero, String nome, double saldo){
        this.nome = nome;
        this.numero = numero;
        depositar(saldo);
    }

    public int getNumero(){
        return numero;
    }

    public String getNome(){
        return nome;
    }

    public void sacar(double valor){
        if(saldo >= valor)
            saldo = saldo - valor;
    }

    public void depositar(double valor){
        if (valor > 0)
            saldo += valor;
    }

    public double getSaldo(){
        return saldo;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: "+getNome() +
        " Saldo: " + getSaldo());
    }
}
