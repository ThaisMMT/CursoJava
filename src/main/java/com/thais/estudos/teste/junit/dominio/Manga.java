package com.thais.estudos.teste.junit.dominio;

import java.util.Objects;

public record Manga(String name, int episodes) {

    public Manga{
        Objects.requireNonNull(name);
    }

}
