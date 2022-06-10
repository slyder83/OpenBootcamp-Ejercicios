public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(17, 25, 43);
        System.out.println("El resultado de la suma es: " + resultado);

        Coche miCoche = new Coche();
        miCoche.AddPuertas();
        System.out.println("El número de puertas es: " + miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
class Coche {
    public int puertas = 3;

    public void AddPuertas(){
        this.puertas++;
    }
}