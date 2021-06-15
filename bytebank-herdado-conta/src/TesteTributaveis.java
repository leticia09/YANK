
public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(23212,3332443);
		cc.deposita(100.00);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.registro(cc);
		calc.registro(seguro);
		
		System.out.println(calc.getTotalImposto());
		
		
	}

	
}
