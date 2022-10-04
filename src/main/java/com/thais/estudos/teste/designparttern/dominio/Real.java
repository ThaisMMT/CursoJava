package com.thais.estudos.teste.designparttern.dominio;

public class Real implements Currency {
    @Override
    public String getSymbol() {
        return "R$";
    }

}
