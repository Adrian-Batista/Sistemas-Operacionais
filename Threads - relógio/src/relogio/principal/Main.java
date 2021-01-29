package relogio.principal;

import java.util.Scanner;

import relogio.classe.Alarme;
import relogio.classe.Cronometro;
import relogio.classe.Data;
import relogio.classe.Relogio;

public class Main {

	public static void main(String args[]) {
		
		Scanner entradaInt = new Scanner(System.in);
		Data data = new Data();
		
		Thread relogio = new Thread(new Relogio(data));
		relogio.start();
				
		boolean opcao = true;
		
		while(opcao == true) {
			
			System.out.println("\nEscolha uma das alternativas:");
			System.out.println("1 - Ajustar horário");
			System.out.println("2 - Visualizar horário");
			System.out.println("3 - Iniciar cronômetro");
			System.out.println("4 - Visualizar cronômetro");
			System.out.println("5 - Parar cronômetro");
			System.out.println("6 - Zerar cronômetro");
			System.out.println("7 - Definir alarme");
			System.out.println("8 - Sair do sistema");
			int alternativa = entradaInt.nextInt();
			
			switch(alternativa) {
				case 1:
					System.out.println("\nDigite as horas:");
					data.hora = entradaInt.nextInt();
					System.out.println("Digite os minutos:");
					data.minuto = entradaInt.nextInt();
					System.out.println("Digite os segundos:");
					data.segundo = entradaInt.nextInt();
					break;
					
				case 2:
					System.out.println("\n"+ data.getHora() +":"+ data.getMinuto() +":"+ data.getSegundo());
					break;
					
				case 3:
					Thread cronometro = new Thread(new Cronometro(data));
					data.opcCronometro = true;
					cronometro.start();
					break;
					
				case 4:
					System.out.println("\n"+ data.cHora +":"+ data.cMinuto +":"+ data.cSegundo);
					break;
					
				case 5:
					data.opcCronometro = false;
					System.out.println("\n"+ data.cHora +":"+ data.cMinuto +":"+ data.cSegundo);
					break;
				
				case 6:
					data.zerarCronometro();
					break;
					
				case 7:
					System.out.println("\nDigite as horas:");
					data.aHora = entradaInt.nextInt();
					System.out.println("Digite os minutos:");
					data.aMinuto = entradaInt.nextInt();
					
					Thread alarme = new Thread(new Alarme(data));
					alarme.start();
					break;
				
				case 8:
					System.out.println("\nThau, obrigado por acessar :)");
					data.opcRelogio = false;
					data.opcAlarme = false;
					data.opcCronometro = false;
					opcao = false;
					break;
			}
		}	
	}
	
	public static void LimpaTela(){
		for (int i = 0; i < 50; ++i) {
			System.out.println ();
		}
	}
}