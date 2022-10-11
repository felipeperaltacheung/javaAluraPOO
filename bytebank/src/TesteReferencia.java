public class TesteReferencia {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setName("ana brown");
        g1.setSalario(5000.0);

        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(2000.0);

        EditorVideo editorVideo = new EditorVideo();
        editorVideo.setSalario(2500.0);

        Funcionario designer = new Designer();
        designer.setSalario(1000.0);

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registraa(g1);
        controleBonificacao.registraa(funcionario);
        controleBonificacao.registraa(editorVideo);
        controleBonificacao.registraa(designer);

        System.out.println(controleBonificacao.getSoma());

    }

}
