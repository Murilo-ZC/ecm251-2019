package com.company;

public abstract class Usuario implements Autenticar {
    protected String nome, email, senha;

    public Usuario(String nome, String email, String senha){
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public String getNome(){ return this.nome; }
    public String getEmail(){ return this.email; }
}
