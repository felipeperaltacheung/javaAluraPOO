public class ControleBonificacao {

    private double soma;

    public void registraa(Funcionario funcionario){
        double boni = funcionario.getBonificacao();
        this.soma +=  boni;
    }



    public double getSoma() {
        return soma;
    }
}
