package com.thais.estudos.teste.jdbc.teste;

import com.thais.estudos.teste.jdbc.conn.ConnectionFactory;
import com.thais.estudos.teste.jdbc.dominio.Producer;
import com.thais.estudos.teste.jdbc.repository.ProducerRepository;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        ProducerRepository.save(producer);

    }
}
