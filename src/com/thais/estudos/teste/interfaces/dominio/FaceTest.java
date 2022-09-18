package com.thais.estudos.teste.interfaces.dominio;

public class FaceTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        databaseLoader.remover();
        fileLoader.load();
        databaseLoader.remover();

        databaseLoader.checkPermisson();
        fileLoader.checkPermisson();

        DataLoader.ritrieveMaxDataSize();
        DatabaseLoader.ritrieveMaxDataSize();





    }
}
