package com.company;

public class Conta {
    int numero;
    String titular, cpf;
    double saldo;

    public void visualizarSaldo(){
        System.out.println("Conta: " + numero + " com Saldo R$:" + saldo);
    }

    public void depositar(double valorParaDepositar){
        saldo += valorParaDepositar;
    }

    public void sacar(double valorParaSacar){
        saldo -= valorParaSacar;
    }

    public void transferirDinheiro(double valor, Conta beneficiado){
        sacar(valor);
        beneficiado.depositar(valor);
    }
}
