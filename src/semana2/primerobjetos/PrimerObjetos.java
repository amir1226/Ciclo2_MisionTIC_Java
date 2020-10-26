
package semana2.primerobjetos;

/**
 *
 * @author Amir
 */
    
public class PrimerObjetos {

    public static void main(String[] args) {

        Persona primeraP= new Persona("Amir",25,'H',64,169);
        Persona segundaP= new Persona("Pepita",17,'F',57,160);
        Persona terceraP= new Persona("Juan",25,'h',80,171);

        System.out.println(primeraP.informacionPersona());
        System.out.println(segundaP.informacionPersona());
        System.out.println(terceraP.informacionPersona());
        
        System.out.println(primeraP.quienMayor(segundaP));
        System.out.println(primeraP.quienMayor(terceraP));
        
    }
    
}
