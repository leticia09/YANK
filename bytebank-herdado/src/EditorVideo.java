
public class EditorVideo extends Funcionario{

	public double getBonificacao() {
		System.out.println("Bonifica��o editor de v�deo: ");
		return super.getSalario() + 100;
	}
}
