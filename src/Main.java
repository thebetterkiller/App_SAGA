import com.saga.app.Aluno;
import com.saga.app.Aula;
import com.saga.app.Professor;

import java.util.LinkedList;

public class Main {

    public Main() {
        System.out.println("------------ INÍCIO APLICAÇÃO ------------");

        Professor professor1 = new Professor("Marco Ferreira", 1);
        Aula aula1 = new Aula("Programação 2 PL1", 1);
        Aluno aluno1 = new Aluno("José António", 2190354);

        aula1.setProfessor(professor1);
        aula1.adicionar(aluno1);
        aluno1.adicionar(aula1);

        aula1.remover(aluno1);

        professor1.preencherSumario(aula1);

        // Apresentar o sumário da aula 1
        System.out.println("Aula: " + aula1.getSumario());


        LinkedList<Aluno> listaAlunos = new LinkedList<>();
        listaAlunos.add(aluno1);
    }

    public static void main(String[] args) {
        new Main();
    }
}