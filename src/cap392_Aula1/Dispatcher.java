package cap392_Aula1;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {

	private static Dispatcher dispatcher = new Dispatcher( );
	public List<Recebedor> listeners = new ArrayList<Recebedor>();

	public Dispatcher getDispatcher(){
		return this;
	}
	private Dispatcher(){}

	/* Static 'instance' method */
	public static Dispatcher getInstance( ) {
		return dispatcher;
	}

	public void addListener(Recebedor toAdd) {
		listeners.add(toAdd);
	}

	public void dispatch(final Evento evento){

		for (Recebedor hl : listeners){
			hl.recebeEvento(evento);
		}
	}
}
