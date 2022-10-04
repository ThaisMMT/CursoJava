package com.thais.estudos.teste.polimorfismo.teste;

import com.thais.estudos.teste.polimorfismo.dominio.Computador;
import com.thais.estudos.teste.polimorfismo.dominio.Produto;
import com.thais.estudos.teste.polimorfismo.dominio.Tomate;
import com.thais.estudos.teste.polimorfismo.dominio.Tv;
import com.thais.estudos.teste.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("Dell" , 9800);
        Tomate tomate = new Tomate("Siciliano", 3.00);
        Tv tv = new Tv("Samsung 70\" ", 12000);


        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(tv);
        CalculadoraImposto.calcularImposto(computador);

    }
}
