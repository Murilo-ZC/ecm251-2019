package com.company;

public class Item {
    private int id;
    private String nome;

    public Item(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " ID - " + this.id;
    }
}
