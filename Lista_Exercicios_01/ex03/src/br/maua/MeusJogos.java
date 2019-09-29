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
        System.out.println("3 - Procurar Jogo por Nome");
        System.out.println("4 - Procurar Jogo por Plataforma");
        System.out.println("5 - Procurar Jogo por Genero");
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
        String nome, lancamento, plataforma, genero;
        Jogo jogo = null;

        switch (opcao){
            case 1:
                meusJogos = SingletonJogoDAO.getInstance().getAllJogos();
                meusJogos.forEach(jogo1 -> System.out.println(jogo1));
                break;
            case 2:

                System.out.println("Informe o nome, o ano de lancamento, a plataforma e o genero do jogo para cadastrar:");
                nome = scan.next();
                lancamento = scan.next();
                plataforma = scan.next();
                genero = scan.next();
                jogo = new Jogo(nome,lancamento,genero, plataforma, -1);
                SingletonJogoDAO.getInstance().insertJogo(jogo);
                break;
            case 3:
                System.out.println("Informe o nome do jogo:");
                nome = scan.next();
                meusJogos = SingletonJogoDAO.getInstance().getAllJogosByName(nome);
                meusJogos.forEach(jogo1 -> System.out.println(jogo1));
                break;

            case 4:
                System.out.println("Informe a plataforma do jogo:");
                plataforma = scan.next();
                meusJogos = SingletonJogoDAO.getInstance().getAllJogosByPlataform(plataforma);
                meusJogos.forEach(jogo1 -> System.out.println(jogo1));
                break;

            case 5:
                System.out.println("Informe o genero do jogo:");
                genero = scan.next();
                meusJogos = SingletonJogoDAO.getInstance().getAllJogosByGrender(genero);
                meusJogos.forEach(jogo1 -> System.out.println(jogo1));
                break;

        }
    }

}
