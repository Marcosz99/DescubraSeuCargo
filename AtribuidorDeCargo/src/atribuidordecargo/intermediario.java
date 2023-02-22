package atribuidordecargo;

public class intermediario extends cadastroUsuario{
    
    // CASO JA QUEIRA INSTANCIAR UM INTERMEDIARIO
    
    public intermediario(String nome, String senha) {
        super(nome, senha);
        setCargo("Intermediario");
    }
    
    @Override
    public String mensagemStatus() {
        return String.format("Voce é Intermediario!"); 
    }
}
