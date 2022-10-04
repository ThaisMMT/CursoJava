package com.thais.estudos.teste.Oexception.errorteste;

public class StackOverFlowTest {
    public static void main(String[] args) {
        rescursividade();

    }

    public static void rescursividade() {
     rescursividade();
    }

}
