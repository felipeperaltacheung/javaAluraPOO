public class ControleBonificacao {

    private double soma;

    public void registraa(Gerente g){
        double boni = g.getBonificacao();
        this.soma +=  boni;
    }

    public void registraa(Funcionario f){
        double boni = f.getBonificacao();
        this.soma +=  boni;
    }

    public void registraa(EditorVideo editorVideo){
        double boni = editorVideo.getBonificacao();
        this.soma +=  boni;
    }


    public double getSoma() {
        return soma;
    }
}
