public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public boolean saca(double valor) {
        double valorAsacar = valor + 0.2;
        return super.saca(valorAsacar);
    }
}