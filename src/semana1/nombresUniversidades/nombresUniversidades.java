/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1.nombresUniversidades;

/**
 *
 * @author Amir
 */

import java.util.Scanner;

public class nombresUniversidades {
    
    public static String retornarUniversidad(String [] array){
        return array[1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Deme el número de urls: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++){
            System.out.print("Deme la url " + (i+1) + ": ");
            String universidad= sc.nextLine();
            String [] arrayUrl = universidad.split("\\.");
            System.out.println(retornarUniversidad(arrayUrl));
        }
    }
}
