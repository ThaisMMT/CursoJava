package com.thais.estudos.teste.comportamento.interfaces;

import com.thais.estudos.teste.comportamento.dominio.Car;

@FunctionalInterface
public interface CarsPredicate {
    boolean test (Car car);
}

