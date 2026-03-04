
package figurasgeometricas;

public class Cuadrado extends FiguraGeometricaAbs {
    
    
    /*Fiedls*/
    private double lado;
    
    
    /*Constructor*/
    Cuadrado(double lado){
        this.lado=lado;
        if(lado<=0){
            throw new IllegalArgumentException("**El lado debe ser mayor a 0**");
        }
    }
    
    
    /*Methods*/
    public String getNombre(){
        return "cuadrado";
    }
    public void setLado(double lado){
        this.lado=lado;
    }
    public double calcularArea(){
        double area=lado*lado;
        return area;
    }
    public double calcularPerimetro(){
        double perimetro=lado*4;
        return perimetro;
    }
    public void datosextra(){
        
    }
}
