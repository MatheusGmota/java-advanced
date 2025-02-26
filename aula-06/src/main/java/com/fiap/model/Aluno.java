package com.fiap.model;

import com.fiap.annotations.Tabela;

@Tabela(nome="TAB_ALUNO")
public class Aluno {
    private String rm;

    public Aluno(String rm) {
        this.rm = rm;
    }

    public String getRm() {
        return rm;
    }
}
