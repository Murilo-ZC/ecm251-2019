package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("inicio da Main");
        metodo1();
        System.out.println("fim da Main");
    }

    static void metodo1() {
        System.out.println("inicio da metodo1");
        try {
            metodo2();
        }
        catch (Exception e){
            System.out.println("Excecao pega no metodo 1");
            System.out.println(e);
        }
        finally {
            System.out.println("Depois do TryCatch Metodo 1");
        }
        System.out.println("fim da metodo1");
    }

    static void metodo2() throws ArrayIndexOutOfBoundsException {
        System.out.println("inicio da metodo2");
        int [] array = new int[10];
        try {
            for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println(i);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Algo deu errado:");
            System.out.println(e);
            throw (e);
        }
        finally {
            System.out.println("Depois do TryCatch Metodo2");
        }
        System.out.println("fim da metodo2");
    }

//    static void metodo2() {
//        System.out.println("inicio da metodo2");
//        int [] array = new int[10];
//        for (int i = 0; i <= 15; i++) {
//
//            try {
//                array[i] = i;
//            }
//            catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("Algo deu errado:");
//                System.out.println(e);
//            }
//
//            System.out.println(i);
//        }
//
//        System.out.println("fim da metodo2");
//    }

//    static void metodo2() {
//        System.out.println("inicio da metodo2");
//        int [] array = new int[10];
//        for (int i = 0; i <= 15; i++) {
//            array[i] = i;
//            System.out.println(i);
//        }
//
//        System.out.println("fim da metodo2");
//    }
}
