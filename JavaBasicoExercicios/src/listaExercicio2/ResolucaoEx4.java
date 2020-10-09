package listaExercicio2;

import javax.swing.JOptionPane;

public class ResolucaoEx4 {

	public static void main(String[] args) {
		
				Turma turma = new Turma();
				
				Aluno aluno1 = new Aluno();
				Aluno aluno2 = new Aluno();
				Aluno aluno3 = new Aluno();
				
				turma.aluno1 = aluno1;
				turma.aluno2 = aluno2;
				turma.aluno3 = aluno3;
				
				
				Prova aluno1Prova1 = new Prova();
				aluno1Prova1.notaParte1 = 5.0;
				aluno1Prova1.notaParte2 = 3.5;
				aluno1.prova1 = aluno1Prova1;
				
				Prova aluno1Prova2 = new Prova();
				aluno1Prova2.notaParte1 = 4.0;
				aluno1Prova2.notaParte2 = 2.0;
				aluno1.prova2 = aluno1Prova2;
				
				Prova aluno2Prova1 = new Prova();
				aluno2Prova1.notaParte1 = 5.0;
				aluno2Prova1.notaParte2 = 5.0;
				aluno2.prova1 = aluno2Prova1;
				
				Prova aluno2Prova2 = new Prova();
				aluno2Prova2.notaParte1 = 0.0;
				aluno2Prova2.notaParte2 = 3.0;
				aluno2.prova2 = aluno2Prova2;
				
				Prova aluno3Prova1 = new Prova();
				aluno3Prova1.notaParte1 = 1.0;
				aluno3Prova1.notaParte2 = 2.0;
				aluno3.prova1 = aluno3Prova1;
				
				Prova aluno3Prova2 = new Prova();
				aluno3Prova2.notaParte1 = 6.0;
				aluno3Prova2.notaParte2 = 1.5;
				aluno3.prova2 = aluno3Prova2;
				
				JOptionPane.showMessageDialog(null, "Média Aluno 1: " + turma.aluno1.calcularMedia());
				JOptionPane.showMessageDialog(null, "Média Aluno 2: " + turma.aluno2.calcularMedia());
				JOptionPane.showMessageDialog(null, "Média Aluno 3: " + turma.aluno3.calcularMedia());
				
				JOptionPane.showMessageDialog(null, "Média Turma: " + turma.calcularMedia());
				
			
			}
		}
