package com.thais.estudos.teste.jdbc.service;

import com.thais.estudos.teste.jdbc.dominio.Producer;
import com.thais.estudos.teste.jdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }

    public static void delete(int id){

        requireValidId(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer){
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    private static void requireValidId(Integer id){
        if (id == null || id<=0){
            throw new IllegalArgumentException("Invalid value for id");
        }
    }

    public static List<Producer> findASll(){
        return ProducerRepository.findAll();
    }

}
