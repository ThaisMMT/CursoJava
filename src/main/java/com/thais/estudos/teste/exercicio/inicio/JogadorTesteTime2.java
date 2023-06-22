package com.thais.estudos.teste.exercicio.inicio;

public class JogadorTesteTime2 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Guedes");
        Jogador jogador1 = new Jogador("Yuri Alberto");
        Time time = new Time("Corinthians");
        Jogador[] jogadores = {jogador, jogador1};

        jogador.setTime(time);
        jogador1.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("----Jogadores----");
        jogador.imprimir();
        jogador1.imprimir();
        System.out.println("----Time----");
        time.imprimir();


    }
}
