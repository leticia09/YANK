
public class EditorVideo extends Funcionario{

	public double getBonificacao() {
		System.out.println("Bonificação editor de vídeo: ");
		return super.getSalario() + 100;
	}
}
