package com.thais.estudos.teste.formatacaoteste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Brasil' dd 'de' MMM 'de' YYYY";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        try {
            System.out.println(sdf.parse("Brasil 23 de Agosto de 2022"));
        }catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
