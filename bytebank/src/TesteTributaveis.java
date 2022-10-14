public class TesteTributaveis {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);


        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
        calculadorDeImposto.registra(cc);
        calculadorDeImposto.registra(seguro);

        System.out.println(calculadorDeImposto.getTotalImposto()); //43.0


    }

}
