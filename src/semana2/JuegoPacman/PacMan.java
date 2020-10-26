
package semana2.JuegoPacman;

/**
 *
 * @author Amir
 */
public class PacMan {
    String color;
    int puntuacion;
    int vidasRestantes;
    PacMan (String color, int puntuacion, int vidasRestantes){
        this.color=color;
        this.puntuacion=puntuacion;
        this.vidasRestantes=vidasRestantes;
    }
    
    public void sumarPuntuacion(){
        this.puntuacion ++;
    } 
    
    public int obtenerPuntuacion(){
        return this.puntuacion;
    } 
    
    public void restarVida(){
        this.vidasRestantes--;
    } 
    
    
    public boolean sigueVivo(){
        return this.vidasRestantes>=0;
    } 
}
