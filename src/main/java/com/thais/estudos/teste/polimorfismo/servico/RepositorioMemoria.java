package com.thais.estudos.teste.polimorfismo.servico;

import com.thais.estudos.teste.polimorfismo.respositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na memoria");
    }
}
