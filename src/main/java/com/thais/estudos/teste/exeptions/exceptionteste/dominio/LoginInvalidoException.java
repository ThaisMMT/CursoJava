package com.thais.estudos.teste.exeptions.exceptionteste.dominio;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super("Login invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
