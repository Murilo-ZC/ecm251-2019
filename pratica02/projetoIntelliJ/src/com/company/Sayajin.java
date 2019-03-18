package com.company;

public class Sayajin {
    String nome;
    double ki;
    boolean odio;
    int nivelDeSuper;
    public void treinar(){
        if (odio)
            ki *= 1.2;
        else
            ki = ki * 1.1;
        System.out.println("Depois do treino o poder de luta é: " + ki);
    }
    public String pegarCorDoCabelo(){
        String resultado;
        if(nivelDeSuper == 0)
            resultado = "Preto";
        else if(nivelDeSuper > 0 && nivelDeSuper <= 3)
            resultado = "Amarelo";
        else
            resultado = "Azul";
        return resultado;
    }
}
