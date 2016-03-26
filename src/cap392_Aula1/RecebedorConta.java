package cap392_Aula1;

public class RecebedorConta extends Recebedor {
	private int count;
	@Override
	public void recebeEvento(Evento evento) {
		count++;
		System.out.println("Count:" + count);
	}

}
