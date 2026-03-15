
package figurasgeometricas;

public class TrianguloRectangulo {
    
    
    /*Features*/
    private double altura;
    private double base;
    
    
    /*Constructor*/
    TrianguloRectangulo(double altura, double base){
        this.altura=altura;
        this.base=base;
    }
    
    
    /*Methods*/
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
        String tipo;
        if(altura==base && altura==calcularHipotenusa()){
            tipo="equilatero";
        }else if(altura!=base && altura!=calcularHipotenusa()){
             tipo="escaleno";
        }else{
            tipo="isosceles";
        }
        System.out.println("El triángulo es un "+tipo);
    }
    
}

