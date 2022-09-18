package com.thais.estudos.teste.introcucao;

public class EstudoTeste {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas ele pode ser parcelado.
        // condição valorParcela >= 1000


        double valorTotal = 70000.00;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            int valorParcela = (int) valorTotal / parcela;
            if(valorParcela< 1000) {
                break;
            }
            System.out.println("Parcelado em: " + parcela + " de " + valorParcela + " vezes.");

//            if (valorParcela >= 1000) {
//                System.out.println("Parcelado em: " + parcela + " de " + valorParcela + " vezes.");
//            } else {
//                break;
//            }
        }

//        int nota1 = 0;
//        int nota2 = 8;
//        int notaSoma = (nota2 + nota1) / 2;
//
//        int nota3 = 2;
//        int nota4 = 9;
//        int somaSegunda = (nota3 + nota4) / 2;

//        while (nota1 <= 8) {
//            System.out.println(nota1);
//            nota1++;
//        }


//        System.out.println("Sua nota é " + notaSoma + " E a resposta é " + somaSegunda);


    }
}
