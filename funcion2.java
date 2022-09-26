
public class Main {

    public static void main(String[] args) {

        Coche micoche = new Coche();
        micoche.SumarPuerta();
        micoche.SumarPuerta();
        micoche.SumarPuerta();
        System.out.println(micoche.puertas);

    }



    static class Coche  {


        public int puertas = 4;

        public void SumarPuerta() {
            this.puertas++;
        }

    }
}