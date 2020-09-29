package listaExercicio1;

import javax.swing.JOptionPane;

public class Execucao {

	public static void main(String[] args) {
		
		String exercicio = JOptionPane.showInputDialog("Informe qual exercicio deseja fazer :");

		switch (Integer.valueOf(exercicio)) {
		
		case 1:
			JOptionPane.showMessageDialog(null, "Resultado do exercicio 1: \n \n  A Media do Aluno foi : " + Resolucao.exercicio1());
			break;
			
		case 2:
			String exercicio1 = JOptionPane.showInputDialog("Qual opção quer fazer primeiro: ");
			if (Integer.valueOf(exercicio1) == 1) {			
			Resolucao.exercicio2um();
			}
		    else if (Integer.valueOf(exercicio1) == 2) {			
				Resolucao.exercicio2dois();
				}
		    else if  (Integer.valueOf(exercicio1) == 3) {			
				Resolucao.exercicio2tres();
				}
		    else if (Integer.valueOf(exercicio1) == 4) {			
				Resolucao.exercicio2quatro();
				}break;
		case 3:
			JOptionPane.showMessageDialog(null, "Resultado do exercicio 3: \n \n" + Resolucao.exercicio3());
			break;
			
		case 4:
			JOptionPane.showMessageDialog(null, "Resultado do exercicio 4: \n \n" + Resolucao.exercicio4());
			break;
		
		case 5:
			String exercicio5 = JOptionPane.showInputDialog("Qual opção quer fazer primeiro: ");
			if (Integer.valueOf(exercicio5) == 1) {
			JOptionPane.showMessageDialog(null, "Resultado do exercicio 5 usando if-else: \n \n" + Resolucao.exercicio5());
			} else {
				JOptionPane.showMessageDialog(null, "Resultado do exercicio 5 usando switch: \n \n" + Resolucao.exercicio5um());
			}
			break;
		
		case 6:
			Resolucao.exercicio6();
			break;
			
		case 7:
			Resolucao.exercicio7();
			break;
			
		default: 
			JOptionPane.showMessageDialog(null, "Opção invalida");
		}

	}

}
