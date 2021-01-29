package relogio.principal;

import java.io.IOException;
import java.util.Scanner;

import relogio.classe.Alarme;
import relogio.classe.Cronometro;
import relogio.classe.Data;
import relogio.classe.Relogio;

public class Main {

	public static void main(String args[]) throws IOException {
		
		
		Data data = new Data();
		boolean opcao = true;
		
		Scanner entrada = new Scanner(System.in);
		
		Thread relogio = new Thread(new Relogio(data));
		relogio.start();
				
		while(opcao == true) {
			Main.LimpaTela();
			System.out.println("\n||||||||||||||||| RELÓGIO ||||||||||||||||||");
			System.out.println("\n     SELECIONE UMA DAS OPÇÕES ABAIXO:\n");
			System.out.println("1 ) - VISUALIZAR HORA ATUAL");
			System.out.println("2 ) - AJUSTAR HORA");
			System.out.println("3 ) - VISUALIZAR CRONOMETRO");
			System.out.println("4 ) - INICIAR CRONOMETRO");
			System.out.println("5 ) - PARAR CRONOMETRO");
			System.out.println("6 ) - ZERAR CRONOMETRO");
			System.out.println("7 ) - DEFINIR ALARME");
			System.out.println("8 ) - SAIR");
			int escolha = entrada.nextInt();
			
			switch(escolha) {
			
				case 1:
					System.out.println("\n"+ data.getHora() +":"+ data.getMinuto() +":"+ data.getSegundo());
					System.out.println("\n Pressione Enter");
					System.in.read();
					break;
				
				case 2:
					System.out.println("\nDefina a hora:");
					data.hora = entrada.nextInt();
					System.out.println("Defina o minuto:");
					data.minuto = entrada.nextInt();
					System.out.println("Defina o segundo:");
					data.segundo = entrada.nextInt();
					break;
					
				case 3:
					System.out.println("\n"+ data.cHora +":"+ data.cMinuto +":"+ data.cSegundo);
					break;
					
				case 4:
					Thread cronometro = new Thread(new Cronometro(data));
					data.opcCronometro = true;
					cronometro.start();
					break;

				case 5:
					data.opcCronometro = false;
					System.out.println("\n"+ data.cHora +":"+ data.cMinuto +":"+ data.cSegundo);
					break;
				
				case 6:
					data.zerarCronometro();
					break;
					
				case 7:
					
					System.out.println("\nDefina a hora:");
					data.aHora = entrada.nextInt();
					System.out.println("Defina o minuto:");
					data.aMinuto = entrada.nextInt();
					
					Thread alarme = new Thread(new Alarme(data));
					alarme.start();
					System.out.println("\nAlarme definido com Sucesso! Pressione Enter");
					System.in.read();
					break;
				
				case 8:
					System.out.println("\nValeu bixo veio");
					
					data.opcRelogio = false;
					data.opcCronometro = false;
					data.opcAlarme = false;
					opcao = false;
					
					break;
			}
		}	
	}
	
	public static void LimpaTela(){
		for (int i = 0; i < 100; ++i) {
			System.out.println ();
		}
	}
}