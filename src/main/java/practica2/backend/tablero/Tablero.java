
package practica2.backend.tablero;

public class Tablero {
    
    private static int filas;
    private static int columnas;
    private static int[][] casillas;

    public static int getFilas() {
        return filas;
    }

    public static void setFilas(int filas) {
        Tablero.filas = filas;
    }

    public static int getColumnas() {
        return columnas;
    }

    public static void setColumnas(int columnas) {
        Tablero.columnas = columnas;
    }

    public static  int[][] getCasillas() {
        return casillas;
    }

    public static void setCasillas(int i, int j,int casillas) {
        Tablero.casillas[i][j]= casillas;
        
    }

    public Tablero(int filas, int columnas) {
        Tablero.filas = filas;
        Tablero.columnas = columnas;
    }
    
    
    
    public static int[][] especificarTablero(){
        casillas = new int[filas][columnas];
        for(int i=0; i < filas ; i++){
            for(int j=0; j<columnas; j++){
                if((i+j)%2==0){
                    casillas[i][j] = 0;
                }else if((i+j)%2!=0){
                    casillas[i][j]=1;
                }
            }
        }
        return casillas;
    }
}
