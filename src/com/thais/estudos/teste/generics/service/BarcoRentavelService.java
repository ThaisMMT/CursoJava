package com.thais.estudos.teste.generics.service;

import com.thais.estudos.teste.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("LoBarquito"), new Barco("BarcoGrandão")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando barco disponivel...");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco" + barco);
        System.out.println("Barco disponiveis: ");
        System.out.println(barcosDisponiveis);
        return barco;

    }

    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo barco" + barco);
        barcosDisponiveis.add(barco);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcosDisponiveis);
    }
}
