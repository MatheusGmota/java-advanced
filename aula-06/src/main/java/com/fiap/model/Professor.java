package com.fiap.model;

import com.fiap.annotations.Tabela;

@Tabela(nome="TAB_PROFESSOR")
public class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

}
