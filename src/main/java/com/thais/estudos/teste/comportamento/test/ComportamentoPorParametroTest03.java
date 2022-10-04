package com.thais.estudos.teste.comportamento.test;

import com.thais.estudos.teste.comportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {

    private static List<Car> cars = List.of(new Car("green", 2021), new Car("Red", 2010), new Car("preto", 2022));

    public static void main(String[] args) {

        List <Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(nums,num -> num % 2 ==0));
    }

    private static <T> List<T> filter (List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }


}
