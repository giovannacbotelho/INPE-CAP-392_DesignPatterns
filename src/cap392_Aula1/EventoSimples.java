package cap392_Aula1;

public class EventoSimples extends Evento {

	EventoSimples(String conteudo) {
		super(conteudo);
	}

	@Override
	public void imprime() {
		System.out.println("Conte�do do evento: " + this.getConteudo());
	}

}
