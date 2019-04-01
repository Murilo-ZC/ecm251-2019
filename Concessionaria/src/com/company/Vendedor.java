package com.company;

public class Vendedor {
    private double salarioBase;
    private double porcentagemDeComissao;
    private String nome;
    private Gerente gerente;

    public Vendedor(String nome, double salarioBase, Gerente gerente){
        this.nome = nome;
        this.porcentagemDeComissao = 0.05;
        this.salarioBase = salarioBase;
        this.gerente = gerente;
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

    public Gerente getGerente(){
        return gerente;
    }
}
