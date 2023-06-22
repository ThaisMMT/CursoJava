package com.thais.estudos.teste.exercicio.inicio;

public class Jogador {

    private String name;
    private Time time;


    public Jogador(String name){

        this.name = name;
    }

    public void imprimir(){
        System.out.println(this.name);
//        System.out.println(time.getName());
        if (time == null){
            System.out.println("Jogador sem Time");
        }
        else {
            System.out.println(time.getName());
        };
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
