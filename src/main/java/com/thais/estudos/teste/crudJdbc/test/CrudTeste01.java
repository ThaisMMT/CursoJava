package com.thais.estudos.teste.crudJdbc.test;

import com.thais.estudos.teste.crudJdbc.dominio.Producer;
import com.thais.estudos.teste.crudJdbc.service.AnimeService;
import com.thais.estudos.teste.crudJdbc.service.ProducerService;

import java.util.Scanner;

public class CrudTeste01 {

    private static final Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args) {
        while (true) {
            int op;
            menu();
            op = Integer.parseInt(SCANNER.nextLine());
            if (op == 0) break;
            switch (op){
                case 1 :
                    procucerMenu();
                    op = Integer.parseInt(SCANNER.nextLine());
                    ProducerService.menu(op);
                case 2 :
                    animeMenu();
                    op = Integer.parseInt(SCANNER.nextLine());
                    AnimeService.menu(op);
                         }



        }
    }

    private static void menu() {
        System.out.println("Type the number of your operation");
        System.out.println("1. Producer");
        System.out.println("2. Anime");
        System.out.println("0. Exit");

    }
    private static void procucerMenu() {
        System.out.println("Type the number of your operation");
        System.out.println("1. Search for producer");
        System.out.println("2. Delete producer");
        System.out.println("3. Save producer");
        System.out.println("4. Update producer");
        System.out.println("9. Go Back");
    }

    private static void animeMenu() {
        System.out.println("Type the number of your operation");
        System.out.println("1. Search for anime");
        System.out.println("2. Delete anime");
        System.out.println("3. Save anime");
        System.out.println("4. Update anime");
        System.out.println("9. Go Back");
    }
}
