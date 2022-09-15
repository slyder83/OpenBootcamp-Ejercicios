package com.company;

import java.io.*;
import java.util.*;

public class Ejercicios_7_8_9 {

    public static class CadenaAlReves {

        public static void main(String[] args) {

            /*
            Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
            */

            String texto = "Hola mundo";
            System.out.println("Cadena: " + texto);
            StringBuilder textoRev = new StringBuilder(texto);
            texto = textoRev.reverse().toString();
            System.out.println("Cadena al reves: " + texto);
        }
    }

    public static class ArrayUnidimesional {

        public static void main(String[] args) {

            /*
            Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
            */

            String arrayUni[] = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis"};
            for (String i: arrayUni){
                System.out.println(i);
            }
        }
    }

    public static class ArrayBidimensional {

        public static void main(String[] args) {

            /*
            Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
            */

            int arrayBi[][] = {
                    {1, 2, 3, 4},
                    {10, 20, 30, 40, 50}
            };

            for (int i = 0; i < arrayBi.length; i++) {

                for (int j = 0; j < arrayBi[i].length; j++) {
                    System.out.println("Fila: " + i + ", Columna: " + j + ", Valor: " + arrayBi[i][j]);
                }
            }
        }
    }

    public static class ProblemaVector {

        public static void main(String[] args) {

            /*
            Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
            */

            Vector<Integer> vectorInt = new Vector();
            vectorInt.add(54);
            vectorInt.add(92);
            vectorInt.add(81);
            vectorInt.add(49);
            vectorInt.add(72);
            System.out.println("Vector con todos los elementos: " + vectorInt);
            vectorInt.remove(1);
            vectorInt.remove(1);
            System.out.println("Vector después de eliminar el elemento 2 y 3: " + vectorInt);
        }
    }

    public static class Problema {

        public static void main(String[] args) {

            /*
            Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
            */

            System.out.println("Se sobrecarga la memoria porque se duplica la capacidad base del vector");
        }
    }

    public static class ProblemaArrayListString {

        public static void main(String[] args) {

           /*
            Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
            */

            ArrayList<String> lista = new ArrayList<String>();
            lista.add("Maquina");
            lista.add("Juego");
            lista.add("Aire");
            lista.add("Motor");

            LinkedList<String> listaLink = new LinkedList<String>(lista);

            for (int i = 0; i < lista.size(); i++) {
                System.out.println("ArrayList: " + lista.get(i));
            }

            for (int j = 0; j < listaLink.size(); j++) {
                System.out.println("linkedList: " + listaLink.get(j));
            }
        }
    }

    public static class ProblemaArrayListInt {

        public static void main(String[] args) {

            /*
            Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares.
            Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer
            "for" de relleno.
             */

            ArrayList<Integer> enteros = new ArrayList<>();
            for (int i = 1; i < 11; i++) {
                enteros.add(i);

                for (int numeros = 0; numeros < enteros.size(); numeros++) {

                    if (enteros.get(numeros) % 2 == 0){
                        enteros.remove(numeros);
                    }
                }
            }
            System.out.println(enteros);
        }
    }

    public static class DividePorCero {

        public static int division(int a, int b) throws ArithmeticException {
            return a / b;
        }

        public static void main(String[] args) {

            /*
            Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su
            llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier
            caso: "Demo de código".
            */

            Scanner scanner = new Scanner(System.in);
            System.out.println("Escribe dos números que quieres dividir: ");

            int numero1 = scanner.nextInt();
            int numero2 = scanner.nextInt();

            try {
                int resultado = division(numero1, numero2);
                System.out.println("El resultado es: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Esto no puede hacerse");
            } finally {
                System.out.println("Demo de código");
            }
        }
    }

    public static class Copiar {

        /*
        Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
         */

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Fichero de origen: ");
            String fileIn = scanner.nextLine();
            System.out.println("Fichero de destino: ");
            String fileOut = scanner.nextLine();
            copiar(fileIn, fileOut);

        }

        private static void copiar(String fileIn, String fileOut) {

            try {

                InputStream in = new FileInputStream(fileIn);
                byte []datos = in.readAllBytes();
                in.close();

                PrintStream out = new PrintStream(fileOut);
                out.write(datos);
                out.close();

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        }

    }

    public static class programa {

        /*
        Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
         */

        public static void main(String[] args) {

            HashMap<String, Integer> empleados = new HashMap<>();
            empleados.put("Juan", 24);
            empleados.put("Paco", 45);
            empleados.put("Pepe", 58);
            empleados.put("Laura", 25);
            empleados.put("Marta", 35);

            System.out.println(empleados);

            Set<String> clave = empleados.keySet();
            Collection<Integer> valor = empleados.values();

            ArrayList<String> listaDeClaves = new ArrayList<>(clave);
            ArrayList<Integer> listaDeValores = new ArrayList<>(valor);

            System.out.println(listaDeClaves);
            System.out.println(listaDeValores);

            try {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Ruta destino Claves: ");
                String copiaClaves = scanner.nextLine();
                System.out.println("Ruta destino Valores: ");
                String copiaValores = scanner.nextLine();

                PrintStream fileClaves = new PrintStream(copiaClaves);
                fileClaves.println(listaDeClaves);

                PrintStream fileValores = new PrintStream(copiaValores);
                fileValores.println(listaDeValores);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            Scanner scanner = new Scanner(System.in);


            System.out.println("Fichero de destino claves.txt: ");
            String fileOutClaves = scanner.nextLine();
            System.out.println("Fichero de destino valores.txt: ");
            String fileOutValores = scanner.nextLine();
            copiaSeguridad(fileOutClaves, fileOutValores);

        }

        private static void copiaSeguridad(String fileOutClaves, String fileOutValores) {

            try {

                InputStream in = new FileInputStream("claves.txt");
                byte []datos = in.readAllBytes();
                in.close();

                PrintStream out = new PrintStream(fileOutClaves);
                out.write(datos);
                out.close();

                InputStream in2 = new FileInputStream("valores.txt");
                byte []datos2 = in2.readAllBytes();
                in2.close();

                PrintStream out2 = new PrintStream(fileOutValores);
                out2.write(datos2);
                out2.close();

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }


        }
    }
}
