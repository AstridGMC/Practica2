
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

public class Alfil extends Pieza {
    
    static int ancho = TableroAjedrez.getCasillas()[TableroAjedrez.getFila()][TableroAjedrez.getColumna()].getWidth();
    static int alto = TableroAjedrez.getCasillas()[TableroAjedrez.getFila()][TableroAjedrez.getColumna()].getHeight();
    
    //agrega una imagen a la etiqueta de la casilla seleccionada
    public static void agregarImagen(){
        ImageIcon torre = new ImageIcon("alfil.png");
        TableroAjedrez.getCasillas()[TableroAjedrez.getFila()][TableroAjedrez.getColumna()].setIcon(new ImageIcon(torre.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
        
        Tablero.getCasillas()[TableroAjedrez.getFila()][TableroAjedrez.getColumna()]=8;
        System.out.println(Tablero.getCasillas()[TableroAjedrez.getFila()][TableroAjedrez.getColumna()]);
    }
   
    public Alfil(){
    }

    @Override
    //valida si el movimiento es valido
    public void movimiento() {
      for (int i = 0; i < Tablero.getCasillas().length; i++) {
            for (int j = 0; j < Tablero.getCasillas()[0].length; j++) {
                if(Tablero.getCasillas()[i][j]==8){
                    if((TableroAjedrez.getFila()-TableroAjedrez.getColumna())-(i-j)==0){
                        JOptionPane.showMessageDialog(null, Juego.nuevo.getNombre()+" HAS PERDIDO!!");
                        Juego.nuevo.setNoPiezas(Juego.nuevo.getNoPiezas()-1);
                        Datos.noOrdenadoM();
                        Juego.panelTablero.setVisible(false);
                        break;
                    }else if((TableroAjedrez.getFila()+TableroAjedrez.getColumna())==(i+j)){
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
        movSuperiorA superiorA = new movSuperiorA();
        movSuperiorI superiorI = new movSuperiorI();
        movInferiorD inferiorD = new movInferiorD();
        movInferiorI inferiorI = new movInferiorI();
        
        inferiorD.start();
        superiorA.start();
        inferiorI.start();
        superiorI.start();
        
    }
}
    
   

class movInferiorI extends Thread {
    private static int a;
    private static int b;

     static int ancho = TableroAjedrez.getCasillas()[TableroAjedrez.getFila()][TableroAjedrez.getColumna()].getWidth();
    static int alto = TableroAjedrez.getCasillas()[TableroAjedrez.getFila()][TableroAjedrez.getColumna()].getHeight();
    
    @Override
    public void run(){
        for(a=0;a<= TableroAjedrez.getColumna();a++){
                    
            try {
                if(TableroAjedrez.getCasillas()!= null){
                    TableroAjedrez.getCasillas()[TableroAjedrez.getFila()+a][TableroAjedrez.getColumna()-a].setBackground(Color.red);
                }
                Thread.sleep(1000);
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alfil.class.getName()).log(Level.SEVERE, null, ex);
                
                }
        }
    }
}

class movInferiorD extends Thread {
    private static int a;
    private static int b;

    @Override
    public void run(){
        for(a=0;a<(Tablero.getFilas()+1)-(TableroAjedrez.getFila());a++){
                try {
                    if(TableroAjedrez.getCasillas()!= null){
                    TableroAjedrez.getCasillas()[TableroAjedrez.getFila()+a][TableroAjedrez.getColumna()+a].setBackground(Color.red);
                    }
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alfil.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
        
   
}
   
class movSuperiorA extends Thread{
       
    int c;
    int d;
   
    @Override
    public void run(){   
       for(c=0;c<=TableroAjedrez.getColumna()+1;c++){
            for( d=0;d<=TableroAjedrez.getFila()+1;d++){
                try {
                    if(TableroAjedrez.getCasillas()!= null){
                    TableroAjedrez.getCasillas()[TableroAjedrez.getFila()-d][TableroAjedrez.getColumna()-d].setBackground(Color.red);
                    }
                    Thread.sleep(1500);
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(movimientoSuperiorA.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
   }
}


class movSuperiorI extends Thread{
       
    int c;
    int d;
   
    @Override
    public void run(){   
       for(c=0;c<=TableroAjedrez.getColumna()+1;c++){
            for( d=0;d<=TableroAjedrez.getFila()+1;d++){
                try {
                    if(TableroAjedrez.getCasillas()!= null){
                    TableroAjedrez.getCasillas()[TableroAjedrez.getFila()-d][TableroAjedrez.getColumna()+d].setBackground(Color.red);
                    }
                    Thread.sleep(1500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(movimientoSuperiorI.class.getName()).log(Level.SEVERE, null, ex);
                }  
            }
        }
   }
}

