package com.thais.estudos.teste.Oexception.rumtime.teste;

import java.sql.SQLOutput;

public class RuntimeExceptionTeste03 {
    public static void main(String[] args) {

        abreConexao();
        abreConexao2();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexao aberta";

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando o recurso liberado pelo SO");
        }
        return null;
    }

    private static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");


        } finally {
            System.out.println("Fechando o recurso liberado pelo SO");
        }
    }


}
