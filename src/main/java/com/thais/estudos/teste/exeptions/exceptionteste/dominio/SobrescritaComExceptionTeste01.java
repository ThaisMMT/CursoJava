package com.thais.estudos.teste.exeptions.exceptionteste.dominio;

public class SobrescritaComExceptionTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}
