/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2.Universidad;

/**
 *
 * @author Amir
 */
public class Universidad {

    public static void main(String[] args) {
        ProfesorPlanta prof1;
        prof1 = new ProfesorPlanta("Arturo", "Pérez Rodríguez", 50 , 40, 16, 4800000, "Cálculo integral", 8, 10);
        System.out.println(prof1.dictarClase());
        System.out.println("Exceso carga laborarl: " + prof1.masCargaLaboral());
        
        ProfesorPlanta prof2 = new ProfesorPlanta("Pedro", "Gutiérrez Aristizabal", 45 , 40, 20, 4200000, "Química Orgánica", 10, 12);
        System.out.println(prof2.dictarClase());
        System.out.println("Exceso carga laborarl: " + prof2.masCargaLaboral());
        
        ProfesorCatedra profC1 = new ProfesorCatedra("Pepito", "El catedratico", 30, 8, 8, 3000000, "Biología básica");
        System.out.println(profC1.dictarClase());
        System.out.println("Exceso carga laborarl: " + profC1.masCargaLaboral());
        
        ProfesorCatedra profC2 = new ProfesorCatedra("Bob", "El constructor", 28, 4, 6, 1800000, "Fundamentos de programación");
        System.out.println(profC2.dictarClase());
        System.out.println("Exceso carga laborarl: " + profC2.masCargaLaboral());
        
        
    }
}
