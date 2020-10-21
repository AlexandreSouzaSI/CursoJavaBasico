package listaExercicio5_2;

public class ContaCorrente extends ContaBancaria {

	public double calcularSaldo() {
		return saldo - (saldo * 0.1);
	}

}
