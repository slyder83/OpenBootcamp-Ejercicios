package com.company;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un precio: ");

        int precio = scanner.nextInt();

        double precioConIva = precio * 0.21 + precio;

        System.out.println(precioConIva);
    }

}
