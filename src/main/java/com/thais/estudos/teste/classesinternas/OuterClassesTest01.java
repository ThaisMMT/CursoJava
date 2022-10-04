package com.thais.estudos.teste.classesinternas;

public class OuterClassesTest01 {
    private String name = "Thais";

    class Inner {
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(OuterClassesTest01.this);
        }
        
    }
    public static void main(String[] args) {
        OuterClassesTest01 outerClasses = new OuterClassesTest01();
        Inner inner = outerClasses.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();

        
    }
}
