public class TestaGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setName("Marco");
		g1.setCpf("092093902903");
		g1.setSalario(5000.0);

		String nl = System.lineSeparator();
		System.out.println(g1.getName() + nl +  g1.getCpf() + nl + g1.getSalario());

		g1.setSenha(0000);

		boolean autenticouFalse = g1.autentica(2222);
		System.out.println(autenticouFalse); //return false, a senha e zero

		boolean autenticouTrue = g1.autentica(0000);
		System.out.println(autenticouTrue); //return true

		System.out.println(g1.getBonificacao());

	}
}