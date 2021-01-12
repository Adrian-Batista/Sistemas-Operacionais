package relogio.principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner menu = new Scanner (System.in);

        System.out.print("##--Estrutura de um rel�gio --##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Op��o 1 - Novo Cadastro     |\n");
        System.out.print("| Op��o 2 - Clientes          |\n");
        System.out.print("| Op��o 3 - Produtos          |\n");
        System.out.print("| Op��o 4 - Sair              |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma op��o: ");

        int opcao = menu.nextInt();


        switch (opcao) {
        case 1:
            System.out.print("\nOp��o Novo Cadastro Selecionado");
            break;

        case 2:
            System.out.print("\nOp��o Clientes Selecionado\n");
            break;

        case 3:
            System.out.print("\nOp��o Produtos Selecionado\n");
            break;

        default:
            System.out.print("\nOp��o Inv�lida!");
            break;

        case 4:
            System.out.print("\nAt� logo!");
            menu.close();       
        }	

	}

}
