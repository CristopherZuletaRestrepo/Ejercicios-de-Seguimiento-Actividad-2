
package figurasgeometricas;

public class Rectangulo extends FiguraGeometricaAbs{
    
    
    /*Fields*/
    private double altura;
    private double base;
    
    
    /*Constructor*/
    Rectangulo(double altura, double base){
        this.altura=altura;
        this.base=base;
        if(altura<=0||base<=0){
            throw new IllegalArgumentException("**La altura y la base deben ser mayores a 0**");
        }
    }
    
    
    /*Methods*/
    public String getNombre(){
        return "rectangulo";
    }
    public void setBase(double base){
        this.base=base;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    public double calcularArea(){
        double area=base*altura;
        return area;
    }
    
    public double calcularPerimetro(){
        double perimetro=base*2+altura*2;
        return perimetro;
    }
    public void datosextra(){
        
    }
}
