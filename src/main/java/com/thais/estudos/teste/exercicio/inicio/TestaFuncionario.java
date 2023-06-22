package com.thais.estudos.teste.exercicio.inicio;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = " Julio";
        funcionario.idade = 30;
        funcionario.salarios = new double[]{2000, 1000, 5000};
        funcionario.mediaSalario();
        funcionario.imprime();


    }
}
