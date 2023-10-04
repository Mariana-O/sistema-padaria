package techware.java.View;

import java.util.Scanner;

import techware.java.Services.Rotas;

public class LoginGestor {

    public static void loginG(){
        Scanner sc = new Scanner(System.in);
        

        String escolhaIn = " ";
        Rotas rota = new Rotas();


        System.out.println("Bem vindo, Escolha uma opção:");
        System.out.println("1.Cadastrar novo funcionario");
        System.out.println("2.Cadastrar Produto");

        escolhaIn = sc.nextLine();

        rota.rotaLogin(escolhaIn);
        
    }
    
}
