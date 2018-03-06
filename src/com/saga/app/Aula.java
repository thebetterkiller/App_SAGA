package com.saga.app;

import java.util.LinkedList;

public class Aula {
    protected String nome;
    protected long numero;
    protected String sumario;
    Professor professor;
    LinkedList<Aluno> listaAlunos = new LinkedList<Aluno>();

    public Aula(String nome, long numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public Aula(String nome, long numero, Professor professor, LinkedList<Aluno> listaAlunos) {
        this.nome = nome;
        this.numero = numero;
        this.professor = professor;
        this.listaAlunos = listaAlunos;
    }

    public void adicionar(Aluno aluno) {
        this.listaAlunos.add(aluno);
    }

    public void remover(Aluno aluno) {
        this.listaAlunos.remove(aluno);
    }

    public void remover(Professor professor) {
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public void desassociarProfessor(){
        this.professor = null;
    }

    public void adicionarLinhaSumario(String linha){
        this.sumario += linha;
    }

    public String getSumario(){
        return this.sumario;
    }
}
