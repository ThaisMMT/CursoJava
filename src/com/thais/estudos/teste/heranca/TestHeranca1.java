package com.thais.estudos.teste.heranca;

public class TestHeranca1 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Endereco endereco = new Endereco("rua dos", "132434");
        pessoa.setNome("Arabella");
        pessoa.setCpf("122335454");
        pessoa.setEndereco(endereco);
       pessoa.imprime();

        System.out.println("-----------");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome(pessoa.getNome());
        funcionario.setCpf(pessoa.getCpf());
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2500.60);
        funcionario.imprime();




    }
}
