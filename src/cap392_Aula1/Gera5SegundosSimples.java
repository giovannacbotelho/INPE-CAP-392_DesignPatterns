package cap392_Aula1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Gera5SegundosSimples implements GeraEvento {

	@Override
	public void gera(final String conteudo) {
		ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
		exec.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				Evento evento = new EventoSimples(conteudo);
				Dispatcher dispatcher = Dispatcher.getInstance();
				dispatcher.dispatch(evento);
			}
		}, 0, 5, TimeUnit.SECONDS);
	}
}
