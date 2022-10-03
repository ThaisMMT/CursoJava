package com.thais.estudos.teste.threads;

class ThreadsExampleRunnable implements Runnable{
    private final String c;

    public ThreadsExampleRunnable(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i =0; i <500; i++ ){
            if (i%100 ==0){
                System.out.println();
            }
            Thread.yield();
        }
    }
}

public class TreadsTest01 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadsExampleRunnable("KA"));
        Thread t2 = new Thread(new ThreadsExampleRunnable("ME"));

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t1.join();
        t2.start();//Fazendo executar em paralelo

    }
}
