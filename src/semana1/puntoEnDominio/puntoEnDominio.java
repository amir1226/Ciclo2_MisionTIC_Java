/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1.puntoEnDominio;

import java.util.Scanner;

/**
 *
 * @author Amir
 */
public class puntoEnDominio {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float x = entrada.nextFloat();
        float y = entrada.nextFloat();
        if (!(x > -2 && x <= 3.5 && y >=-1.25 && y < 1.5) || (x*x + y*y <=1)){
            System.out.println("El punto (" + x + "," + y + ") se encuentra en el dominio");
        } 
        else{
            System.out.println("El punto (" + x + "," + y + ") no se encuentra en el dominio");
        }
    }
}
