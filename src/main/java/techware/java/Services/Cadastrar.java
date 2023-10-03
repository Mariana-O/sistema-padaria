package techware.java.Services;

import techware.java.Domain.EmployeesMock;

import java.util.Scanner;

public class Cadastrar {
    static Scanner sc = new Scanner(System.in);
    static EmployeesMock user = new EmployeesMock();

    public static void funcionarioCadastro(){

        System.out.print("Bem vindo ao sistema de Cadastro");

        System.out.print("Nome:");
        user.name = sc.nextLine();

        System.out.print("Sobrenome:");
        user.lastName = sc.nextLine();

        System.out.print("Telefone:");
        user.phoneNumber = sc.nextLine();

        System.out.print("Endereço");
        user.addres = sc.nextLine();

        System.out.print("CPF:");
        user.cpf = sc.nextLine();

        System.out.print("Email:");
        user.email = sc.nextLine();

        System.out.print("Senha:");
        user.password = sc.nextLine();

    }


}
