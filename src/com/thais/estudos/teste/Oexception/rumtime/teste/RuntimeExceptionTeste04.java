package com.thais.estudos.teste.Oexception.rumtime.teste;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTeste04 {
    public static void main(String[] args) {

        try {
            throw new ArithmeticException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
           e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }


        try {
            talvezlanceException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    private static void talvezlanceException() throws SQLException, FileNotFoundException {

    }

}
