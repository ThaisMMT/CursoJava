package com.thais.estudos.teste.jdbc.service;

import com.thais.estudos.teste.jdbc.dominio.Producer;
import com.thais.estudos.teste.jdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name) {
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);

    }

    public static void updateJdbcRowSet(Producer producer) {
        ProducerRepositoryRowSet.updateJdbcRowSet(producer);
    }
    public static void updateCacheRowSet(Producer producer) {
        ProducerRepositoryRowSet.updateJdbcRowSet(producer);
    }
}
