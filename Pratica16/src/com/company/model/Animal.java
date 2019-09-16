package com.company.model;

public class Animal {
    String nome, tipo;
    private int id;
    double lat, lon, altura, peso;

    public Animal(){
        id = -1;
    }
    public Animal(int id){
        this.id = id;
    }


    int getId(){
        return this.id;
    }
}
