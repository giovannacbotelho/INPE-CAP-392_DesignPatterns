package cap392_Aula1;

public class GeraSimples implements GeraEvento {
	@Override
	public void gera(final String conteudo) {

		Evento evento = new EventoSimples(conteudo);
		evento.imprime();

	}
}
