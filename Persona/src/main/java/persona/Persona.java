package persona;

import java.util.Scanner;

public class Persona {
    String nombre;
    String apellido;
    String id;
    int anonacimiento;
    String pais;
    char genero;
Persona(String nombre, String apellido, String id, int anonacimiento, String pais, char genero) {
    this.nombre=nombre;
    this.apellido=apellido;
    this.id=id;
    this.anonacimiento=anonacimiento;
    this.pais=pais;
    this.genero=genero;
}
void mostrar(){
    System.out.println("Nombre: "+nombre);
    System.out.println("Apellido: "+apellido);
    System.out.println("Numero de identificacion: "+id);
    System.out.println("Año de nacimiento: "+anonacimiento);
    System.out.println("Pais: "+pais);
    System.out.println("Genero: "+genero);
}
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            String nombre1=input.nextLine();
            String apellido1=input.nextLine();
            String id1=input.nextLine();
            int ano1=input.nextInt();
            input.nextLine();
            String pais1=input.nextLine();
            char genero1=input.next().charAt(0);
            input.nextLine();
            
            Persona pj1 = new Persona(nombre1, apellido1, id1, ano1, pais1, genero1);
            
            String nombre2=input.nextLine();
            String apellido2=input.nextLine();
            String id2=input.nextLine();
            int ano2=input.nextInt();
            input.nextLine();
            String pais2=input.nextLine();
            char genero2=input.next().charAt(0);
            
            Persona pj2 = new Persona(nombre2, apellido2, id2, ano2, pais2, genero2);
            
            pj1.mostrar();
            pj2.mostrar();
        }
    }
}
