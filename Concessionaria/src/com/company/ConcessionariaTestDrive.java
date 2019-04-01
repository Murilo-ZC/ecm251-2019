package com.company;

public class ConcessionariaTestDrive {
    public static void main(String[] args) {

        Gerente g1 = new Gerente("Carlos 2", 6500);
        Vendedor v1 = new Vendedor("Joao", 1000,g1);

        double totalVendasMes = 10000;

        System.out.println("Vendedor: ");
        System.out.println("Comissão: " + v1.getComissao(totalVendasMes));
        System.out.println("Gerente: ");
        System.out.println("Comissão: " + g1.getComissao(totalVendasMes));
        if(g1.aumentarSalarioBaseVendedor(v1)){
            System.out.println("Pode dar aumento!");
        } else {
            System.out.println("Sem aumento!");
        }
    }
}
