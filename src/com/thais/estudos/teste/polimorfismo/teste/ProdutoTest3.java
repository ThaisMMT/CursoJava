package com.thais.estudos.teste.polimorfismo.teste;

import com.thais.estudos.teste.polimorfismo.dominio.Computador;
import com.thais.estudos.teste.polimorfismo.dominio.Produto;
import com.thais.estudos.teste.polimorfismo.dominio.Tomate;
import com.thais.estudos.teste.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest3 {
    public static void main(String[] args) {
        Produto produto = new Computador("Dell9", 30000);
        Tomate tomate = new Tomate("Tomate caqui", 2.40);
        tomate.setDataValidade("03/11/1997");

        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);
    }
}
