package com.thais.estudos.teste.colecoes.testes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map <String, String> map = new LinkedHashMap<>();

        map.put("teklado","teclado");
        map.put("mouze","mouse");
        map.put("vc","você");
        map.putIfAbsent("vc","você2"); //só irá adicionar caso não exista
        map.putIfAbsent("kola","cola");
        System.out.println(map);

        System.out.println("---pegar por keys (chaves)---");
        for (String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("----- Pegar por valor-----");

        for (String values : map.values()){
            System.out.println(values);
        }

        System.out.println("-----------");

        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }



    }
}
