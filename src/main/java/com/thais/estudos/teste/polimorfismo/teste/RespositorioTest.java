package com.thais.estudos.teste.polimorfismo.teste;

import com.thais.estudos.teste.polimorfismo.respositorio.Repositorio;
import com.thais.estudos.teste.polimorfismo.servico.RepsoitorioBD;

import java.util.ArrayList;
import java.util.List;

public class RespositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepsoitorioBD();
        repositorio.salvar();

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("4");

    }
}
