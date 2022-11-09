public class Main {

    public static void main(String[] args) {

        var estacion = "VERANO";

        switch (estacion) {
            case "VERANO", "PRIMAVERA", "INVIERNO", "OTOÑO" -> System.out.println("Es " + estacion);
            default -> System.out.println("La variable no es una " + estacion);
        }
    }

}
