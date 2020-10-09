package listaExercicio2;

import javax.swing.JOptionPane;

public class ResolucaoEx3 {

	public static void main(String[] args) {
		
		/*Crie classes que representam as figuras geom�tricas: Triangulo, Quadrado, Circunferencia
e Trapezio. Cada uma destas classes deve ter um m�todo para calcular a sua �rea, com a
seguinte assinatura: double calcularArea().
Note que o m�todo calcularArea() n�o recebe par�metros. Portanto todos os dados
necess�rios devem ser armazenados no objeto da classe em forma de atributos para depois
serem utilizados pelo m�todo. */
		
		Triangulo t1 = new Triangulo();
		t1.altura = 2.5;
		t1.base = 10;
		
		Quadrado q1 = new Quadrado();
		q1.lado = 5;
		
		Circunferencia c1 = new Circunferencia();
		c1.raio = 2;
		
		Trapezio tra1 = new Trapezio();
		tra1.altura = 2.5;
		tra1.baseMaior = 14.5;
		tra1.baseMenor = 9.3;
		
		JOptionPane.showMessageDialog(null, "A Area do Triangulo � :" +t1.calcularArea() + "\n"
				+ "A Area do Quadrado � : "+q1.calcularArea()+ "\n"
						+ "A Area da Circunferencia � : "+c1.calcularArea()+ "\n"
								+ "A Area do Trapezio � : "+tra1.calcularArea());
	}
}
