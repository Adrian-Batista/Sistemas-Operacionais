package relogio.principal;

import java.io.IOException;
import java.util.Scanner;

import relogio.classe.Relogio;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner menu = new Scanner (System.in);

        System.out.print("##--Estrutura de um rel�gio --##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Op��o 1 - Ajustar Hor�rio   |\n");
        System.out.print("| Op��o 2 - Visualizar hor�rio|\n");
        System.out.print("| Op��o 3 - Iniciar cronometro|\n");
        System.out.print("| Op��o 4 - Parar cronometro  |\n");
        System.out.print("| Op��o 5 - Zerar cronometro  |\n");
        System.out.print("| Op��o 6 - Definir alarme    |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma op��o: ");

        int opcao = menu.nextInt();

        Relogio relogio = new Relogio();
        
        switch (opcao) {
        case 1:

        	
        	relogio.showHora();
        	System.in.read();	
        	
            break;

        case 2:
        	System.out.println(relogio.dataAtual());
        	System.in.read();
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
