package com.thais.estudos.teste.Oexception.exceptionteste.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor1 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("leitor1");
    }
}
