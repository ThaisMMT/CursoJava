package com.thais.estudos.teste.introcucao;

import java.util.Scanner;

public class ExercicioTeclado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("O grande software que preve o futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou não");
        String pergunta = input.nextLine();

        if (pergunta.charAt(0) ==' '){
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}
