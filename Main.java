
package figurasgeometricas;

public class Main {

    public static void main(String[] args) {
        FiguraGeometricaAbs[] figuras={
            new Circulo(2),
            new Cuadrado(3),
            new Rectangulo(1,2),
            new TrianguloRectangulo(3,5)
        };
        
        for(FiguraGeometricaAbs figura:figuras){
            System.out.println("Area del "+figura.getNombre()+": "+ figura.calcularArea());
            System.out.println("Perimetro del "+figura.getNombre()+": "+ figura.calcularPerimetro());
            figura.datosextra();
            
            }
        }
 
    }
   


