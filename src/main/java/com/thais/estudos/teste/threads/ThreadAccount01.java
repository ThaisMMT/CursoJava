package com.thais.estudos.teste.threads;

import com.thais.estudos.teste.threads.dominio.Account;

public class ThreadAccount01 {
    private Account account = new Account();

    public static void main(String[] args) {


    }

    private void withdrawl(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " esta indo sacar dinheiro");
            account.withdrawl(amount);
            System.out.println(Thread.currentThread().getName() + " completou o saque, valor atual da conta " + account.getBalance());

        } else {
            System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + "efetuar o saque " + account.getBalance());

        }


    }


}
