package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;

	public double deposita(double valor) {
		this.saldo += valor;

		return valor;
	}

	public boolean saca(double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}

	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}

	}
}
