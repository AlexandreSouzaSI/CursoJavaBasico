package listaExercicio3;

public class lampada {

	private boolean ligada;
	

	public lampada(boolean ligada) {

		this.ligada = ligada;
	}
	

	public void ligar() {
		ligada = true;
	}
	

	public void desligar() {
		ligada = false;
	}
	

	public void imprimir() {
		if (ligada) {
			System.out.println("L�mpada ligada");
		} else {
			System.out.println("L�mpada desligada");
		}
	}
}
