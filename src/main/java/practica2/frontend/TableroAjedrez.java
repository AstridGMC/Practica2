
package practica2.frontend;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import practica2.backend.tablero.Tablero;

public class TableroAjedrez {
    EscogerPieza pieza = new EscogerPieza();
    public static JLabel[][] casillas;
    static int fila;
    static int columna;
    static JLabel casilla; 

    public static JLabel getCasilla() {
        return casilla;
    }

    public static void setCasilla(JLabel casilla) {
        TableroAjedrez.casilla = casilla;
    }
    
    

    public static JLabel[][] getCasillas() {
        return casillas;
    }

    public static void setCasillas(JLabel[][] casillas) {
        TableroAjedrez.casillas = casillas;
    }

    public static int getFila() {
        return fila;
    }

    public static void setFila(int fila) {
        TableroAjedrez.fila = fila;
    }

    public static int getColumna() {
        return columna;
    }

    public static void setColumna(int columna) {
        TableroAjedrez.columna = columna;
    }
    
    
    
    public  JPanel TableroAjedrez() {
    
        JPanel PanelTableroAjedrez = new JPanel();
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        casillas = new JLabel[Tablero.getFilas()][Tablero.getColumnas()];
        for(int y=0; y < casillas.length; y++) {
            for(int x=0; x < casillas[y].length; x++) {
                casilla = new JLabel();
                PanelTableroAjedrez.add(casilla);
                listenerCasilla(casilla,y,x);
                if((y+x+1)%2==0){
                    // pintar etiqueta color blanco
                    casilla.setBackground(Color.BLACK);
                    casilla.setBorder(border);
                    casilla.setOpaque(true);
                    casillas[y][x]=casilla;
                }else{
                    // pintar etiqueta color negro
                    casilla.setBackground(Color.WHITE);
                    casilla.setBorder(border);
                    casilla.setOpaque(true);
                    casillas[y][x]=casilla;
                }
        }
    }
    PanelTableroAjedrez.setLayout(new GridLayout(Tablero.getFilas(), Tablero.getFilas()));
    return PanelTableroAjedrez;
    }    
    
    public static  void obtenerCasilla(int i, int j){
        fila = i;
        columna =j;
    }
    
    public void listenerCasilla(JLabel casilla,int i, int j){
        MouseListener oyenteDeRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                obtenerCasilla( i, j);
                
                pieza.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                 pieza.setVisible(true);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
 
            }

            @Override
            public void mouseExited(MouseEvent e) {
           
            }
        };
        casilla.addMouseListener(oyenteDeRaton);
        
        
    }
    
}
