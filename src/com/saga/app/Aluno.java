package com.saga.app;

import java.util.LinkedList;

public class Aluno {
    private String nome;
    private long numero;
    LinkedList<Aula> listaAulas = new LinkedList<Aula>();

    public Aluno(String nome, long numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public void preencherSumario(Aula aula){
    }

    public void adicionar(Professor professor) {
    }

    public void remover(Professor professor) {
    }

    public void adicionar(Aula aula) {
        this.listaAulas.add(aula);
    }

    public void remover(Aula aula) {
        this.listaAulas.remove(aula);
    }

}
