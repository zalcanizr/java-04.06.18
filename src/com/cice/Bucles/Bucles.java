package com.cice.Bucles;

public class Bucles {

    public static void main(String[] args) {


        //bucle for
        for (int i=0; i<10;i++){
            //ejecutamos codigo
            //aqui la variable i es solamente accesible dentro del bucle for
            System.out.println(i);

        }
        /**     for (;;){
         *      system.out.println("hola");
         *      }
         *      // es un bucle infinito porque no tiene condicion de ruptura
         *      //con lo cual no hay ningún parámetro obligatorio
         *      // si no quiero q sea infinito tengo que dar el argumento hasta (la condicon) o
         *      // si no quiero meter parámetros le hago un break;
         *
         *      si pongo for(;1<2;){} se ejecutaría infinito porque nunca se cumple la condicion
         *
         *      si pongo
         *      int i=0;
         *      for(;i<2;){} // se ejecuta? si, cuantas veces? infinito.
         *      Con este ejemplo vemos que la inicializacion no es necesario hacerla en el bucle,i.e.
         *      no es una variable de ámbito del bucle. Al estar fuera i podemos utilizarla fuera.
         */


         }

}
