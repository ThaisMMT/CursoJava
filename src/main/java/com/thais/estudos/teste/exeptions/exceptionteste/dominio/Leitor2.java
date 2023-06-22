package com.thais.estudos.teste.exeptions.exceptionteste.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor2 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("leitor2");
    }
}
