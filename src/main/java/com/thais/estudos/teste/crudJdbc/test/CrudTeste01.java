package com.thais.estudos.teste.crudJdbc.test;

import com.thais.estudos.teste.crudJdbc.service.ProducerService;

import java.util.Scanner;

public class CrudTeste01 {

    private static final Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args) {
        while (true) {
            int op;
            procucerMenu();
            op = Integer.parseInt(SCANNER.nextLine());
            if (op == 0) break;
            ProducerService.menu(op);


        }
    }

    private static void procucerMenu() {
        System.out.println("Type the number of your operation");
        System.out.println("1. Search for producer");
        System.out.println("2. Delete producer");
        System.out.println("3. Save producer");
        System.out.println("4. Update producer");
        System.out.println("0.Exit");
    }
}
