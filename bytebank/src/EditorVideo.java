public class EditorVideo extends Funcionario{ //gerente herda um funcionario

    public double getBonificacao(){
        return super.getBonificacao() + 100;
    }

}
