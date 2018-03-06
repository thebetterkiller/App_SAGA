package com.saga.app;

public class Professor {

    private String nome;
    private long numero;
    private java.util.LinkedList<Aula> listaAulas;

    public Professor(String nome, long numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public void preencherSumario(Aula aula) {
        if(aula.sumario==null) {
            aula.sumario = aula.nome + "\n" + aula.numero + "\n";
}
        aula.adicionarLinhaSumario(this.nome+"\n");

        /* String sumario:
        nome
        numero
        assinatura prof
        lista assinatura alunos
        */
    }

    public void adicionar(Professor professor) {
    }

    public void remover(Professor professor) {
    }

}
