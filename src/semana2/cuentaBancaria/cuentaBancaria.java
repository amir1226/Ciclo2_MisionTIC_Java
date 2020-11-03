package semana2.cuentaBancaria;

/**
 *
 * @author Amir
 */

import java.util.Scanner;

public class cuentaBancaria {
     public static void main(String[] args) {       
        Cuenta cuentaPepito= new Cuenta("Pepito","10213214123", 1);
        System.out.print("Bienvenido " + cuentaPepito.retornarNombre() + ", ");
        System.out.println(cuentaPepito.mostrarSaldo());
        
        System.out.println("1. Ingresar dinero a la cuenta");
        System.out.println("2. Retirar dinero de la cuenta");
        System.out.println("3. Salir");
        System.out.print("Por favor indique la opción (número) que desea realizar: ");
        
        Scanner sc = new Scanner(System.in);
        
        short opcion = sc.nextShort();
        
        while(opcion >3 || opcion<1){
            System.out.print("Opción incorrecta, por favor dígite un número del 1 al 3: ");
            opcion = sc.nextShort();
        }
        
        while (opcion != 3){
            // Código en caso que oprima 1 o 2//
            switch (opcion){
            case 1:
                System.out.print("Cantidad a ingresar: ");
                int dinero = sc.nextInt();
                cuentaPepito.ingresarDinero(dinero);
                System.out.println(cuentaPepito.verDetalles());
                break;
                
            case 2:
                System.out.print("Cantidad a retirar: ");
                dinero = sc.nextInt();
                byte i=0;
                while(cuentaPepito.retirarDinero(dinero) == false){
                    System.out.println("Cantidad no puede ser mayor a su saldo, vuelva a ingresar cantidad: ");
                    i++;
                    dinero = sc.nextInt();
                    if(i>3){
                        System.out.println("Número de intentos superados");
                        break; 
                    }
                }
                System.out.println(cuentaPepito.verDetalles());
                }   
            
            // Solicitar nuevamente la opción, hasta que se oprima un 3 para salir //
            System.out.print("Por favor indique la opción (número) que desea realizar: ");
            opcion = sc.nextShort();
            while(opcion >3 || opcion<1){
                System.out.print("Opción incorrecta, por favor dígite un número del 1 al 3: ");
                opcion = sc.nextShort();
            }
             
        }
        System.exit(0);
    }
}