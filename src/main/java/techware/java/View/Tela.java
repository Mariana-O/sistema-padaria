package techware.java.View;

import techware.java.Services.Cadastrar;

import java.util.Scanner;

public class Tela {
    static Scanner sc = new Scanner(System.in);
    public static void tela(){


        System.out.println("Bem vindo ao sistema da Padaria");
        System.out.println();

        System.out.println("Login:");
        System.out.println("1.logar como funcionario");
        System.out.println("2.logar como gestor");
         int escolhaIn = Integer.parseInt(sc.nextLine());

    }
}
