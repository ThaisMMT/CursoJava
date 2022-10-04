package com.thais.estudos.teste.designparttern.test;

import com.thais.estudos.teste.designparttern.dominio.Country;
import com.thais.estudos.teste.designparttern.dominio.Currency;
import com.thais.estudos.teste.designparttern.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
