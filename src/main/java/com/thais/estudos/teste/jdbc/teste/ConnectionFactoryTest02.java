package com.thais.estudos.teste.jdbc.teste;

import com.thais.estudos.teste.jdbc.dominio.Producer;
import com.thais.estudos.teste.jdbc.repository.ProducerRepositoryRowSet;
import com.thais.estudos.teste.jdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.awt.geom.Point2D;
import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {


        Producer producerToUpdate = Producer.builder().id(1).name("MAD").build();
        ProducerServiceRowSet.updateJdbcRowSet(producerToUpdate);

        log.info("------------------");

        List<Producer> producers = ProducerRepositoryRowSet.findByNameJdbcRowSet("");
        log.info(producers);
    }
}
