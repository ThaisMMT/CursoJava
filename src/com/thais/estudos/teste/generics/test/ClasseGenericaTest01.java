package com.thais.estudos.teste.generics.test;

import com.thais.estudos.teste.generics.dominio.Carro;
import com.thais.estudos.teste.generics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {

        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mes: ");
        carroRentavelService.retornarCarroAlugado(carro);

    }
}
