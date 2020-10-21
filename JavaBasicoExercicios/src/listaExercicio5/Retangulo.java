package listaExercicio5;

import javax.swing.JOptionPane;

public class Retangulo implements AreaCalculavel {
	
	@Override
	public void calcularArea() {
		String lado = JOptionPane.showInputDialog(null, "Informe o tamanho do lado: ");
		String base = JOptionPane.showInputDialog(null, "Informe o tamanho da base: ");
		JOptionPane.showMessageDialog(null, "O tamanho do seu retangulo é de :"+Integer.valueOf(lado)*Integer.valueOf(base));
		
	}
}
