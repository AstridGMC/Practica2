 
package practica2.backend.piezas;
 
import java.awt.Color;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import practica2.backend.tablero.Tablero;
import practica2.frontend.Datos;
import practica2.frontend.Juego;
import practica2.frontend.TableroAjedrez;

public class Torre extends Pieza {
    
    
    static int ancho = TableroAjedrez.getCasillas()[TableroAjedrez.getFila()][TableroAjedrez.getColumna()].getWidth();
    static int alto = TableroAjedrez.getCasillas()[TableroAjedrez.getFila()][TableroAjedrez.getColumna()].getHeight();
    
    //agrega una imagen a la etiqueta de la casilla seleccionada
    public static void agregarImagen(){
        ImageIcon alfil = new ImageIcon("torre.png");
        TableroAjedrez.getCasillas()[TableroAjedrez.getFila()][TableroAjedrez.getColumna()].setIcon(new ImageIcon(alfil.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
        Tablero.getCasillas()[TableroAjedrez.getFila()][TableroAjedrez.getColumna()]=8;
        System.out.println(Tablero.getCasillas()[TableroAjedrez.getFila()][TableroAjedrez.getColumna()]);
    }
   
    public Torre(){
        
    }
//revisa si la pieza incertada puede comenrce a una pieza existente
    @Override
    public void movimiento() {
        for (int i = 0; i < Tablero.getCasillas().length; i++) {
            for (int j = 0; j < Tablero.getCasillas()[0].length; j++) {
                if(Tablero.getCasillas()[i][j]==8){
                    //if(((Tablero.getCasillas()[TableroAjedrez.getFila()][TableroAjedrez.getColumna()])-(Tablero.getCasillas()[TableroAjedrez.getFila()][j]))==0){
                    if(TableroAjedrez.getFila()==i) {   
                    JOptionPane.showMessageDialog(null, Juego.nuevo.getNombre()+" HAS PERDIDO!!");
                        Juego.nuevo.setNoPiezas(Juego.nuevo.getNoPiezas()-1);
                        Datos.noOrdenadoM();
                        Juego.panelTablero.setVisible(false);
                        break;
                    }else if(TableroAjedrez.getColumna()==j){
                            //(((Tablero.getCasillas()[TableroAjedrez.getFila()][TableroAjedrez.getColumna()])-(Tablero.getCasillas()[i][TableroAjedrez.getColumna()]))==0){
                        JOptionPane.showMessageDialog(null, Juego.nuevo.getNombre()+" HAS PERDIDO!!");
                        Juego.nuevo.setNoPiezas(Juego.nuevo.getNoPiezas()-1);  
                        Datos.noOrdenadoM();
                        Juego.panelTablero.setVisible(false);
                        break;
                    }
                }
            }
        }
    }
    
   @Override
   //pinta el camino por el que come la pieza
    public void camino() {
        movimientoSuperiorA superiorA = new movimientoSuperiorA();
        movimientoSuperiorI superiorI = new movimientoSuperiorI();
        movimientoInferiorD inferiorD = new movimientoInferiorD();
        movimientoInferiorI inferiorI = new movimientoInferiorI();
        
        superiorA.start();
        inferiorD.start();
        superiorI.start();
        inferiorI.start();
    }

}
    
   

class movimientoInferiorI extends Thread {
    private static int a;
    private static int b;

     static int ancho = TableroAjedrez.getCasillas()[TableroAjedrez.getFila()][TableroAjedrez.getColumna()].getWidth();
    static int alto = TableroAjedrez.getCasillas()[TableroAjedrez.getFila()][TableroAjedrez.getColumna()].getHeight();
    
    @Override
    public void run(){
            for(a=TableroAjedrez.getColumna();a<TableroAjedrez.getCasillas().length;a++){
                try {
                    TableroAjedrez.getCasillas()[TableroAjedrez.getFila()][a].setBackground(Color.cyan);
                    
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alfil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
   }
}

class movimientoInferiorD extends Thread {
    private static int a;
    private static int b;

    @Override
    public void run(){
        for(b=TableroAjedrez.getFila();b<TableroAjedrez.getCasillas()[0].length;b++){
            try {
                    
                TableroAjedrez.getCasillas()[b][TableroAjedrez.getColumna()].setBackground(Color.cyan);
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Alfil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
   
}
   
class movimientoSuperiorA extends Thread{
       
    int c;
    int d;
   
    @Override
    public void run(){   
       for(c=TableroAjedrez.getFila();c>=0;c--){
                try {
                    TableroAjedrez.getCasillas()[c][TableroAjedrez.getColumna()].setBackground(Color.cyan);
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(movimientoSuperiorA.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
   }
}


class movimientoSuperiorI extends Thread{
       
    int c;
    int d;
   
    @Override
    public void run(){   
        for( d=TableroAjedrez.getColumna();d>=0;d--){
            try {
                TableroAjedrez.getCasillas()[TableroAjedrez.getFila()][d].setBackground(Color.cyan);
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(movimientoSuperiorI.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
   }
}


