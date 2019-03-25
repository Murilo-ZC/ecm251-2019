package com.company;

public class Cliente {
    private String nome;
    private String RA;
    private boolean funcionario;
    private boolean visitante;

    public String getNome() {
        return nome;
    }

    public String getRA() {
        return RA;
    }

    public boolean isFuncionario() {
        return funcionario;
    }

    public boolean isVisitante() {
        return visitante;
    }

    public Cliente(String nome){
        this.nome = nome;
        this.visitante = true;
    }

    public Cliente(String nome, boolean funcionario){
        this.nome = nome;
        if(funcionario)
            this.funcionario = funcionario;
        else
            visitante = true;
    }

    public Cliente(String nome, String ra){
        this.nome = nome;
        this.RA = ra;
    }
}
