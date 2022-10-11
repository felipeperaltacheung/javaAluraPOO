public class EditorVideo extends Funcionario{ //gerente herda um funcionario

    public double getBonificacao(){
        System.out.println("metodo de boni do editor");
        return super.getBonificacao() + 100;
    }

}
