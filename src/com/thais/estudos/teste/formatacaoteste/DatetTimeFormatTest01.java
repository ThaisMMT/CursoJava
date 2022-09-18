package com.thais.estudos.teste.formatacaoteste;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DatetTimeFormatTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20220826", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2022-08-26", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2022-08-26", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String  s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2022-08-26T11:57:30", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        //dd/MM/aaa - Brasil
        //MM/dd/yyyy - EUA
        //yyyy/MM/dd - Japão

        DateTimeFormatter formatterBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBrasil = LocalDateTime.now().format(formatterBrasil);
        System.out.println(formatBrasil);
        LocalDate parseBR = LocalDate.parse("19/08/2022",formatterBrasil);
        System.out.println(parseBR);

        DateTimeFormatter formatterCH = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.CHINA);
        String formatCH = LocalDate.now().format(formatterCH);
        System.out.println(formatCH);
        LocalDate parseCH = LocalDate.parse("26.八月.2022", formatterCH);
        System.out.println(parseCH);
    }
}
