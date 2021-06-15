
public class ContePoupanca extends Conta{

	public ContePoupanca(int agencia, int numero) {
		super(agencia, numero);
		
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

}
