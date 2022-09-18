package com.thais.estudos.teste.introcucao;

import java.util.Scanner;

public class LeituraTeclado {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome " );
        String nome =ler.nextLine();

        System.out.println(" Digite sua idade ");
        int idade = ler.nextInt();

        System.out.println(" Digite seu sexo: M ou F");
        char sexo = ler.next().charAt(0);

        System.out.println("------------------------");
        System.out.println("Nome: " + nome +
                " Idade:" + idade +
                " Sexo: " + sexo);

    }
}
