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
public class Empleado extends Persona{
    
    int horasTrabajo;
    int salario;
    
    public Empleado (String nombre, String apellidos,int edad, int horasTrabajo, int salario){
        super(nombre, apellidos, edad);
        this.horasTrabajo = horasTrabajo;
        this.salario = salario;
    }
    
    public int getHorasTrabajo(){
        return horasTrabajo;
    }
    
    public int salario(){
        return horasTrabajo;
    }
    
    @Override
     public String informacion(){
        String frase = this.nombre + " " + this.apellidos + " trabaja en la universidad " + horasTrabajo + 
                " horas y percibe un salario de $" + salario ;
        return frase;
    }
}
