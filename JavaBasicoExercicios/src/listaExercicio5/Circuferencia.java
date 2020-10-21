package listaExercicio5;

import javax.swing.JOptionPane;

public class Circuferencia implements AreaCalculavel {
	
	@Override
	public void calcularArea() {
		String x = JOptionPane.showInputDialog(null, "Informe o tamanho do raio: ");
		double y = Math.PI * Integer.valueOf(x)*Integer.valueOf(x);
		JOptionPane.showMessageDialog(null, "O Tamanho do Circulo é de : "+y);
	}
}
