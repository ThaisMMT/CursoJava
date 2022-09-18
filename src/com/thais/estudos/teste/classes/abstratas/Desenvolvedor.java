package com.thais.estudos.teste.classes.abstratas;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo...");
    }

    @Override
    public void calculaBonus() {

    }
}
