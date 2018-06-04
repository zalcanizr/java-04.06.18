package com.cice.ejercicio5;

public class suma {


    public static void main(String[] args){


        int[] array={1,2,3,4,5,6,7,8,9};

        int suma=0;
        for(int a:array) {
            suma+=a;

        }
        System.out.println("La suma de todos los números es: " + suma);

    }



}
