package com.company.app;

import com.company.model.AnimaisDAO;
import com.company.model.Animal;

import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    private Scanner scanner;
    private List<Animal> animais;
    private Animal animal;
    private void menu(){
        System.out.println("1 - Ja cadastrados");
        System.out.println("2 - Pesquisar");
        System.out.println("3 - Inserir");
        System.out.println("4 - Atualizar");
        System.out.println("5 - Deletar");
        System.out.println("0 - Sair");
    }

    public Aplicacao(){
        scanner = new Scanner(System.in);
    }

    public void run(){
        boolean continuar = true;
        do{
            menu();
            int op = scanner.nextInt();
            switch (op){
                case 0:
                    continuar = false;
                    break;
            }

        }while(continuar);
    }
}
