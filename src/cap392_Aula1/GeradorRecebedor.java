package cap392_Aula1;

import java.util.ArrayList;
import java.util.List;

public class GeradorRecebedor extends Recebedor {

	public List<String> list = new ArrayList<String>();
	public Gerador gerador;
	String lista = "";

	@Override
	public void recebeEvento(Evento evento) {
		list.add(evento.getConteudo());
		
		for(String c : this.list){
			lista += c;
		}
		Gerador gerador = new Gerador(lista);
		GeraSimples geraEventoSimples = new GeraSimples();
		gerador.geraEvento = geraEventoSimples;
		gerador.geraEventos();
	}
}
