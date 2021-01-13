package relogio.principal;

import java.io.IOException;
import java.util.Scanner;

import relogio.classe.Relogio;

public class Main {

	public static void main(String[] args) throws IOException {
		
		int opcao = 0;
		do {
			Scanner menu = new Scanner (System.in);
			Main.LimpaTela();
	        System.out.print("##--Estrutura de um rel�gio --##\n\n");
	        System.out.print("|-----------------------------|\n");
	        System.out.print("| Op��o 1 - Ajustar Hor�rio   |\n");
	        System.out.print("| Op��o 2 - Visualizar hor�rio|\n");
	        System.out.print("| Op��o 3 - Iniciar cronometro|\n");
	        System.out.print("| Op��o 4 - Parar cronometro  |\n");
	        System.out.print("| Op��o 5 - Zerar cronometro  |\n");
	        System.out.print("| Op��o 6 - Definir alarme    |\n");
	        System.out.print("| Op��o 0 - Sair              |\n");
	        System.out.print("|-----------------------------|\n");
	        System.out.print("Digite uma op��o: ");

	        opcao = menu.nextInt();

	        Relogio relogio = new Relogio();
	        
	        switch (opcao) {
	        case 1:

	        	System.out.println("Nada");
	        	
	            break;

	        case 2:
	        	Thread T = new Thread(relogio);
	        	T.start();
	        	
	        	System.in.read();
	            break;

	        case 3:
	            System.out.print("\nOp��o Produtos Selecionado\n");
	            break;


	             
	        }	
		}while(opcao!=0);
		
		

	}
	
	public static void LimpaTela(){
		for (int i = 0; i < 50; ++i) {
			System.out.println ();
		}
	
	}

}
