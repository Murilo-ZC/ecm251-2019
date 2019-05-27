package com.company;

public class Cliente {
    public String nome;
    public Cliente(String nome){
        this.nome= nome;
    }

    @Override
    public String toString() {
        return "Pacote Principal:" + nome;
    }
}
