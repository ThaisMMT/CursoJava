package com.thais.estudos.teste.exeptions.exceptionteste;

import com.thais.estudos.teste.exeptions.exceptionteste.dominio.Leitor1;
import com.thais.estudos.teste.exeptions.exceptionteste.dominio.Leitor2;

import java.io.IOException;

public class TryWithResourcesTest01 {
    public static void lerArquivo() {

        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){}
    }
}
