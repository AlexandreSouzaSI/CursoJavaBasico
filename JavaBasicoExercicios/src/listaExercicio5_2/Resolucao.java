package listaExercicio5_2;

import javax.swing.JOptionPane;

public class Resolucao {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaCorrente();
		c1.depositar(15000);
		c1.sacar(5000);
		double saldo = c1.calcularSaldo();
		System.out.println("Saldo da conta 1: " + saldo);
		
		ContaBancaria c2 = new ContaInvestimento();
		c2.depositar(1000);
		c2.sacar(200);
		saldo = c2.calcularSaldo();
		System.out.println("Saldo da conta 2: " + saldo);
		
		c1.transferir(1200, c2);
		saldo = c1.calcularSaldo();
		System.out.println("Saldo da conta 1: " + saldo);
		saldo = c2.calcularSaldo();
		System.out.println("Saldo da conta 2: " + saldo);
		
	}
}
