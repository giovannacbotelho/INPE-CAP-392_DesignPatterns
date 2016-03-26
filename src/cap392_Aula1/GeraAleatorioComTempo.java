package cap392_Aula1;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GeraAleatorioComTempo implements GeraEvento {

	@Override
	public void gera(final String conteudo) {
		Random rand = new Random();
		int currRand;
		currRand = rand.nextInt(10) +1;
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		Runnable task = new Runnable() {
			public void run() {
				Evento evento = new EventoComTempo(conteudo);
				Dispatcher dispatcher = Dispatcher.getInstance();
				dispatcher.dispatch(evento);
			}
		};
		scheduler.scheduleAtFixedRate(task, 0, currRand, TimeUnit.SECONDS);	}

}
