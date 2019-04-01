package com.company;

public class Conta {
    private double saldo;
    private int numeroConta;
    private String nome;

    private static int totalDeContas = 0;

    public String pegaDados(){
        return "Saldo:" + this.saldo +
                " Número: " + this.numeroConta+
                " Nome:" + this.nome;
    }

    public Conta(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
        this.numeroConta = Conta.totalDeContas;
        Conta.totalDeContas++;
    }

    public static int getTotalDeContas(){
        return Conta.totalDeContas;
    }
}
