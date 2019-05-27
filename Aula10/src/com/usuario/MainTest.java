package com.usuario;

public class MainTest {
    public static void main(String[] args) {
        User u1 = new User("Rafa", "rafa123!");
        System.out.println(u1);
        Pentelho p1 = new Pentelho();
        p1.Pentelhar(u1);
        System.out.println(u1);
    }
}
