public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(25);
        persona.setNombre("Pedro");
        persona.setTelefono(654632574);

        int edad = persona.getEdad();
        System.out.println("Mi edad es " + edad);

        String nombre = persona.getNombre();
        System.out.println("Mi nombre es " + nombre);

        int telefono = persona.getTelefono();
        System.out.println("Mi teléfono es " + telefono);
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}