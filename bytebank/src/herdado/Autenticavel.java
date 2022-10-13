package herdado;

//contrato autenticavel
// quem assina esse contrato precisa implementar os metodos -> set senha e autentica
public interface Autenticavel{


    public  void setSenha(int senha);

    public  boolean autentica(int senha);

}
