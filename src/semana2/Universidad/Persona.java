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
public class Persona {
    String nombre;
    String apellidos;
    int edad;
    
    public Persona (String nombre, String apellidos,int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellidos(){
        return this.apellidos;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public String informacion(){
        String frase = this.nombre + " " + this.apellidos + "tiene " + this.edad + " años.";
        return frase;
    }
}