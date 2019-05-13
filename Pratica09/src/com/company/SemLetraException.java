package com.company;

public class SemLetraException extends Exception {
    @Override
    public String getMessage() {
        return "Não tem a letra B";
    }
}
