
package semana2.cuentaBancaria;

/**
 *
 * @author Amir
 */
public class Cuenta {
    
    //Atributos //
    
    private final String nombreCliente;
    private final String cedula;
    private final int numeroCuenta;
    private int saldo;
    
    //Constructores //
    
    public Cuenta(String nombre, String cedula, int numeroCuenta){
        this.nombreCliente = nombre;
        this.cedula = cedula;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }
    
    public Cuenta( int numeroCuenta){
        this.nombreCliente = "Sin nombre";
        this.cedula = "No indica";
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }
    
    public Cuenta( int numeroCuenta, String nombre){
        this.nombreCliente = nombre;
        this.cedula = "No indica";
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }
    
    // Métodos //
    
    public String mostrarSaldo(){
        String frase = ("el saldo de su cuenta es: $" + this.saldo);
        return frase;
    }
    
    public boolean retirarDinero(int cantidad){
        if(saldoSuficiente( cantidad)){
            this.saldo -= cantidad;
            return true;
        }
        return false;
    }
    
    public boolean saldoSuficiente(int cantidad){
        return (this.saldo>=cantidad);
    }
    
    public void ingresarDinero(int cantidad){
        this.saldo += cantidad;
    }
    
    public String verDetalles(){
        
        String detalles = "Nombre del cliente: " + this.nombreCliente + "\nCédula: " + this.cedula
                + "\nSaldo de la cuenta: $" + this.saldo;
        return detalles;
    }
    
    public int retornarSaldo(){
        return this.saldo;
    }
    
    public String retornarNombre(){
        return this.nombreCliente;
    }
 
    public int getNumeroCuenta(){         
        return this.numeroCuenta;
    }
}
