package com.thais.estudos.teste.exercicio.primeiros;

public class JogadorTeste {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Gabriel");
        Jogador jogador2 = new Jogador("Gavi");
        Jogador jogador3 = new Jogador("Ricardo");
        Jogador[] Jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : Jogadores) {
            jogador.imprimir();
            
        }


    }
}
