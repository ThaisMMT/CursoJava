package com.thais.estudos.teste.interfaces.dominio;

public interface DataLoader {

    public static final int MAX_DATA_SIZE = 10;
    void load();
    default void checkPermisson(){
        System.out.println("Fazendo checagem de permissões ");
    }

    public static void ritrieveMaxDataSize(){
        System.out.println("Dentro da interface");
    };

}
