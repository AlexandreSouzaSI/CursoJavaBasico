package listaExercicio5_3;

public class Resolucao {

	public static void main(String[] args) throws Exception {
		
		Porta p1 = new Porta(4.5, 2.2);
		p1.abrir();
		
		System.out.println("p1 -> altura = " + p1.getAltura());
		System.out.println("p1 -> largura = " + p1.getLargura());
		System.out.println("p1 -> aberta = " + p1.isAberta());
		
		Porta p2 = (Porta) p1.clone();
		
		System.out.println("p2 -> altura = " + p2.getAltura());
		System.out.println("p2 -> largura = " + p2.getLargura());
		System.out.println("p2 -> aberta = " + p2.isAberta());
	}
}
