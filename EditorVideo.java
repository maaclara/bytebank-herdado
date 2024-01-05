package bytebank_herdado;

public class EditorVideo extends Funcionario {
	//Gerente eh um Funcionario, Gerente herda da class Funcionario
	
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Editor de Video");
		return 150;
			
	}
}
	
	

