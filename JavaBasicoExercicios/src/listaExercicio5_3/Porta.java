package listaExercicio5_3;

public class Porta implements Cloneable {

	private double altura;
	private double largura;
	private boolean aberta;
	
	
	
	public Porta(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
		this.aberta = false;
	}

	public void abrir() {
		aberta = true;
		System.out.println("Porta aberta!");
	}
	
	public void fechar() {
		aberta = false;
		System.out.println("Porta Fechada!");
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double getLargura() {
		return largura;
	}
	
	public boolean isAberta() {
		return aberta;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Porta p = new Porta(this.altura, this.largura);
		p.aberta = this.aberta;
		return p;
	}
	
}
