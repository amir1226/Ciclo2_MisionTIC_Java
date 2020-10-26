
package semana2.JuegoPacman;

/**
 *
 * @author Amir
 */
public class Tablero {
    PacMan personaje = new PacMan("amarillo",0,3);
    int nivel = 0;       
    Tablero (PacMan personaje, int nivel){
        this.personaje = personaje;
        this.nivel=nivel;
    }
    
    public void comprobarNivelActual(){
        int resultado= this.personaje.obtenerPuntuacion()/25;
        this.nivel=resultado;
    }
}
