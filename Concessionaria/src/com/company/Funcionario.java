package com.company;

public class Funcionario {
    private double salarioBase;
    private double porcentagemDeComissao;
    private String nome;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.porcentagemDeComissao = 0.05;
        this.salarioBase = salarioBase;
    }

    public double getSalarioMes(double totalDeVendas){
        return this.porcentagemDeComissao
                *totalDeVendas
                + this.salarioBase;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }

    public double getComissao(double totalDeVendas){
        return this.porcentagemDeComissao * totalDeVendas;
    }
}
