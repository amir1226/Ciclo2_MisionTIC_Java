/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1.propagacion;

import java.util.Scanner;
/**
 *
 * @author Amir
 */

public class propagacion {
    
    public static double paisA (double n){
        return n*1.02;
    }
    
    public static double paisB (double n){
        return n*1.03;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        int conteo = 1;
        while(m<n){
            conteo++;
            n=paisA(n);
            m=paisB(m);
        }      
        System.out.println("Después de " + conteo + " días el país B supero los contagiados del país A");
    }
}
