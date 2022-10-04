package com.thais.estudos.teste.Oexception.exceptionteste;

import com.thais.estudos.teste.Oexception.exceptionteste.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }

    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Thais";
        String senhaDB = "ssj";
        System.out.println("Usuario ");
        String userNameDigitado = teclado.nextLine();
        System.out.println("Senha ");
        String senhaDigitada = teclado.nextLine();

        if (!usernameDB.equals(userNameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuario ou senha invalidos");
        }
        System.out.println("usuario logado com sucesso");
    }
}
