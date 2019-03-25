package com.company;

public class ContaTestDrive {
    public static void main(String[] args) {
        Conta c1;   //Declara um objeto do tipo conta
        c1 = new Conta(0, "All Might");
        c1.depositar(1000);
        System.out.println("Saldo da conta:" + c1.getSaldo());
        c1.sacar(300);
        c1.depositar(1000);
        System.out.println("Saldo da conta:" + c1.getSaldo());
        Conta c2 = new Conta(1, "Deku", 500);
        Conta c3 = new Conta(2, "Kazu", -800);
        c2.exibirDetalhes();
        c3.exibirDetalhes();
    }
}
