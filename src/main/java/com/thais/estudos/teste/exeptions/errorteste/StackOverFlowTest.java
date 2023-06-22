package com.thais.estudos.teste.exeptions.errorteste;

public class StackOverFlowTest {
    public static void main(String[] args) {
        rescursividade();

    }

    public static void rescursividade() {
     rescursividade();
    }

}
