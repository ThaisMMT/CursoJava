package com.thais.estudos.teste.classesinternas;

class Animal {

    public  void walk(){
        System.out.println("Animal walking");
    }
}

class Cachorro extends Animal{
    @Override
    public void walk() {
        super.walk();
    }
}
public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking in the shodows");;
            }
        };
        animal.walk();

    }
}
