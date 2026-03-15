
package figurasgeometricas;

public class Circulo {
    
    
    /*Features*/
    private double radio;
    
    
    /*Constructor*/
    Circulo(double radio){
        this.radio=radio;
    }
    
    
    /*Methods*/
    public double calcularArea(){
        double area=Math.PI*(Math.pow(radio,2));
        return area;
    }
    public double calcularPerimetro(){
    double perimetro=Math.PI*2*radio;
    return perimetro;
    }
     
}



