package com.thais.estudos.teste.polimorfismo.dominio;

public class Tv extends Produto{

    public static final double IMPOSTO_POR_CENTO= 0.21;
    public Tv(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da tv");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
