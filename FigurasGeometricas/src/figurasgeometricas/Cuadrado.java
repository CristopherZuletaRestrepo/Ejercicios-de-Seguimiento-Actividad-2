
package figurasgeometricas;

public class Cuadrado {
    
    
    /*Features*/
    private double lado;
    
    
    /*Constructor*/
    Cuadrado(double lado){
        this.lado=lado;
    }
    
    
    /*Methods*/
    public double calcularArea(){
        double area=lado*lado;
        return area;
    }
    public double calcularPerimetro(){
        double perimetro=lado*4;
        return perimetro;
    }
}
