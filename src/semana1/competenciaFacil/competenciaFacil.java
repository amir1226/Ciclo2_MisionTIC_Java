/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1.competenciaFacil;

/**
 *
 * @author Amir
 */
import java.util.Scanner;
    
    public class competenciaFacil {
        
       public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Deme el número de datos: ");
       int n = sc.nextInt();
       boolean esFacil = true;
       
       for(int i=0; i<n; i++){
           System.out.print("Ingrese el dato de la persona " + (i+1) +": ");
           short dato = sc.nextShort();
           if (dato != 0){
               esFacil = false;
           }  
       }    
       
       if (esFacil){
           System.out.println("FACIL");
       }else{
           System.out.println("DIFICIL");
       }
    }
}