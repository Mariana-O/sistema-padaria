package techware.java.Services;

import techware.java.Domain.EmployeesMock;
import techware.java.Domain.Products;

import java.util.Scanner;

public class Cadastrar {
    static Scanner sc = new Scanner(System.in);
    static EmployeesMock user = new EmployeesMock();
    static Products products = new Products();

    public static void funcionarioCadastro(){

        System.out.print("Bem vindo ao sistema de Cadastro de Funcionario");

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

    public static void cadastroProduto(){
        System.out.print("Bem vindo ao sistema de Cadastro de Produtos");

        System.out.println("Nome: ");
        products.name = sc.nextLine();

        System.out.println("Descrição: ");
        products.description = sc.nextLine();

        System.out.println(" Quantidade: ");
        products.quantity =  Integer.parseInt(sc.nextLine());

        System.out.println("Preço: ");
        products.price =  Integer.parseInt(sc.nextLine());

        

        
    }


}
