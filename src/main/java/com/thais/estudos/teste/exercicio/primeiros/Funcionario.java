package com.thais.estudos.teste.exercicio.primeiros;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime (){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }

    }

    public void mediaSalario(){
        double media = 0;
        for(double i : salarios){
            media =+ i;
        }

        media /= salarios.length;
        System.out.println(" Media Salarial " + media);

    }



}
