package com.thais.estudos.teste.teste.exercicio.associacao;

public class TesteSeminario {
    public static void main(String[] args) {
        Seminario seminario = new Seminario("Metodologia Scrum");
        Seminario[] seminarios = {seminario};
        Professor professor = new Professor("Raphael", " Metodologia Ageis");
        Aluno aluno = new Aluno("Adrian",28);
        Aluno[] alunos = {aluno};
        Local local = new Local("Rua da Sabedoria, n° 4213, SP");

        aluno.setSeminario(seminario);
        professor.setSeminario(seminarios);
        seminario.setAlunos(alunos);
        seminario.setLocal(local);

        seminario.imprimir();
        System.out.println("--------------------");
        professor.imprime();
        System.out.println("---------------------");
        aluno.imprimir();

    }

}
