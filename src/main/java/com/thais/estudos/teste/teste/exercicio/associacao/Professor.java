package com.thais.estudos.teste.teste.exercicio.associacao;

public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(Seminario[] seminario) {
        this.seminario = seminario;
    }

    public void imprime(){
        System.out.println("Professor " + this.nome +
                " com especialidade em" + this.especialidade);
        if (seminario == null){
            System.out.println( " O prof° " + this.especialidade +
                    " não esta ministrando nenhum seminario no momento");
            return;
        };
        for (Seminario semin : seminario) {
            System.out.println( "Ministrando o seminario "
                    + semin.getTitulo());
        }


    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
}
