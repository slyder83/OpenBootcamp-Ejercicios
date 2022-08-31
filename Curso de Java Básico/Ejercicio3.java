package com.company;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] nombres = new String[]{"Juan", "Pedro", "Eli", "Laura"};

        for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }

        for(String nombre:nombres){
            System.out.println(nombre);
        }
    }
}

/*
En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.

Tened en cuenta que los textos pueden venir de un array de tipo String
 */
