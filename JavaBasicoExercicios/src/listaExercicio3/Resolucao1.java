package listaExercicio3;

import javax.swing.JOptionPane;

public class Resolucao1 {

	public static void main(String[] args) {
		
	/*Crie uma classe Lampada que possui um atributo ligada, o qual indica se a lâmpada está ligada
	ou desligada.
	Ao construir uma lâmpada, o estado dela (ligada ou desligada) deve ser fornecido. Para ligar e
	desligar a lâmpada, os métodos ligar() e desligar() devem ser chamados,
	respectivamente. Aliás, esta é a única forma de alterar o estado da lâmpada, já que o atributo
	ligada não deve ser visível fora da classe.
	A lâmpada também deve possuir um método imprimir(). Quando chamado, ele mostra as
	mensagens “Lâmpada ligada” ou “Lâmpada desligada”, dependendo do estado atual.
	Construa uma aplicação que cria uma lâmpada ligada, muda o estado dela e também imprime
	o estado atual após cada chamada aos métodos ligar() e desligar(). */
	
		lampada l1 = new lampada(true);
		
		
		String r = JOptionPane.showInputDialog( "Gostaria de Desligar ou Ligar a Lampada ? \n"
				+ "Ligar 1 \n"
				+ "Desligar 2");
		
		if (Integer.valueOf(r) == 1) {
			l1.ligar();
			l1.imprimir();
			
		} else if (Integer.valueOf(r) == 2) {
			l1.desligar();
			l1.imprimir();
		}
		

				/*l1.imprimir();
				
				l1.desligar();
				l1.imprimir();
				
			
				l1.ligar();
				l1.imprimir();*/
				
				
			}
		}