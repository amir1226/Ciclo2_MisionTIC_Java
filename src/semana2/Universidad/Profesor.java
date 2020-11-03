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
 public abstract class Profesor extends Empleado{
    
    int horasCatedra;
    String materias;
    
    public Profesor(String nombre, String apellidos, int edad, int horasTrabajo, int horasCatedra, int salario, String materias) {
        super(nombre, apellidos, edad, horasTrabajo, salario);
        this.horasCatedra = horasCatedra;
        this.materias = materias;
    }
    
    @Override
     public String informacion(){
        String frase = this.nombre + " " + this.apellidos + " es profesor de planta de la(s) materia(s) " + materias;
        return frase;
    }
    
    abstract String dictarClase();
    
    abstract boolean masCargaLaboral();
    
}
