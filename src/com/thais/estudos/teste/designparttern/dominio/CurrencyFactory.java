package com.thais.estudos.teste.designparttern.dominio;

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
        switch (country) {
            case USA:
                return new UsDollar();
            case BRAZIL:
                return new Real();
            default:
                throw new IllegalArgumentException("Não há moeda para esse pais");
        }
    }
}
