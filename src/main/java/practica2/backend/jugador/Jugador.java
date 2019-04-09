
package practica2.backend.jugador;

import java.time.LocalDateTime;
import practica2.frontend.Juego;

public class Jugador implements Comparable<Jugador>{
    protected String nombre;
    protected  int puntos;
    protected  int NoPiezas;
    protected LocalDateTime Fecha;
    
     

    public Jugador() {
    }

    public Jugador(String nombre,int puntos, int NoPiezas, LocalDateTime Fecha) {
        this.puntos = puntos;
        this.NoPiezas = NoPiezas;
        this.Fecha = Fecha;
        this.nombre = nombre;
    }
    
    public   String  getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public  int getPuntos() {
        return puntos;
    }

    public  void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public  int getNoPiezas() {
        return NoPiezas;
    }

    public  void setNoPiezas(int NoPiezas) {
        this.NoPiezas = NoPiezas;
    }

    public LocalDateTime getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDateTime Fecha) {
        this.Fecha = Fecha;
    }
    
    
    
    public void sumarPuntos(){
        puntos = (Juego.nuevo.getNoPiezas()*50);
        Juego.etiquetaPuntos.setText(Juego.nuevo.getPuntos()+"  puntos");
    }

    @Override
    //sobre escritura del metodo compareTO para ordenar AarrayList por nombre
    public int compareTo(Jugador uno ) {
        if(uno.getNombre().compareTo(nombre)>0){
            return -1;
        }else if(uno.getNombre().compareTo(nombre)<0){
            return 0;
        }else{
            return 1;
        }
    }
    
}

