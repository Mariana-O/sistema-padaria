package techware.java.Services;

import techware.java.View.LoginGestor;

public class Rotas {

    public static void roteamento( String escolha){
      LoginGestor logingestor = new LoginGestor();


        if(escolha.equals("1") ){
            System.out.println("Funcionario");
        }else if(escolha.equals("2")){
            logingestor.loginG();
        }
    }

    public static void rotaLogin(String escolha ){
        Cadastrar cadastro = new Cadastrar();

        if(escolha.equals("1")){
            cadastro.funcionarioCadastro();
        } else if(escolha.equals("2")){
            cadastro.cadastroProduto();
        }

    }
    
}
