package com.thais.estudos.teste.polimorfismo.dominio;

public class Tomate extends Produto {

    private String dataValidade;
    public static final double IMPOSTO_POR_CENTO = 0.06;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    public Tomate(String nome, double valor, String dataValidade) {
        super(nome, valor);
        this.dataValidade = dataValidade;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate ");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
