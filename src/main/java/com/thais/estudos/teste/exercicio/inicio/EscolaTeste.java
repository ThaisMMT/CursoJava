package com.thais.estudos.teste.exercicio.inicio;

public class EscolaTeste {
    public static void main(String[] args) {
        Professor professor = new Professor("Prof°1");
        Professor professor1 = new Professor("Profª2");
        Professor professor2 = new Professor("Prof°3");
        Professor[] professores = {professor, professor1, professor2};
        Escola escola = new Escola("Escola1",professores);

        escola.imprime();

    }
}
