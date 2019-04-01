package com.company;

public class TestDriveFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Carlos", 1000);
        System.out.println("Salario Mes:" +
        f1.getSalarioMes(10000));
    }
}
