package listaExercicio1;

import javax.swing.JOptionPane;

public class Resolucao {

	private static final String n6 = null;

	/*Um aluno tirou notas 8.5, 7.5 e 6.0 em provas que tinham peso 3, 2 e 5, respectivamente.
	Escreva um programa que imprima a média do aluno.*/
	
	public static double exercicio1 () {
		double media = (8.5 + 7.5 + 6)/(3+2+5);
		return media;
	}
	
	/*Neste exercício, você deve completar 4 tarefas:
		1. Imprima todos os números inteiros de 10 a 25 utilizando uma estrutura de repetição.
		2. Imprima a soma dos números de 1 a 100, pulando de dois em dois (1, 3, 5, 7, etc.).
		3. Começando em 0, imprima os números seguintes, enquanto a soma dos números já
		impressos for menor que 100.
		4. Imprima a tabuada do 9 (até o décimo valor). */
	
	public static int exercicio2um() {
		int n1 = 0;
		while (n1 <= 25) {
			System.out.println(n1);
			n1++;
		}
		return n1;
	}
	
	public static int exercicio2dois() {
		int n2 = 0;
		while (n2 <= 100) {
			System.out.println(n2);
			n2 = n2 + 2;
		}
		return n2;
	}
	
	public static int exercicio2tres() {
		int n3 = 0;
		while (n3 <= 100) {
			n3 = n3 + 1;
			System.out.println(n3);
			n3++;
		}
		return n3;
	}

	public static int exercicio2quatro() {
		int n5 = 9;
		int s = 0;
		for (int i = 0; i <= 10; i++) {
			s = i * n5;
			System.out.println(i +" * " +n5 + " = " +s);
		}
		return s;
	}
	
	/*O cálculo do fatorial de um número (!) segue a seguinte regra:
0!  1
1! = 0! * 1
2! = 1! * 2
...
n! (n - 1)! * n

Escreva uma aplicação que efetua o cálculo do fatorial utilizando a forma iterativa (usando
estruturas de repetição) e outra que efetua o mesmo cálculo, mas de forma recursiva (o
método de cálculo do fatorial chama ele mesmo).
Para maiores informações sobre o fatorial, consulte: http://pt.wikipedia.org/wiki/Factorial. 
*/
	
	public static int exercicio3 () {
		String valor = JOptionPane.showInputDialog("Informe ate que valor quer calcular o fatorial");
		int n3 = 1;
		for(int i = 2; i <= Integer.valueOf(valor); i++) {
			n3 *= i;
		}
		System.out.println("O fatorial de " + valor + " é igual a " + n3);
		return n3;
	}
	
	/* Imprima os 15 primeiros números da série de Fibonacci. A série de Fibonacci é tem os
seguintes elementos: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc. Para calculá-la, o primeiro e segundo
elementos valem 1, e daí por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somado
ao (n-2)-ésimo elemento (ex: 8 = 5 + 3). 
*/
	
	public static int exercicio4 () {
		int j = 1, n4 = 0;
		for (int i = 0, cont = 0; cont < 15; cont++) {
			System.out.print(i + " ");
			i = i + j;
			j = i - j;
			n4 = i;
		}
		return n4;
	}
	
	/* Escreva um programa que imprime na saída os valores assumidos por x. Esta variável x deve
iniciar com algum valor escolhido por você. Se x for par, x deve receber o valor dele mesmo
somado com 5. Já se x for ímpar, x deve receber o valor dele multiplicado por 2. O programa
termina assim que x for maior que 1000.
Por exemplo, para x = 10, a saída deve ser: 15, 30, 35, 70, 75, 150, 155, 310, 315, 630, 635,
1270.
Crie este programa primeiro usando a estrutura de controle if-else e depois usando a
estrutura de controle switch.*/
	public static int exercicio5 () {
		String x = JOptionPane.showInputDialog("Informe um numero: ");
		int n5 = Integer.valueOf(x);
		
		if (n5 % 2 == 0) {
			while(n5 < 1000) {
			System.out.println(n5);
			n5 = n5 + 5;
			}
		}
		else {
			while(n5 < 1000) {
			System.out.println(n5);
			n5 = n5 * 2;
			}
		}
		return n5;
	}
	
	public static int exercicio5um () {
		String x = JOptionPane.showInputDialog("Informe um numero : ");
		int r = Integer.valueOf(x) % 2;
		int n5 = Integer.valueOf(x);
		switch (r) {
		case 0:
			while(n5 < 1000) {
				System.out.println(n5);
				n5 = n5 + 5;
				}
			break;
		default:
			while(n5 < 1000) {
				System.out.println(n5);
				n5 = n5 * 2;
				}
			break;
			
		}
		return n5;
	}
	
	/* Verifique a validade de uma data e mostre uma mensagem na tela dizendo se a data é válida ou
inválida. Deve haver três variáveis para armazenar esta data: uma para o dia, outra para o mês
e outra para o ano. Considere que fevereiro pode ter somente 28 dias. 
*/

	public static String exercicio6 () {
	String mes = JOptionPane.showInputDialog("Informe um mês representado por numeros de 1 a 12: ");
		
		switch (Integer.valueOf(mes)) {
		case 2:
			String dia = JOptionPane.showInputDialog("Informe um dia do mês: ");
			if (Integer.valueOf(dia) > 28) {
				JOptionPane.showMessageDialog(null, "Mês Correto, mas numero de dias excede o total de dias desse mês");	
			}else if (Integer.valueOf(dia) > 0 && Integer.valueOf(dia) < 29) {
				String ano = JOptionPane.showInputDialog("Informe um ano: ");
				JOptionPane.showMessageDialog(null, "Mês Correto, dias corretos e ano correto");
			} break;
		
		case 1,3,4,5,6,7,8,9,10,11,12:
			String dia1 = JOptionPane.showInputDialog("Informe um dia do mês: ");
			if (Integer.valueOf(dia1) > 0 && Integer.valueOf(dia1) < 32) {
				String ano = JOptionPane.showInputDialog("Informe um ano: ");
				JOptionPane.showMessageDialog(null, "Mês Correto, dias corretos e ano correto");
			} else {
				JOptionPane.showMessageDialog(null, "Mês Correto, mas dias incorretos");
			} break;
		
		default:
			JOptionPane.showMessageDialog(null, "Mês Incorreto");
		}
		return n6;
	}

	
	/* Crie uma aplicação que possibilita a entrada via console de um conjunto de notas de um aluno.
Assim que -1 for informado como nota, calcule a média das notas informadas anteriormente e
mostre na tela. Caso a nota do aluno seja inválida, mostre uma mensagem na tela solicitando
uma nova nota.
A entrada via console deve ser feita utilizando a classe Console, fornecida junto com os
códigos-fonte deste exercício. Copie o arquivo Console.java para dentro do seu projeto e você
poderá utilizá-la.
Para ler uma nota do teclado, utilize o seguinte código:
double nota = Console.readDouble();
Após a digitação da nota seguida de ENTER, o valor digitado será armazenado na variável nota. */ 
	
	public static double exercicio7 () {
				int qNotas = 0, i = 1;
				double sNotas = 0.0;
				

				while(true) {
					JOptionPane.showMessageDialog(null,"Nota " + (i++) + ": ");
					
					String n7 = JOptionPane.showInputDialog("Informe a Nota do Aluno");
					double nota = Double.valueOf(n7).doubleValue();
					
					if(nota == -1) {
						break;
					
					} else if(nota < 0 || nota > 10) {
						JOptionPane.showMessageDialog(null,"Nota Invalida");
						continue;
					}
					
					sNotas += nota;
					
					qNotas++;
					
				}
				
				double media = sNotas / qNotas;
				
				JOptionPane.showMessageDialog(null, "A media e " + media);
				
				return media;
			} 
		}
	

