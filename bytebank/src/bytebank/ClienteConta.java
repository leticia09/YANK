package bytebank;

public class ClienteConta {

	public static void main(String[] args) {
		Cliente leticia = new Cliente();
		leticia.nome = "Letícia Alves de Azevedo";
		leticia.cpf = "073.026.421-17";
		leticia.profissao = "Desenvolvedora";
		
		Conta contaDaLeticia = new Conta(2213,45321); 
		
		contaDaLeticia.deposita(1000);
		
		contaDaLeticia.titular = leticia;
		
		System.out.println(contaDaLeticia.titular.nome);
		
		Conta contaBia = new Conta(4321, 325312);
		contaBia.titular = new Cliente();
		
		contaBia.titular.nome = "Beatriz Rapariga";
		
		System.out.println(contaBia.titular.nome);
	}

}
