package com.cice.ejercicio5;

public class Suma {


    public static void main(String[] args){


        int[] array={1,2,3,4,5,6,7,8,9};

        int suma=0;

        for(int a:array) {
            suma+=a;

        }
        /**
         * o.f. bucle convencional
         * for(int i=0;i<array.length;i++){
         *  int auxiliar=array[i];
         *  resultado =resultado+auxiliar;
         * }
         *
         *
         */

        System.out.println("La Suma de todos los números es: " + suma);

    }



}
