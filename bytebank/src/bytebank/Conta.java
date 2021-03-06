package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	private static int total; 

	
	public Conta(int agencia, int numero) {
		total++;
		System.out.println("O total de contas ? " + total);
		this.agencia = agencia;
		this.numero = numero;
	}
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

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}


}
