package com.company;

public class Main {

    public static void main(String[] args) {
        Sayajin s1;
        s1 = new Sayajin();
        s1.nome = "Vegeta";
        Sayajin s2 = new Sayajin();
        s2.nome = "Brolly";
        s1.odio = true;
        s1.ki = 1000.;
        s2.ki = 1000000.;
        System.out.println(s1.nome);
        s1.treinar();
        System.out.println(s2.nome);
        s2.treinar();
    }
}
