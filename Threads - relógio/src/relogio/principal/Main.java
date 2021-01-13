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
	        System.out.print("##--Estrutura de um relógio --##\n\n");
	        System.out.print("|-----------------------------|\n");
	        System.out.print("| Opção 1 - Ajustar Horário   |\n");
	        System.out.print("| Opção 2 - Visualizar horário|\n");
	        System.out.print("| Opção 3 - Iniciar cronometro|\n");
	        System.out.print("| Opção 4 - Parar cronometro  |\n");
	        System.out.print("| Opção 5 - Zerar cronometro  |\n");
	        System.out.print("| Opção 6 - Definir alarme    |\n");
	        System.out.print("| Opção 0 - Sair              |\n");
	        System.out.print("|-----------------------------|\n");
	        System.out.print("Digite uma opção: ");

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
	            System.out.print("\nOpção Produtos Selecionado\n");
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
