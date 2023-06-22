package com.thais.estudos.teste.classes.estudo_classe;

public class ProfessorAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Referencia referencia = new Referencia();
        Professor professor = new Professor();

        aluno1.nomeAluno = "Thais Matie";
        aluno1.turmaAluno = " C.C EAD ";

        aluno2.nomeAluno = "Victor";
        aluno2.turmaAluno = "R.C EAD";

        referencia.ImprimeReferencia(aluno1);
        referencia.ImprimeReferencia(aluno2);

        professor.nomeProf = "Pedro Iago";
        professor.materia = "Matematica Aplicada";

        System.out.println("Aluno(a) " + aluno1.nomeAluno + " da turma " + aluno1.turmaAluno +
                " esta matriculado(a) na materia " +
                professor.materia + " ministrada por " + professor.nomeProf);
    }
}
