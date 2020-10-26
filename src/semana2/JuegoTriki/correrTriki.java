/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2.JuegoTriki;

import java.util.Arrays;

/**
 *
 * @author Amir
 */
public class correrTriki {
    public static void main(String[] args) {
        Triki prueba = new Triki();
        prueba.marcarCasilla('o', 0, 2);
        System.out.println(prueba.verificarGanador());
        prueba.marcarCasilla('o', 1, 1);
        System.out.println(prueba.verificarGanador());
        prueba.marcarCasilla('o', 2, 0);
        System.out.println(prueba.verificarGanador());
        
        
    }
    
    
}


