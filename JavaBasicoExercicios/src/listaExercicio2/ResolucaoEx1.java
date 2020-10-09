package listaExercicio2;

import javax.swing.JOptionPane;

public class ResolucaoEx1 {

	public static void main(String[] args) {
		
	/* 1 - Crie as classes Relogio e Ponteiro e escreva um método main() para treinar a chamada aos
	métodos e atributos.
	Atributos da classe Relogio:
	 ponteiroHora (tipo Ponteiro)
	 ponteiroMinuto (tipo Ponteiro)
	 ponteiroSegundo (tipo Ponteiro)
	
	Métodos da classe Relogio:
	 acertarRelogio(int, int, int): Acerta o relógio, posicionando adequadamente
	cada ponteiro do relógio. Os parâmetros passados são hora, minuto e segundo.
	 lerHora(): retorna a hora atual do relógio.
	 lerMinuto(): retorna o minuto atual do relógio.
	 lerSegundo(): retorna o segundo atual do relógio.
	Atributos da classe Ponteiro:
	 posicao(int): indica em qual posição está o ponteiro (1, 2, 3, 4, etc.)
	Dica 1: Os ponteiros podem assumir as posições 1, 2, 3, 4 e assim por diante. Se um ponteiro
	dos minutos está na posição 3, significa que o método lerMinuto() deve retornar 15, que é o
	minuto correspondente a esta posição. O mesmo vale para o ponteiro dos segundos.
	Dica 2: No método acertarRelogio(), você deve passar a hora, minuto e segundo. Suponha
	que o horário fornecido seja 3 horas, 25 minutos e 50 segundos. O ponteiro das horas deve ser
	posicionado no 3; o dos minutos no 5; e o dos segundos no 10. */
	
	Relogio r1 = new Relogio();
	
	r1.acertarRelogio(3,30,50);

	JOptionPane.showMessageDialog(null, "Posição da hora: " + r1.ponteiroHora.posicao + " "
			+ "\n  Posição do minuto: " + r1.ponteiroMinuto.posicao + " "
					+ "\n Posição do segundo: " + r1.ponteiroSegundo.posicao);

	
	int hora = r1.lerHora();
	int minuto = r1.lerMinuto();
	int segundo = r1.lerSegundo();
	
	JOptionPane.showMessageDialog(null, "Hora: " + hora + " \n Minuto: " + minuto + " \n Segundo: " + segundo);
	
	Relogio r2 = new Relogio();
	
	r2.acertarRelogio(22, 00, 00);
	
	JOptionPane.showMessageDialog(null, "Horas do Relogio 2 " + r2.lerHora());
	
	Relogio r3 = new Relogio();
	
	
	r3.acertarRelogio(23, 26, 54);
	
	JOptionPane.showMessageDialog(null, "As horas no relgio 3 é :" +r3.lerHora());
}
}
