package listaExercicio2;

public class Resolu��oEx2 {

	public static void main(String[] args) {
		
		/*Crie a classe Fracao, que representa uma fra��o matem�tica. Esta classe deve ser capaz de
		armazenar o numerador e o denominador da fra��o. Ela ainda deve ter m�todos que recebem
		uma fra��o como par�metro, multiplicam ambas as fra��es, e retornam uma nova fra��o
		como resultado.
		Crie um programa simples que instancia duas fra��es, define seus valores, calcula o valor da
		multiplica��o entre elas e mostra o resultado.
		Dica: a multiplica��o de 2 fra��es � feita atrav�s da multiplica��o dos numeradores e dos
		denominadores das fra��es, e o valor resultante � uma terceira fra��o.*/
	
			Fracao f1 = new Fracao();
			f1.definirValores(5, 2);
			
			Fracao f2 = new Fracao();
			f2.definirValores(1, 7);
			
			Fracao f3 = f1.multiplicar(f2);
			
			System.out.println(f3.obterFracao());
			
			System.out.println(f3.calcularValor());
	}
}
