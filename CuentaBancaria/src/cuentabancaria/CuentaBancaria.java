
package cuentabancaria;

public class CuentaBancaria {
    
    
    /*features---------------------*/
    String nombresTitular;
    String apellidosTitular;
    int numeroCuenta;
    enum TiposCuenta{
        AHORROS,
        CORRIENTE
    }
    TiposCuenta tipoCuenta;
    double saldo;
    
    
    
    
    /*constructor--------------*/
    CuentaBancaria(String nombresTitular,String apellidosTitular,int numeroCuenta,TiposCuenta tipoCuenta){
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        saldo=0;
             
     
    }
    /*methods-----------*/
    public void mostrarCuentaBancaria(){
        System.out.println("Nombres del titular: "+nombresTitular);
        System.out.println("Apellidos del titular: "+apellidosTitular);
        System.out.println("Número de cuenta: " +numeroCuenta);
        System.out.println("Tipo de cuenta: "+tipoCuenta);
    }
    
    public void mostrarSaldoCuenta(){
        System.out.println("Saldo: $"+saldo);
    }
    
    public boolean consignarSaldo(double valorAConsignar){
        if(valorAConsignar>0){
            saldo+=valorAConsignar;
            System.out.println("Se consignó: $"+ valorAConsignar+ "  El nuevo saldo es de: $"+saldo);
            return true;
        }else{
            System.out.println("La consignación debe de ser mayor a cero.");
            return false;
        }
    }
        
    public boolean retirarSaldo(double valorARetirar){
        if((valorARetirar<=saldo)&&(valorARetirar>0)){
            saldo-=valorARetirar;
            System.out.println("Se retiró: $"+valorARetirar+"  El nuevo saldo es de: $"+saldo);
            return true;
        }else{
            System.out.println("El retiro debe ser menor al saldo actual.");
            return false;
        }
    }
    
        
                  
}
