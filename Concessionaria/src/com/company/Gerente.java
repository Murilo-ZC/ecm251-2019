package com.company;

public class Gerente {
    private double salarioBase;
    private double porcentagemDeComissao;
    private String nome;

    public Gerente(String nome, double salarioBase){
        this.nome = nome;
        this.porcentagemDeComissao = 0.1;
        this.salarioBase = salarioBase;
    }

    public double getSalarioMes(double totalDeVendas){
        return getComissao(totalDeVendas)
                + this.salarioBase;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }

    public double getComissao(double totalDeVendas){
        return this.porcentagemDeComissao * totalDeVendas + 0.5 * this.salarioBase;
    }

    public boolean aumentarSalarioBaseVendedor(Vendedor vendedor){
        if(vendedor.getGerente().equals(this)){
            return true;
        } else {
            return false;
        }
    }
}
