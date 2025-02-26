package com.fiap.dao;

import com.fiap.annotations.Tabela;

public class JpaDAO {
    public void pesquisar(Object obj) {
        Tabela anotacao = obj.getClass().getAnnotation(Tabela.class);
        System.out.println("SELECT * FROM " + anotacao.nome());
    }
}
