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



        //bucle foreach
        /*
        for(tipo nombre_variable:array)
        se recorre de inicio a fin. no tenemos el control
        tipo: tipo de dato que voy a sacar de la lista de datos
        vnombre_variable: ariable auxiliar que va a guardar el valor de la lista que estoy sacando en ese momento
        array: lista o cjto a recorrer.
         */

        int[] array={1,2,3,4,5,6,7,8,9};

        for(int a:array){

            System.out.println(a);
        }



         }

}
