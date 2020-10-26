
package semana2.JuegoPacman;
public class JuegoPacman {
    public static void main(String[] args) {
        PacMan personaje = new PacMan("azul",49,3);
        Tablero primerTab = new Tablero(personaje,0);
        primerTab.comprobarNivelActual();
        System.out.println(primerTab.nivel);
        
        personaje.sumarPuntuacion();
        primerTab.comprobarNivelActual();
        System.out.println(primerTab.nivel);
        
        personaje.sumarPuntuacion();
        primerTab.comprobarNivelActual();
        System.out.println(primerTab.nivel);
    }
}
