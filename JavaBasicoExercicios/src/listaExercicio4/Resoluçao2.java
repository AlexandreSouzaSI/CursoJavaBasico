package listaExercicio4;

public class Resoluçao2 {

	public static void main(String[] args) {
	
		Automovel a1 = new Automovel();
		a1.ligar();
		System.out.println(a1.isLigado());
		a1.desligar();
		System.out.println(a1.isLigado());
		
		Motocicleta m1 = new Motocicleta();
		m1.ligar();
		System.out.println(a1.isLigado());
		m1.desligar();
		System.out.println(a1.isLigado());
		
		Onibus o1 = new Onibus();
		o1.ligar();
		System.out.println(a1.isLigado());
		o1.desligar();
		System.out.println(a1.isLigado());
	}
	
}
