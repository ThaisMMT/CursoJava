package com.thais.estudos.teste.introcucao;

public class Calculadora {

    public void somaArgs(int... arrayArgs) {
        int soma = 0;
        for (int num : arrayArgs) {
            soma += num;

        }

        System.out.println(soma);


    }
}
