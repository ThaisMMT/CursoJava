package com.thais.estudos.teste.teste.exercicio.associacao;

public class Seminario {

    private String titulo;

    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(Aluno[] alunos, Local local) {
        this.alunos = alunos;
        this.local = local;
    }

    public void imprimir(){
        System.out.println("Seminario " + this.titulo);

        if (local == null){
            System.out.println("O seminario " + this.titulo
                    +" ainda não tem um endereço definido");
        } else {
            System.out.println(" O seminario " + this.titulo
                    + " sera realizado no enderço: "
                    +local.getEndereco());
        };


        if (alunos != null){
            System.out.println("Alunos que estão participando do seminario " + this.titulo);
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
        } else {
            System.out.println("Nenhuma alunos esta participando do seminario " + this.titulo);
        };

    };

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
