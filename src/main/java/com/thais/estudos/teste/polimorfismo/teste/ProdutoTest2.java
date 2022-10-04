package com.thais.estudos.teste.polimorfismo.teste;

import com.thais.estudos.teste.polimorfismo.dominio.Computador;
import com.thais.estudos.teste.polimorfismo.dominio.Produto;
import com.thais.estudos.teste.polimorfismo.dominio.Tomate;

public class ProdutoTest2 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen9", 3400.00);

        Produto produto2 = new Tomate("Verde", 4.80);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        produto.calcularImposto();

        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        produto2.calcularImposto();

    }
}
