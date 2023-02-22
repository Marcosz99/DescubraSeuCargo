package atribuidordecargo;

import java.util.ArrayList;
import java.util.Random;

public class cadastroUsuario {
    private String nome;
    private String senha;
    private int ID;
    private String cargo;
    
    Random random = new Random();
    
    ArrayList<cadastroUsuario> Usuarios = new ArrayList();
    
    public cadastroUsuario(String nome, String senha) {
        this.nome = nome;
        this.senha =  senha;
        cargo = "Iniciante";
        ID = random.nextInt(100);
    }
    
    public String mensagemStatus(){
        return getCargo();
    }
    
    public String getCargo(){
        return this.cargo;
    }
    
     public void setCargo(String cargo){
        this.cargo = cargo;
    }
     
    public String getNome(){
        return this.nome;
    }
    
    public String getSenha(){
        return this.senha;
    }
    
    public int getID(){
        return this.ID;
    }
    
    @Override
    public String toString()
    {
        return "Nome: " + nome + " Senha: " + senha + " ID: " + getID();
    }
 
//    private String mensagemIntermediaria(){
//        return "Voce tem permissão para ver essa mensagem de intermediario!";
//    }
//    
//    private String mensagemAvancada(){
//        return "Voce tem permissão para ver essa mensagem de avançado!";
//    }

}
