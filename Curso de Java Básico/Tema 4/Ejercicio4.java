package com.company;


public class Ejercicio4 {
    public static void main(String[] args) {
        SmartDevice.SmartPhone smartPhone = new SmartDevice.SmartPhone("Apple", "13 Pro", "Verde", 13,6.1);
        SmartDevice.SmartWatch smartWatch = new SmartDevice.SmartWatch("Apple", "Series 6", "Negro", true, 22.5);

        System.out.println("El smartphone es: " + smartPhone);
        System.out.println("El SmartWatch es: " + smartWatch);
    }
}


/*
En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

Agregaréis atributos tal cual tendrían esos objetos en la realidad.

Crear constructor vacío y con todos los parámetros para cada clase.

Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */
