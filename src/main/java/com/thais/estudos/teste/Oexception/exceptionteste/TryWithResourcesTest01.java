package com.thais.estudos.teste.Oexception.exceptionteste;

import com.thais.estudos.teste.Oexception.exceptionteste.dominio.Leitor1;
import com.thais.estudos.teste.Oexception.exceptionteste.dominio.Leitor2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourcesTest01 {
    public static void lerArquivo() {

        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){}
    }
}
