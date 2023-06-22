package com.thais.estudos.teste.comportamento_por_parametro.test;

import com.thais.estudos.teste.comportamento_por_parametro.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("green", 2021), new Car("Red", 2010), new Car("preto", 2022));

    public static void main(String[] args) {


        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));

            System.out.println(greenCars);


    }

    private static List<Car> filter(List<Car> cars, Predicate<Car> carsPredicate) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (carsPredicate.test(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }


}
