package com.thais.estudos.teste.jdbc.dominio;

import lombok.Builder;
import lombok.Value;
import lombok.extern.log4j.Log4j2;

import java.util.Objects;

@Value
@Builder

public class Producer {
     Integer id;
     String name;

}


