
package figurasgeometricas;

public class Rectangulo {
    
    
    /*Features*/
    private double altura;
    private double base;
    
    
    /*Constructor*/
    Rectangulo(double altura, double base){
        this.altura=altura;
        this.base=base;
    }
    
    
    /*Methods*/
    public double calcularArea(){
        double area=base*altura;
        return area;
    }
    
    public double calcularPerimetro(){
        double perimetro=base*2+altura*2;
        return perimetro;
    }
}
