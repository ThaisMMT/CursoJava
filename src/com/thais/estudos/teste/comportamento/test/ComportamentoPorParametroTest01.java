package com.thais.estudos.teste.comportamento.test;

import com.thais.estudos.teste.comportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
  private static   List<Car> cars = List.of(new Car("green", 2021), new Car("Red", 2010), new Car("preto", 2022));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));

    }



    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Green")) {
                greenCars.add(car);
            }

        }
        return greenCars;
    }
}
