
package practica2.backend.jugador;
import java.util.Comparator;

public class DatosPuntos implements Comparator<Jugador>{
     
    @Override
    public int compare(Jugador jugador1, Jugador jugador2){
        if(jugador1.getPuntos()>jugador2.getPuntos()){
            return -1;
        }else if(jugador1.getPuntos()>jugador2.getPuntos()){
            return 0;
        }else{
            return 1;
        }
    } 
}

        
