
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
        
        
        /*constructor use*/    
        CuentaBancaria cuenta = new CuentaBancaria(
                nombresTitular,
                apellidosTitular,
                numeroCuenta,
                TipoCuenta
        );
        /*calling methods*/
        cuenta.mostrarCuentaBancaria();
        cuenta.mostrarSaldoCuenta();
        cuenta.consignarSaldo(200000);
        cuenta.consignarSaldo(300000);
        cuenta.retirarSaldo(400000);
    }
}
