package com.fiap;

import com.fiap.dao.JpaDAO;
import com.fiap.model.Aluno;
import com.fiap.model.Professor;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("557312");
        Professor professor = new Professor("Marcel");
        JpaDAO jpaDAO = new JpaDAO();
        jpaDAO.pesquisar(aluno);
        jpaDAO.pesquisar(professor);
    }
}