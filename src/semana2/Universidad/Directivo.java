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
public class Directivo extends Empleado{
    
    String cargo;

    public Directivo(String nombre, String apellidos, int edad, short horasTrabajo, int salario, String cargo) {
        super(nombre, apellidos, edad, horasTrabajo, salario);
        this.cargo = cargo;
    }
    
    public int getCargo(){
        return horasTrabajo;
    }
    
    @Override
     public String informacion(){
        String frase = this.nombre + " " + this.apellidos + " es " + this.cargo + 
                " en la universidad y percibe un salario de $" + salario ;
        return frase;
    }
    
    
}