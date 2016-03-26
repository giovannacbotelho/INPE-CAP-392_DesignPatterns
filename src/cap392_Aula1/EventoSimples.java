package cap392_Aula1;

public class EventoSimples extends Evento {

	EventoSimples(String conteudo) {
		super(conteudo);
	}

	@Override
	public void imprime() {
		System.out.println("Conteúdo do evento: " + this.getConteudo());
	}

}
