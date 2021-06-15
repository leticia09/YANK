
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente nico = new Gerente();
		
		nico.setNome("Nico Silva");
		nico.setCpf("123.321.456.00");
		nico.setSalario(3000.00);
		
		System.out.println(nico.toString());
		System.out.println(nico.getBonificacao());
		

	}

}
