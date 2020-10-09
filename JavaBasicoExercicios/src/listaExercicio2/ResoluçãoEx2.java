package listaExercicio2;

public class ResoluçãoEx2 {

	public static void main(String[] args) {
		
		/*Crie a classe Fracao, que representa uma fração matemática. Esta classe deve ser capaz de
		armazenar o numerador e o denominador da fração. Ela ainda deve ter métodos que recebem
		uma fração como parâmetro, multiplicam ambas as frações, e retornam uma nova fração
		como resultado.
		Crie um programa simples que instancia duas frações, define seus valores, calcula o valor da
		multiplicação entre elas e mostra o resultado.
		Dica: a multiplicação de 2 frações é feita através da multiplicação dos numeradores e dos
		denominadores das frações, e o valor resultante é uma terceira fração.*/
	
			Fracao f1 = new Fracao();
			f1.definirValores(5, 2);
			
			Fracao f2 = new Fracao();
			f2.definirValores(1, 7);
			
			Fracao f3 = f1.multiplicar(f2);
			
			System.out.println(f3.obterFracao());
			
			System.out.println(f3.calcularValor());
	}
}
