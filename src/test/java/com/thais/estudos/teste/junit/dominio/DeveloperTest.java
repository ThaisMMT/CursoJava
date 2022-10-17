package com.thais.estudos.teste.junit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {


    @Test
    public void instanceOf_ExecutesChildClassMethod_WhenObjectsIsOfChildType(){
        Employee employeeDeveloper = new Developer("1", "Java");
        if( employeeDeveloper instanceof Developer developer){
            Assertions.assertEquals("Java",developer.getMainLanguage());
        }
        }
    }

