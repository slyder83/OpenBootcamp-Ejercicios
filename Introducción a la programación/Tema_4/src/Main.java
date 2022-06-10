public class Main {
    public static void main(String[] args){
        //Estructura If
        int numeroIf = 0;

        if (numeroIf == 0){
            System.out.println("el número es cero");
        } else if (numeroIf < 0) {
            System.out.println("el número es negativo");
        } else {
            System.out.println("el número es positivo");
        }

        //Estructura While
        int numeroWhile = 0;

        while (numeroWhile < 3){
            System.out.println("El núumero While es: " + numeroWhile);
            numeroWhile++;
        }

        //Estructura Do While
        do {
            System.out.println("El número DoWhile es: " + numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        //Estructura For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El número For es: " + numeroFor);
        }

        //Estructura Switch
        String estacion = "Verano";

        switch (estacion){
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}