package com.thais.estudos.teste.Oexception.rumtime.teste;

public class RunTimeExceptionTest2 {

    public static void main(String[] args) {
        System.out.println(divisao(6,0));
    }
    private static int divisao(int a, int b) {

       if (b ==0){
           throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
       }
       return  a/b;

//        try {
//            return a / b;
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }
//        return 0;


    }
}
