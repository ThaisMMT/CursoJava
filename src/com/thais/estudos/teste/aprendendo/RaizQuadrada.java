package com.thais.estudos.teste.aprendendo;

import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {

        // Determine	 as	 raízes	 de	 uma	 equação	 de	 2º	 grau:	 ax2 +	 bx	 +	 c	 =	 0	 (recordar	 que	 o
        //discriminante	Δ =	b2 – 4ac,	e	que	a	raiz	r=(–b	± √Δ)/2a).


        int delta;
        int x1;
        int x2;
        int raiz;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor de A: ");

        int a = entrada.nextInt();

        System.out.print("Entre com o valor de B: ");

        int b = entrada.nextInt();

        System.out.print("Entre com o valor de C: ");

        int c = entrada.nextInt();




        if(a != 0){

            delta = b*b * 4 * a * c;

            if(delta >= 0)
            {
                x1 = (int) (( -b + (Math.sqrt (delta))) / ( 2*a ));

                x2 = (int) (( -b + (Math.sqrt (delta) ) ) / ( 2*a ));

                System.out.println("O valor de x1 e: "+x1);
                System.out.println("O valor de x2 e: "+x2);

            }
            else
            {
                System.out.println("Nao foi possivel resolver, pois "+delta+" e menor que 0");

            }

        }

        else
        {
            System.out.println("Nao e uma equacao de 2º grau, pois A e = 0");

        }

    }
}
