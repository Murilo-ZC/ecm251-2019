package br.maua;

import DAO.SingletonJogoDAO;
import Model.Jogo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MeusJogos {

    private List<Jogo> meusJogos;
    private Scanner scan;

    public MeusJogos(){
        meusJogos = new ArrayList<>();
        scan = new Scanner(System.in);
    }

    public void menu(){
        System.out.println("1 - Jogos Cadastrados");
        System.out.println("2 - Cadastrar Novo Jogo");
        System.out.println("0 - Sair");
        System.out.println("Opcao:");
    }

    public void mainLoop(){
        int opcao;
        while(true){
            try {
                menu();
                opcao = scan.nextInt();
                if (opcao == 0)
                    break;
                else
                    avaliarEscolha(opcao);
            }
            catch (InputMismatchException e){
                System.out.println("Opção Inaválida Escolhida");
                break;
            }
        }
    }

    private void avaliarEscolha(int opcao) {
        switch (opcao){
            case 1:
                meusJogos = SingletonJogoDAO.getInstance().getAllJogos();
                for (Jogo jogo :
                        meusJogos) {
                    System.out.println(jogo);
                }
                break;
            case 2:
                String nome, lancamento, plataforma, genero;
                System.out.println("Informe o nome, o ano de lancamento, a plataforma e o genero do jogo para cadastrar:");
                nome = scan.next();
                lancamento = scan.next();
                plataforma = scan.next();
                genero = scan.next();
                Jogo jogo = new Jogo(nome,lancamento,genero, plataforma, -1);
                SingletonJogoDAO.getInstance().insertJogo(jogo);
                break;
        }
    }

}
