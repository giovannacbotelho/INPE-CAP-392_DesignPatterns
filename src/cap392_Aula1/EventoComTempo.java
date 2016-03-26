package cap392_Aula1;

public class EventoComTempo extends Evento {

	EventoComTempo(String conteudo) {
		super(conteudo);
	}

	@Override
	public void imprime() {
		System.out.println("Conteúdo do evento: " + this.getConteudo() + System.currentTimeMillis());
	}

}
