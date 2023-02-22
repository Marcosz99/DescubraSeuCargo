package atribuidordecargo;

public class avancado extends cadastroUsuario{
    
    // CASO JA QUEIRA INSTANCIAR UM AVAMCADO
    
    public avancado(String nome, String senha) {
        super(nome, senha);
        setCargo("Avancado");
    }
     
    @Override
    public String mensagemStatus() {
        return String.format("Voce é avancado!"); 
    }
}
