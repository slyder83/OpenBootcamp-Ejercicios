public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.edad = 34;
        cliente.nombre = "Jaime";
        cliente.telefono = 654124578;
        cliente.credito = 1245.75;

        System.out.println("La edad del cliente es " + cliente.edad);
        System.out.println("El nombre del cliente es " + cliente.nombre);
        System.out.println("El telefono del cliente es " + cliente.telefono);
        System.out.println("El credito del cliente es " + cliente.credito);

        Trabajador trabajador = new Trabajador();

        trabajador.edad = 28;
        trabajador.nombre = "Mario";
        trabajador.telefono = 758325496;
        trabajador.salario = 1024.81;

        System.out.println("La edad del trabajador es " + trabajador.edad);
        System.out.println("El nombre del trabajador es " + trabajador.nombre);
        System.out.println("El telefono del trabajador es " + trabajador.telefono);
        System.out.println("El salario del trabajador es " + trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}