package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.saldo = 200.00;
		conta1.saldo +=100;
			
		conta1.deposita(254.89);
		conta1.saca(154.89);
		System.out.println(conta1.saldo);
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		
		conta2.transfere(350, conta1);
		
		System.out.println(conta1.saldo);
	}

}
