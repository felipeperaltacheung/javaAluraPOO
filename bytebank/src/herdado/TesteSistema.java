package herdado;

public class TesteSistema {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(1111);

        Administrador administrador = new Administrador();
        administrador.setSenha(3333);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(g);

        sistemaInterno.autentica(administrador);
    }

}
