
package practica2.backend.jugador;

import java.util.Comparator;


public class DatosFecha implements Comparator<Jugador>{
    
    @Override
    public int compare( Jugador o1, Jugador o2 ) {
		
		if (o1.getFecha().isBefore(o2.getFecha()) ){
			return -1;
		}
		if (o1.getFecha().isAfter(o2.getFecha()) ){
			return 1;
		}
		return 0;
	} 

}
