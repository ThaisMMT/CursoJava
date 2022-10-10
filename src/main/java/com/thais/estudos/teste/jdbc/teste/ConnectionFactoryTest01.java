package com.thais.estudos.teste.jdbc.teste;

import com.thais.estudos.teste.jdbc.conn.ConnectionFactory;
import com.thais.estudos.teste.jdbc.dominio.Producer;
import com.thais.estudos.teste.jdbc.repository.ProducerRepository;
import com.thais.estudos.teste.jdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
//        Producer producer = Producer.builder().name("Studio Deen").build();
//        Producer producerUpdate = Producer.builder().id(1).name("MADHOUSE").build();
//        ProducerService.save(producer);

//        log.info("INFO");
//        log.debug("INFO");
//        log.warn("INFO");
//        log.error("INFO");
//        log.trace("INFO");

//        ProducerService.delete(4);
//        ProducerService.update(producerUpdate);

//        List<Producer> producers = ProducerService.findASll();
//        log.info("Producers found '{}'", producers);

//        List<Producer> producers1 = ProducerService.findByName("Mad");
//        log.info("Producers found '{}'", producers1);

//        ProducerService.showProducerMetadata();
//        ProducerService.showDriverrMetadata();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> listProducer = ProducerService.findByNameAndUpdateToUpperCase("Denn");
//        log.info(listProducer);

//        List<Producer> listProducer = ProducerService.findByNameAndInsertWhenNotFound("Bones");
//         log.info("Producers found  '{}'",listProducer);

//          ProducerService.findByNameAndDelete("A-1 pictures");
        List<Producer> listProducer = ProducerService.findByNamePreparedStatement("Bones");
        log.info("Producers found  '{}'",listProducer);



    }
}
