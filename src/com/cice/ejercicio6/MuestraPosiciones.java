package com.cice.ejercicio6;

public class MuestraPosiciones {

    public static void main(String[] args) {


        int[] array={1,2,3,-4,-5,6,7,8,9};

        int contador=0;


        while (array[contador]>0){
            System.out.println(array[contador]);
            contador++;
        }


        System.out.println("has recorrido: "+ contador+" posiciones del array");

    }
}
