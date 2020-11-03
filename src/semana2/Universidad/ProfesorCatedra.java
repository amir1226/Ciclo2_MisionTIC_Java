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
public class ProfesorCatedra extends Profesor{

    public ProfesorCatedra(String nombre, String apellidos, int edad, int horasTrabajo, int horasCatedra, int salario, String materias) {
        super(nombre, apellidos, edad, horasTrabajo, horasCatedra, salario, materias);
    }

    @Override
    String dictarClase() {
        String frase = this.nombre + " " + this.apellidos + " esta en clase";
        return frase;
    }

    @Override
    boolean masCargaLaboral() {
        return horasCatedra>horasTrabajo;
    }
    

}
