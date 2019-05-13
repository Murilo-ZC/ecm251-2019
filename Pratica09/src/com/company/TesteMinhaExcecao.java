package com.company;

public class TesteMinhaExcecao {
    public static void main(String[] args) {
        String frase = "All Might é melhor que Endevour";
        try {
            testaFrase(frase);
        } catch (SemLetraException e) {
            //e.printStackTrace();
            System.out.println(e);
        }
        System.out.println(frase);
    }

    private static void testaFrase(String frase) throws SemLetraException{
        if( !frase.toUpperCase().contains("B") ){
            throw new SemLetraException();
        }
    }
}
