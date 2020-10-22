/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aniosBisiestos;

import javax.swing.JOptionPane;

/**
 *
 * @author Amir
 */
public class aniosBisiestos {
    public static boolean calculo_bisiesto(int year){
        if (year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Programa para consultar el número de días en un mes del año.");
        String entrada1 = JOptionPane.showInputDialog("Ingresa el número de veces que quieres consultar");
        short n = Short.parseShort(entrada1);
        
        for(int i=0;i<n;i++){
            String entrada2 = JOptionPane.showInputDialog("Ingrese el año");
            int anio = Integer.parseInt(entrada2);
            String entrada3 = JOptionPane.showInputDialog("Ingrese el número del mes");
            short mes = Short.parseShort(entrada3);
            
            boolean bisiesto = calculo_bisiesto(anio);
            if(bisiesto){
                System.out.println("El año "+anio+ " es bisiesto");
            }
            else{
                System.out.println("El año "+anio+ " no es bisiesto");
            }
            switch(mes){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("El mes " + mes + " tiene 31 días");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("El mes " + mes + " tiene 30 días");
                    break;
                case 2:
                    if(bisiesto){
                        System.out.println("El mes " + mes + " tiene 29 días");
                    }else{
                        System.out.println("El mes " + mes + " tiene 28 días");
                    } 
                    break;
            }
        }
    }
}
