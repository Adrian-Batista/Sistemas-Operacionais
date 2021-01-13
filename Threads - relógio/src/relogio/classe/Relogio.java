package relogio.classe;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Relogio extends Thread {
	
	/*private int hora;
	private int minuto;
	private int segundo;*/
	
	
	
	public String dataAtual() {
		LocalDateTime agora = LocalDateTime.now();
		
		while(true) {
			DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
			String horaFormatada = formatterHora.format(agora);
			return horaFormatada;
		}
	}
	
	Relogio r = new Relogio();
	
	
	/*public void setHora(int hora, int minuto,int segundo){
	    hora = java.lang.Math.abs(hora);
	    minuto = java.lang.Math.abs(minuto);
	    segundo = java.lang.Math.abs(segundo);
	    
	    if (segundo < 60 && minuto < 60 && hora < 24){
	        this.hora = hora;
	        this.minuto = minuto;
	        this.segundo = segundo;
	    }else{
	        System.out.println("Dados invalidos.");
	    }

	}
	public String getHora(){
	    return this.hora + ":" + this.minuto + ":" + segundo;
	}
	public void showHora(){
	     System.out.println(this.getHora());
	}
	public void pulso(){
	    segundo++;
	    if (segundo > 59){
	        segundo = 0;
	        minuto++;
	    }
	    if (minuto > 59){
	        minuto = 0;
	        hora++;
	    }
	    if (hora > 23){
	        hora = 0;
	    }
	}*/
	
}


