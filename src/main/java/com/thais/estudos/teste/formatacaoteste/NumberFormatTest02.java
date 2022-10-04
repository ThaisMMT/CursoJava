package com.thais.estudos.teste.formatacaoteste;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localeIT);
        nfa[3] = NumberFormat.getCurrencyInstance(localePT);

        double valor = 10_000.2130;


        for (NumberFormat numberFormat : nfa) {
           numberFormat.setMinimumFractionDigits(2);
            System.out.println(numberFormat.format(valor));

        }

        String valorString ="￥10,000.21";

        try {
            System.out.println( nfa[1].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
