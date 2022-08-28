package com.company;

public class Ejercicio1 {
    public static void main(String[] args) {
        //numeros enteros
        byte nun1 = 1;
        short nun2 = 12;
        int nun3 = 34;
        long nun4 = 1298;

        //numeros decinales
        float nun5 = 23.2f;
        double nun6 = 234.23d;

        //cadena de texto
        String texto = "Jupiter es un planeta.";

        //caracter
        char letra = 'h';

        //booleanos
        boolean verdadero = true;
        boolean falso = false;

        System.out.println("Numeros: " + nun1 + ", " + nun2 + ", " + nun3 + ", " + nun4 + ", " + nun5 + ", " + nun6);
        System.out.println("Cadena de texto: " + texto);
        System.out.println("Caracter: " + letra);
        System.out.println("verdadero: " + verdadero);
        System.out.println("Falso: " + falso);
    }
}
