package com.thais.estudos.teste.classes.abstratas;



public class TestFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Thais",8000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Victor",14900);
        System.out.println(desenvolvedor);
        desenvolvedor.imprimir();
        gerente.imprimir();



    }
}
