package cap392_Aula1;

public class Test {
	public static void main(String[] args) {
		Dispatcher dispatcher = Dispatcher.getInstance();
		RecebedorConta recebedorConta = new RecebedorConta();
		RecebedorImprime recebedorImprime = new RecebedorImprime();
		dispatcher.addListener(recebedorConta);
		dispatcher.addListener(recebedorImprime);
		
		//1. A classe recebe uma String no construtor e envia um evento contendo essa String. O evento
		//é gerado a cada 5 segundos.
		Gerador gerador = new Gerador("Evento a cada 5 s");
		Gera5SegundosSimples geraEventoSimples = new Gera5SegundosSimples();
		gerador.geraEvento = geraEventoSimples;
		gerador.geraEventos();
		
		//2. A classe recebe uma String no construtor e envia um evento contendo essa String mais o
		//momento geração do evento (em milisegundos). O evento é gerado em intervalos que
		//variam aleatoriamente entre 1 a 10 segundos.
		Gerador gerador2 = new Gerador("Evento random");
		GeraAleatorioComTempo geraAleatorioComTempo = new GeraAleatorioComTempo();
		gerador2.geraEvento = geraAleatorioComTempo;
		gerador2.geraEventos();
		
		//EXTRA 1: Surgiu o requisito de se criar uma classe geradora de eventos que gera o eventos em
		//intervalos que variam de 1 a 10 segundos e que gera o evento apenas com a String. Como fazer isso
		//sem duplicar código?
		Gerador gerador3 = new Gerador("Evento random Simples");
		GeraAleatorioSimples geraAleatorioSimples = new GeraAleatorioSimples();
		gerador3.geraEvento = geraAleatorioSimples;
		gerador3.geraEventos();
		
		//EXTRA 2: Surgiu o requisito de se criar uma classe que ao mesmo tempo recebe eventos e gera
		//eventos. Toda vez que ela receber um evento com uma String, ela gera um novo evento que contém
		//uma lista de Strings já recebidas por ela. Como adequar a classe as duas hierarquias?
		Recebedor geradorRecebedor = new GeradorRecebedor();
		dispatcher.addListener(geradorRecebedor);

	}
}
