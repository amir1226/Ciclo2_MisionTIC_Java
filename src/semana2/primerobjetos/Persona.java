
package semana2.primerobjetos;

/**
 *
 * @author Amir
 */
public class Persona{
    //Atributos de la clase Persona//
    public String nombre;
    public int edad;
    public char genero;
    public float peso;
    public int altura;
       
    //Contructor de la clase Persona//
    Persona(String nombre,  int edad,  char genero,  float peso,  int altura) {
        this.nombre =nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura; 
    } 
    
    //Métodos de la clase Persona//
    public float calcularIMC(){
        float alturaEnm = (float) (this.altura/100.0);
        return  this.peso/alturaEnm;
    }
    
    public boolean esMayorDeEdad(){
        return  this.edad >= 18;
    }
    
    //Método para crear una frase con la información de la persona(instancia)//
    public String informacionPersona(){
        String frase = nombre + " tiene " + Integer.toString(this.edad) + " años, es de genero ";
        if (this.genero == 'H' || this.genero == 'h'){
            frase = frase + "masculino.";
        }
        if (this.genero == 'F' || this.genero == 'f'){
            frase = frase + "femenino.";
        }
        frase = frase + " Quien tiene un peso de " + Float.toString(this.peso) + " kg y altura de " + 
                Integer.toString(this.altura) + " cm.";
               
        return frase;
    }
    
    public String quienMayor(Persona otro){
        String elMayor;
        if (this.edad > otro.edad){
            elMayor=this.nombre + " es mayor que " + otro.nombre;
        } else if (this.edad < otro.edad){
            elMayor=otro.nombre + " es mayor que " + this.nombre;
        }else{
            elMayor=this.nombre + " y " + otro.nombre + " tienen la misma edad!";
        }
        
        return elMayor;
    }
}