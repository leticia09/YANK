
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean saca(double valor) {
		double valorSaque = valor + 0.20;
		System.out.println("valor do saque: " + valorSaque);
		return super.saca(valorSaque);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor; 		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
