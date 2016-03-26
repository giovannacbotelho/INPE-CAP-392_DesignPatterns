package cap392_Aula1;

public class Gerador {
	public GeraEvento geraEvento;
	private String conteudo;
	
	public Gerador(String conteudo){
		this.conteudo = conteudo;
	}

	public void geraEventos(){
		geraEvento.gera(conteudo);
	}

}
