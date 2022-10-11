package herdado;


//Gerente eh um Funcionario, Gerente herda da class Funcionario
public class Designer extends Funcionario {


	@Override
	public double getBonificacao() {
		System.out.println("chamando metodo de bonificacao do designer");
		return 200;
	}
}
