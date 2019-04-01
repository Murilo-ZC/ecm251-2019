package com.company;

public class ContaTestDrive {
    public static void main(String[] args) {
        Conta c1 = new Conta("Midori", 150.0);
        Conta c2 = new Conta("Kazu", 200);
        System.out.println("Conta 1:" + c1.pegaDados());
        System.out.println("Conta 2:" + c2.pegaDados());
        System.out.println("Total: " + Conta.getTotalDeContas());
    }
}
