/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Amir
 */


import java.util.Scanner;


public class calculadora {
    public static double suma (double x, double y){
        return x+y;
    }
    
    public static double resta (double x, double y){
        return x-y;
    }
    
    public static double multiplicacion (double x, double y){
        return x*y;
    }
    
    public static double divisionEntera (double x, double y){
        int resultado = (int)(x/y);
        return resultado;
    }
    
    public static double divisionReales (double x, double y){
        return x/y;
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       boolean bandera=true;
       System.out.println("Operaciones habilitadas:\n1.Suma\n2.Resta"
               + "\n3.Multiplicación\n4.División entera\n5.División decimales");
       while(bandera){
        System.out.print("Ingrese el número de la operación que quiere realizar: ");
        short opcion = sc.nextShort();
        
        switch(opcion){
            case 1:
                System.out.println("Ingrese los números que quiere sumar:");
                double num1 = sc.nextDouble();
                double num2 = sc.nextDouble();
                System.out.println("La suma es igual a "+ suma(num1,num2));
                break;
            case 2:
                System.out.println("Ingrese los números que quiere restar:");
                double num3 = sc.nextDouble();
                double num4 = sc.nextDouble();
                System.out.println("La resta es igual a "+ resta(num3,num4));
                break;
            case 3:
                System.out.println("Ingrese los números que quiere multiplicar:");
                double num5 = sc.nextDouble();
                double num6 = sc.nextDouble();
                System.out.println("La multiplicación es igual a "+ multiplicacion(num5,num6));
                break;
            case 4:
                System.out.println("Ingrese los números que quiere dividir:");
                double num7 = sc.nextDouble();
                double num8 = sc.nextDouble();
                System.out.println("La división es igual a "+ divisionEntera(num7,num8)
                        + " y el residuo es " + num7%num8);
                break;
            case 5:
                System.out.println("Ingrese los números que quiere dividir:");
                double num9 = sc.nextDouble();
                double num10 = sc.nextDouble();
                System.out.println("La división con decimales es igual a "+ divisionReales(num9,num10));
                break;
            default:
                System.out.println("Opción errónea");
                break;
        }
        
        System.out.print("Quiere hacer otra operación (si/no): ");
        String continuar = sc.next();
        if(continuar.equals("no")){
            bandera = false;
        }else if(!continuar.equals("si")){
            while(true){
                System.out.println("Opción incorrecta, por favor escriba si o no: ");
                continuar = sc.next();
                if (continuar.equals("no")){
                    bandera = false;
                    break;
                }else if(continuar.equals("si")){
                    break;
                }
            }
        }
       }
    }
}