package listaExercicio2;

import javax.swing.JOptionPane;

public class ResolucaoEx3 {

	public static void main(String[] args) {
		
		/*Crie classes que representam as figuras geométricas: Triangulo, Quadrado, Circunferencia
e Trapezio. Cada uma destas classes deve ter um método para calcular a sua área, com a
seguinte assinatura: double calcularArea().
Note que o método calcularArea() não recebe parâmetros. Portanto todos os dados
necessários devem ser armazenados no objeto da classe em forma de atributos para depois
serem utilizados pelo método. */
		
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
		
		JOptionPane.showMessageDialog(null, "A Area do Triangulo é :" +t1.calcularArea() + "\n"
				+ "A Area do Quadrado é : "+q1.calcularArea()+ "\n"
						+ "A Area da Circunferencia é : "+c1.calcularArea()+ "\n"
								+ "A Area do Trapezio é : "+tra1.calcularArea());
	}
}
