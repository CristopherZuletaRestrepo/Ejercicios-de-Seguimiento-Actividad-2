
package cuentabancaria;
import cuentabancaria.CuentaBancaria.TiposCuenta;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*Data Input*/
        Scanner lector=new Scanner(System.in);
        System.out.print("Ingrese los nombres del titular: ");
        String nombresTitular=lector.nextLine();
        System.out.print("Ingrese los apellidos del titular: ");
        String apellidosTitular=lector.nextLine();
        System.out.print("Ingrese el numero de cuenta: ");
        int numeroCuenta=lector.nextInt();
        System.out.print("Ingrese el tipo de cuenta (AHORROS, CORRIENTE): ");
        String tipoCuentaLeida=lector.next();
        TiposCuenta TipoCuenta=TiposCuenta.valueOf(tipoCuentaLeida.toUpperCase());
        System.out.print("Ingrese el porcentaje de interes: ");
        double porcentajeInteres=lector.nextDouble();
        
        
        /*constructor use*/    
        CuentaBancaria cuenta1 = new CuentaBancaria(
                nombresTitular,
                apellidosTitular,
                numeroCuenta,
                TipoCuenta,
                porcentajeInteres
        );
        /*calling methods*/
        cuenta1.mostrarCuentaBancaria();
        cuenta1.mostrarSaldoCuenta();
        cuenta1.consignarSaldo(200000);
        cuenta1.consignarSaldo(300000);
        cuenta1.retirarSaldo(400000);
        cuenta1.interesAplicado();
    }
}
