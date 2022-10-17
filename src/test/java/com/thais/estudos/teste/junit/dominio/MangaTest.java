package com.thais.estudos.teste.junit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MangaTest {
    private Manga manga1;
    private Manga manga2;

    @BeforeEach
    public void setUp(){
        manga1 = new Manga("Naruto", 24);
        manga2 = new Manga("Naruto", 24);



    }
    @Test
    public void acessors_ReturnData_WhenInitialized(){
        Assertions.assertEquals("Naruto", manga1.name());
        Assertions.assertEquals(24,manga1.episodes());

    }
    public void equals_ReturnTrue_WhenObejctsAreTheSame(){
        Assertions.assertEquals(manga1, manga2);
    }

    public void hashCode_ReturnTrue_WhenObejctsAreTheSame(){
        Assertions.assertEquals(manga1.hashCode(), manga2.hashCode());
    }

    public void constructor_ThrowNullPointException_WhenNameIsNull(){
        Assertions.assertThrows(NullPointerException.class, () ->new Manga(null,24));
    }

    @Test
    public void isRecord_ReturnTrue_WhenCallesFromManga(){
        Assertions.assertTrue(Manga.class.isRecord());
    }


}