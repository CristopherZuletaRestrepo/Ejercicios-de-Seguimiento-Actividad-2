package planetas;
import java.util.Scanner;

public class Planetas {
    public enum TipoPlaneta { GASEOSO, TERRESTRE, ENANO }
    String nombre = null;
    int satelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciasol = 0;
    TipoPlaneta tipo = null; 
    boolean observable = false;
    Planetas(String nombre, int satelites, double masa, double volumen, int diametro, int distanciasol, TipoPlaneta tipo, boolean observable) {
        this.nombre = nombre;
        this.satelites = satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciasol = distanciasol;
        this.tipo = tipo;
        this.observable = observable;
    }
    boolean esPlanetaExterior() {
        double limiteUaEnKm = 149597870 * 3.4; 
        return this.distanciasol > limiteUaEnKm;
    }

    void output() {
        System.out.println("\n--- Datos del Planeta ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Satelites: " + satelites);
        System.out.println("Masa: " + masa);
        System.out.println("Volumen: " + volumen);
        System.out.println("Densidad: " + (masa / volumen));
        System.out.println("Diametro: " + diametro);
        System.out.println("Distancia al sol: " + distanciasol + " km");
        System.out.println("Tipo: " + tipo);
        System.out.println("¿Es observable?: " + (observable ? "Si" : "No"));
        System.out.println("¿Es planeta exterior?: " + (esPlanetaExterior() ? "Si" : "No"));
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
           
            System.out.print("Nombre: "); String nom = input.nextLine();
            System.out.print("Satelites: "); int sat = input.nextInt();
            System.out.print("Masa: "); double mas = input.nextDouble();
            System.out.print("Volumen: "); double vol = input.nextDouble();
            System.out.print("Diametro: "); int dia = input.nextInt();
            System.out.print("Distancia al Sol (km): "); int dist = input.nextInt();
            
            
            System.out.print("Tipo (1: Gaseoso, 2: Terrestre, 3: Enano): ");
            int opcion = input.nextInt();
            TipoPlaneta t = (opcion == 1) ? TipoPlaneta.GASEOSO : (opcion == 2) ? TipoPlaneta.TERRESTRE : TipoPlaneta.ENANO;
            
            System.out.print("¿Es observable? (true/false): ");
            boolean obs = input.nextBoolean();

            Planetas p1 = new Planetas(nom, sat, mas, vol, dia, dist, t, obs);
            input.nextLine();
            System.out.print("Nombre: "); String nom2 = input.nextLine();
            System.out.print("Satelites: "); int sat2 = input.nextInt();
            System.out.print("Masa: "); double mas2 = input.nextDouble();
            System.out.print("Volumen: "); double vol2 = input.nextDouble();
            System.out.print("Diametro: "); int dia2 = input.nextInt();
            System.out.print("Distancia al Sol (km): "); int dist2 = input.nextInt();
            
            
            System.out.print("Tipo (1: Gaseoso, 2: Terrestre, 3: Enano): ");
            int opcion2 = input.nextInt();
            TipoPlaneta t2 = (opcion2 == 1) ? TipoPlaneta.GASEOSO : (opcion2 == 2) ? TipoPlaneta.TERRESTRE : TipoPlaneta.ENANO;
            
            System.out.print("¿Es observable? (true/false): ");
            boolean obs2 = input.nextBoolean();

            Planetas p2 = new Planetas(nom2, sat2, mas2, vol2, dia2, dist2, t2, obs2);
            p1.output();
            p2.output();
        }
    }
}