package com.thais.estudos.teste.polimorfismoexception;

public class Funcionario extends Pessoa {

    private float salario;


    public Funcionario(String nome, Data dataNascimento) {
        super(nome, dataNascimento);
    }

    @Override
    public void imprimeDados() {
        System.out.println(" Funcionario "
                + this.nome + " nascido em "
                + this.dataNascimento + " recebe " + this.salario);


    }

    public void calcularFuncionario() {

        if (this.salario <= 0) {
            throw new IllegalArgumentException("salario tem que ser maior que 0");
        }
        float imposto = this.salario * 0.3F;
        System.out.println(imposto);

    }


    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {

        this.salario = salario;


    }
}
