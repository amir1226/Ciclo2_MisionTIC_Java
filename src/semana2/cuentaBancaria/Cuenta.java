
package semana2.cuentaBancaria;

/**
 *
 * @author Amir
 */
public class Cuenta {
    private final String nombreCliente;
    private final String cedula;
    private final int numeroCliente;
    private int saldo;
    
    Cuenta(String nombre, String cedula, int numeroCliente, int saldo){
        this.nombreCliente = nombre;
        this.cedula = cedula;
        this.numeroCliente = numeroCliente;
        this.saldo = saldo;
    }
    
    public void mostrarSaldo(){
        System.out.println("el saldo de su cuenta es: $" + this.saldo);
    }
    
    public void retirarDinero(int cantidad){
        this.saldo -= cantidad;
    }
    
    public void ingresarDinero(int cantidad){
        this.saldo += cantidad;
    }
    
    public void verDetalles(){
        System.out.println("Nombre del cliente: " + this.nombreCliente);
        System.out.println("Cédula: " + this.cedula);
        System.out.println("Saldo de la cuenta: $" + this.saldo);
    }
    
    public int retornarSaldo(){
        return this.saldo;
    }
}
