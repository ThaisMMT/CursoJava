package com.thais.estudos.teste.teste.exercicio.associacao;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(Seminario seminario) {
        this.seminario = seminario;
    }

    public void imprimir() {
        System.out.println(this.nome +
                " idade " + this.idade + " anos");
        if (seminario == null) {
            System.out.println(this.nome + "Não esta participando de nenhum seminario");
        } else {
            System.out.println(this.nome + " esta esta participando do seminario " +
                    seminario.getTitulo());
        }
    }

    ;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
