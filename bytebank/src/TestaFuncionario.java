public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario nico = new Funcionario();
		nico.setName("nico Steppat");
		nico.setCpf("101011");
		nico.setSalario(2600.00);

		System.out.println(nico.getName());
		System.out.println(nico.getBonificacao());


	}
}