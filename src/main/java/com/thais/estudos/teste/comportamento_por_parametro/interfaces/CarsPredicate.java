package com.thais.estudos.teste.comportamento_por_parametro.interfaces;

import com.thais.estudos.teste.comportamento_por_parametro.dominio.Car;

@FunctionalInterface
public interface CarsPredicate {
    boolean test (Car car);
}

