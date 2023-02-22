package atribuidordecargo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class app {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
            int respCadastro;
                          
            
                respCadastro = JOptionPane.showConfirmDialog(
                        null, "Deseja cadastrar um usuario??","ATENÇÃO",JOptionPane.YES_NO_OPTION);
                    
                           
                String nome = JOptionPane.showInputDialog("Digite seu nome: ");
                String senha = JOptionPane.showInputDialog("Digite sua senha: ");
                
                
                cadastroUsuario pessoa = new cadastroUsuario(nome, senha);
                pessoa.Usuarios.add(pessoa);

                JOptionPane.showMessageDialog(null,
                        "Bem vindo " + nome + "\nSua senha: " + senha + "\nSeu ID: " + pessoa.getID());
                                        
           
            int respVerUsuarios = JOptionPane.showConfirmDialog(
                   null, "Deseja ver usuario cadastrados até o momento? ", "ATENÇÃO", JOptionPane.YES_NO_OPTION);
           
                if (respVerUsuarios == 0)
                {
                    for (cadastroUsuario usuario : pessoa.Usuarios) 
                    {
                    JOptionPane.showMessageDialog(null, usuario.toString());
                    }
                }
           
            int respVerMensagem = JOptionPane.showConfirmDialog(
                   null, "Gostaria de ver sua mensagem?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);
           
                if (respVerMensagem == 0)
                {
                    JOptionPane.showMessageDialog(null, pessoa.mensagemStatus());
                } else {
                    JOptionPane.showMessageDialog(
                            null, "PROGRAMA ENCERRADO!");
                }
                
            int respCargo = JOptionPane.showConfirmDialog(
                        null, "GOSTOU DA APLICAÇÃO?","ATENÇÃO",JOptionPane.YES_NO_CANCEL_OPTION);
                 
        switch (respCargo) {
            case 1:
                pessoa.setCargo("É... ta bom Intermediario\nRemovido da minha lista hehe");
                JOptionPane.showMessageDialog(
                        null, pessoa.mensagemStatus());
                pessoa.Usuarios.remove(pessoa);
                break;
            case 0:
                pessoa.setCargo("Ai simm Avancado!");
                JOptionPane.showMessageDialog(
                        null, pessoa.mensagemStatus());
                break;
            default:
                JOptionPane.showMessageDialog(
                        null, "PROGRAMA ENCERRADO!");
                break;
        }
                          
         entrada.close();
    
        }
    
    
}
