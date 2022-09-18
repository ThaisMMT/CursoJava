package com.thais.estudos.teste.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTImeTeste01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.of(2022, Month.AUGUST,6);
        LocalDate date = LocalDate.parse("2022-06-09");
        LocalTime time = LocalTime.of(9,45,21);
        LocalTime time2 = LocalTime.parse("09:45:00");
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time2);
        LocalDateTime ldt1 = date.atTime(time2);
        LocalDateTime ldt2 = time2.atDate(date);
        System.out.println(ldt1);
        System.out.println(ldt2);



    }
}
