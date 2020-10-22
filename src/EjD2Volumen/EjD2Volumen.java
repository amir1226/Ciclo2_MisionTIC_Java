/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjD2Volumen;

import java.util.Scanner;
/**
 *
 * @author Amir
 */

public class EjD2Volumen {
 
    public static double volEsfera(double r)
    {
    double pi = Math.PI;
    double volumen= 4/3*pi*Math.pow(r, 3);
    return volumen;
    }
    
    public static double volCono(double r, double h)
    {
    double pi = Math.PI;
    double volumen= 1/3*pi*h*r*r;
    return volumen;
    }
    
    public static double volTotal(double r1, double r2, double h)
    {
    return volEsfera(r1)+volCono(r2,h);
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.print("Deme el radio de la esfera: ");
       double radioEsfera= sc.nextDouble();
       System.out.print("Deme el radio del cono: ");
       double radioCono= sc.nextDouble();
       System.out.print("Deme la áltura del cono: ");
       double hCono= sc.nextDouble();
       double volumen = volTotal(radioEsfera,radioCono,hCono);
       System.out.print("El volumen total es: "+ volumen);
       
    }
}
