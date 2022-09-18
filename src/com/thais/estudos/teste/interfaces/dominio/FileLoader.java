package com.thais.estudos.teste.interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remover() {
        System.out.println("Deletando dados de um arquivo");
    }

    @Override
    public void checkPermisson() {
        System.out.println("Checando permissões no bd");
    }
}
