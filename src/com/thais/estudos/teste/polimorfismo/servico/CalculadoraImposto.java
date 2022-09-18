package com.thais.estudos.teste.polimorfismo.servico;

import com.thais.estudos.teste.polimorfismo.dominio.Computador;
import com.thais.estudos.teste.polimorfismo.dominio.Produto;
import com.thais.estudos.teste.polimorfismo.dominio.Tomate;

public  class CalculadoraImposto {

    
    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de Imposto ");
        double imposto = produto.calcularImposto();
        System.out.println("Produto " + produto.getNome());
        System.out.println("Preço " + produto.getValor());
        System.out.println("Imposto a ser pago " + imposto);

        if (produto instanceof Tomate) {

         System.out.println(((Tomate) produto).getDataValidade());
        };
    }
}
