
package semana2.JuegoTriki;

/**
 *
 * @author Amir
 */

public class Triki {
    private final char [][] tablero = new char [3][3];
    
    Triki(){
        for (char[] filas : tablero) {
            for (int j = 0; j<tablero.length; j++) {
                filas[j] = 'a';
            }
        }
       
    }
    
    public void marcarCasilla(char simbolo, int fila, int columna){
        if (simbolo == 'X' || simbolo == 'O' || simbolo == 'x' || simbolo == 'o') {
            this.tablero[fila][columna] = Character.toUpperCase(simbolo) ;
        } 
        else{
            System.out.println("Error, caracter debe ser 'X' o 'O'");
        }
    }
    
    public char verificarGanador(){
        
        char [] datos_fila = new char [3];
        char [] datos_columna = new char [3];
        // Arreglo de para almacenar 3 arreglos de filas y columnas//
        char[][] filas = { datos_fila, datos_fila, datos_fila};
        char[][] columnas = { datos_columna, datos_columna, datos_columna};
        
        for(char[] fila: filas){
            int k=0;
            for(short i=0; i<3; i++){
                fila[i] = this.tablero[k][i];
            }
            k++;
        }
        
        for(char[] columna: columnas){
            int l=0;
            for(short i=0; i<3; i++){
                columna[i] = this.tablero[i][l];
            }
            l++;
        }
        
        char [] diagonal1 = new char [3];
        char [] diagonal2 = new char [3];
        
        for(int fila=0;fila<3;fila++){
            for(int columna=0;columna<3;columna++){
                if (fila == columna){
                    diagonal1[fila]= this.tablero[fila][columna];
                }
                if((columna == 2 && fila == 0) || (fila == 2 && columna == 0) || (fila == 1 && columna == 1)){
                    diagonal2[fila]= this.tablero[fila][columna];
                }
            }
        }
        
        for(char[] fila: filas){
            if (fila[0] != 'a' && fila[0] == fila [1] && fila[1] == fila [2]){
                return fila[0];
            }
        }
        
        for(char[] columna: columnas){
            if (columna[0] != 'a' && columna[0] == columna [1] && columna[1] == columna [2]){
                return columna[0];
            }
        }
        
        if(diagonal1[0] != 'a' && diagonal1[0] == diagonal1[1] && diagonal1[1] == diagonal1[2]){
            return diagonal1[0];
        }else if (diagonal2[0] != 'a' && diagonal2[0] == diagonal2[1] && diagonal2[1] == diagonal2[2]){
            return diagonal2[0];
        }
        
        return 'a';
    }
    
    public char verificarCasilla(int fila, int columna){
        return this.tablero[fila][columna];
    }
}


