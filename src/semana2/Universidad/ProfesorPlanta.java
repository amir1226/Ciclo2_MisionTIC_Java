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
public class ProfesorPlanta extends Profesor {
    
    int horasAtencion;
    int horasInvestigacion;
    
    public ProfesorPlanta(String nombre, String apellidos, int edad, int horasTrabajo, int horasCatedra, int salario, String materias,
            int horasAtencion, int horasInvestigacion) {
        super(nombre, apellidos, edad, horasTrabajo, horasCatedra, salario, materias);
        this.horasAtencion = horasAtencion;
        this.horasInvestigacion = horasInvestigacion;
    }

    @Override
    public String dictarClase() {
        double numero;
        String frase;
        numero =  Math.random();
        
        if (numero > 0.5){
            frase = this.nombre + " " + this.apellidos + " esta en clase";
        }else{
            frase = this.nombre + " " + this.apellidos + " no esta en clase";
        }
        
        return frase;
    }

    
    @Override
    public boolean masCargaLaboral() {
        int total = this.horasAtencion + this.horasInvestigacion + this.horasCatedra;
        
        return total>horasTrabajo;
    }
    
}
