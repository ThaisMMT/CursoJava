package com.thais.estudos.teste.generics.test;

import com.thais.estudos.teste.generics.dominio.Barco;
import com.thais.estudos.teste.generics.dominio.Carro;
import com.thais.estudos.teste.generics.service.CarroRentavelService;
import com.thais.estudos.teste.generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("LoBarquito"), new Barco("BarcoGrandão")));
        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mes: ");
        rentalService.retornarObjetoAlugado(carro);

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mes: ");
        rentalServiceBarco.retornarObjetoAlugado(barco);


    }
}
