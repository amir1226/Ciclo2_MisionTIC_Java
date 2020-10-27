
package semana2.JuegoPacman;

/**
 *
 * @author Amir
 */
public class PacMan {
    String color;
    int puntuacion;
    int vidasRestantes;
    
    PacMan (){
        color = "Amarillo";
        puntuacion = 0;
        vidasRestantes = 3;
    }
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
