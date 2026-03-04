/*
Abstract classes: Used as a base for other classes that share common methods
Extends: extends is used to define a class as hereditary of another class
*/
package figurasgeometricas;

public abstract class FiguraGeometricaAbs {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    public abstract String getNombre();
    public void datosextra(){
        
    };
}

