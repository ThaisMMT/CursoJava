package com.thais.estudos.teste.exercicio.primeiros;

public class JogadorTesteTime {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Guedes");
        Time time = new Time("Corinthians");

        // vc não pode imprimir antes de dar um time para o jogador

        jogador1.setTime(time);
        jogador1.imprimir();




    }
}
