package com.cice.ejercicio4;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){


        System.out.print("Introduzca el número a calcular su factorial:");
        Scanner sc=new Scanner(System.in);
        int factorial = sc.nextInt();

        int auxiliar =1;

        for(int i=1;i<=factorial;i++){

            auxiliar*=i;
        }
        System.out.println("El factorial del número "+factorial+" es : " + auxiliar);


        /**
         * o.f.
         * int auxiliar=1;
         *
         * for (; factorial>0;){
         *  auxiliar*=factorial;
         *  factorial--;
         * }
         * System.out.println("El factorial del número "+factorial+" es : " + auxiliar);
         *
         *o.f.
         * for (; factorial>0;factorial--){
         *  auxiliar*=factorial;
         *
         * }
         *
         */

    }

}
