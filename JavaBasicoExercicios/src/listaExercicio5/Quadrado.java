package listaExercicio5;

import javax.swing.JOptionPane;

public class Quadrado implements AreaCalculavel {
	
	@Override
	public void calcularArea() {
		String x = JOptionPane.showInputDialog(null, "Informe o tamanho do lado do quadrado: ");
		JOptionPane.showMessageDialog(null, "O quadrado tem o tamanho : "+Integer.valueOf(x) * Integer.valueOf(x));
	}
}
