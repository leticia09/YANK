
public class TesteGerente {

	public static void main(String[] args) {

		Autenticavel gerente = new Gerente(); 
		
		gerente.setSenha(1234);
		boolean autentica = gerente.autentica(1234);
		
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Marcos Pereira");
		g1.setCpf("908.394.567.32");
		g1.setSalario(5000.0);
		g1.setSenha(1234);
		
		boolean autenticacao = g1.autentica(3214);
		
		System.out.println(g1.toString());
		System.out.println(g1.getBonificacao());
		System.out.println(autentica);
	}


}
