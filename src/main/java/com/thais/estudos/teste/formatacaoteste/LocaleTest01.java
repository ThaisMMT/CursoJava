package com.thais.estudos.teste.formatacaoteste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeBr = new Locale("pt", "BR");
        Locale localItaly = new Locale("it","IT");
        Locale localJp = new Locale("ja","JP");
        Locale localIndia = new Locale("hi","IN");
        Locale localeEUA = new Locale("en", "USA");

        Calendar calendar = Calendar.getInstance();
        DateFormat it = DateFormat.getDateInstance(DateFormat.FULL, localItaly);
        DateFormat usa = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.SHORT , localeEUA);
        DateFormat br = DateFormat.getDateInstance(DateFormat.FULL, localeBr);
        DateFormat in = DateFormat.getDateInstance(DateFormat.FULL, localIndia);
        DateFormat jp = DateFormat.getTimeInstance(DateFormat.FULL, localJp);
        System.out.println("Brasil " + br.format(calendar.getTime()));
        System.out.println("Italia " + it.format(calendar.getTime()));
        System.out.println("India " + in.format(calendar.getTime()));
        System.out.println(" Japão " + jp.format(calendar.getTime()));
        System.out.println(" Estados Unidos " + usa.format(calendar.getTime()));

        System.out.println(localeBr.getDisplayCountry(localJp));
        System.out.println(localeBr.getDisplayCountry(localeBr));
    }
}
