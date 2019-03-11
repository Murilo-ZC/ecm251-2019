package com.company;

import java.util.Scanner;

public class MeuCadastro {
    public static void main(String[] args) {
        String nome, funcao;
        int idade;
        double salario;
        //Pega os dados do teclado
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        boolean continuar = true;
        while(continuar) {
            //scanner.reset();
            System.out.println("Informe o nome do usuário:");
            nome = scanner.next();
            System.out.println("Informe sua função:");
            funcao = scanner.next();
            System.out.println("Informe sua idade:");
            idade = scanner.nextInt();
            System.out.println("Informe seu salário:");
            salario = scanner.nextDouble();
            scanner.nextLine();
            System.out.printf(
                    "Nome: %s\nFunção:%s\nIdade:%d\nSalário: R$%.2f",
                    nome,   //Nome do usuário
                    funcao, //Cargo do usuário
                    idade,  //Idade do usuario
                    salario //Salário do usuário
            );
            String resposta;
            System.out.println("Deseja continuar?");
            resposta = scanner.next();
            if(resposta.equalsIgnoreCase("SIM"))
                continuar = true;
            else
                continuar = false;
        }

    }
}
