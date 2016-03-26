package cap392_Aula1;

public class RecebedorImprime extends Recebedor {

	@Override
	public void recebeEvento(Evento evento) {
		evento.imprime();
	}

}
