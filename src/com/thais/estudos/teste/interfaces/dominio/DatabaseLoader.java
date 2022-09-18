package com.thais.estudos.teste.interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados do bd");

    }

    public static void ritrieveMaxDataSize(){
        System.out.println("Dentro da classe");
    };
}
