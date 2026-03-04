
package figurasgeometricas;

public class Circulo extends FiguraGeometricaAbs {
    
    
    /*Fields*/
    private double radio;
    
    
    /*Constructor*/
    Circulo(double radio){
        if(radio<=0){
            throw new IllegalArgumentException("**El radio debe ser mayor a 0**");
        }
        this.radio=radio;
    }
    
    
    /*Methods*/
            
    public String getNombre(){
        return "circulo";
    }
    public void setRadio(double radio){
        this.radio=radio;
    }
    public double calcularArea(){
        double area=Math.PI*(Math.pow(radio,2));
        return area;
    }
    public double calcularPerimetro(){
    double perimetro=Math.PI*2*radio;
    return perimetro;
    }
    public void datosextra(){
        
    }
     
}



