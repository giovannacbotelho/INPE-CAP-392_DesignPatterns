package cap392_Aula1;

public abstract class Evento {
	private String conteudo;

	Evento(String conteudo){
		this.setConteudo(conteudo);
	}
	public abstract void imprime();

	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
}
