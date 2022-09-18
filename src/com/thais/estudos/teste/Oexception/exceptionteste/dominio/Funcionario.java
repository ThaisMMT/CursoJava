package com.thais.estudos.teste.Oexception.exceptionteste.dominio;

public class Funcionario extends Pessoa {
    public void salvar() throws LoginInvalidoException{
        System.out.println("Salvando Funcionario");
    }
}
