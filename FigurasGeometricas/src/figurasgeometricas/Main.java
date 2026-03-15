
package figurasgeometricas;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        /*Data Input*/
        Scanner lector=new Scanner(System.in);
        
        System.out.print("Ingrese el radio del circulo: ");
        double radio=lector.nextDouble();
        
        System.out.print("Ingrese la base del rectangulo: ");
        double baseRect = lector.nextDouble();

        System.out.print("Ingrese la altura del rectangulo: ");
        double alturaRect = lector.nextDouble();

        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = lector.nextDouble();

        System.out.print("Ingrese la base del triangulo rectangulo: ");
        double baseTri = lector.nextDouble();

        System.out.print("Ingrese la altura del triangulo rectangulo: ");
        double alturaTri = lector.nextDouble();
        
        
        /*Objects creation*/
        Circulo figura1=new Circulo(radio);
        Rectangulo figura2=new Rectangulo(baseRect,alturaRect);
        Cuadrado figura3=new Cuadrado(lado);
        TrianguloRectangulo figura4=new TrianguloRectangulo(baseTri,alturaTri);

        System.out.printf("El área del círculo es: %.2f%n",figura1.calcularArea());
        System.out.printf("El perímetro del círculo es: %.2f%n",figura1.calcularPerimetro());
 
        System.out.printf("El área del rectángulo es: %.2f%n",figura2.calcularArea());
        System.out.printf("El perímetro del rectángulo es: %.2f%n",figura2.calcularPerimetro());

        System.out.printf("El área del cuadrado es: %.2f%n",figura3.calcularArea());
        System.out.printf("El perímetro del cuadrado es: %.2f%n",figura3.calcularPerimetro());

        System.out.printf("El área del triángulo rectángulo es: %.2f%n",figura4.calcularArea());
        System.out.printf("El perímetro del triángulo rectángulo es: %.2f%n",figura4.calcularPerimetro());
        figura4.calcularTipo();
  
        
    }
    
}
