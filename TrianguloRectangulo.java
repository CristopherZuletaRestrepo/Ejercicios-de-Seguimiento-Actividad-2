
package figurasgeometricas;

public class TrianguloRectangulo extends FiguraGeometricaAbs{
    
    
    /*Fields*/
    private double altura;
    private double base;
    public enum TipoTriangulo{Equilatero, Escaleno, Isosceles};
    private TipoTriangulo tipoTriangulo;
    
    /*Constructor*/
    TrianguloRectangulo(double altura, double base){
        this.altura=altura;
        this.base=base;
        if(altura<=0||base<=0){
            throw new IllegalArgumentException("**La altura y la base deben ser mayores a 0**");
        }
    }
    
    
    /*Methods*/
    public String getNombre(){
        return "triangulo rectangulo";
    }
    public void setBase(double base){
        this.base=base;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    public double calcularArea(){
    double area=(base*altura)/2;
    return area;
    }
    
    public double calcularHipotenusa(){
        double hipotenusa=Math.sqrt(Math.pow(base, 2)+Math.pow(altura,2));
        return hipotenusa;
    }
    
    public double calcularPerimetro(){
        double perimetro=base+altura+calcularHipotenusa();
        return perimetro;
    }
    
    public void calcularTipo(){
        if(altura==base && altura==calcularHipotenusa()){
            tipoTriangulo=TipoTriangulo.Equilatero;
        }else if(altura!=base && altura!=calcularHipotenusa()){
            tipoTriangulo=TipoTriangulo.Escaleno;
        }else{
            tipoTriangulo=TipoTriangulo.Isosceles;
        }
        System.out.println("El tipo de triangulo es: "+tipoTriangulo);
    }
    
    public void datosextra(){
        calcularTipo();
    }
    
}

