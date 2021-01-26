package relogio.classe;

public class Data {
	
	public int segundo;
	public int minuto;
	public int hora;
	
	public int aHora;
	public int aMinuto;
	
	public int cHora;
	public int cMinuto;
	public int cSegundo;
	
	public boolean opcAlarme;
	public boolean opcCronometro;
	public boolean opcRelogio;
	
	public Data() {
		this.segundo = 0;
		this.minuto = 0;
		this.hora = 0;
		
		this.aHora = 0;
		this.aMinuto = 0;
		
		this.cHora = 0;
		this.cMinuto = 0;
		this.cSegundo = 0;
		
		this.opcAlarme = true;
		this.opcRelogio = true;
		this.opcAlarme = true;
	}
	
	public int getSegundo() {
		return segundo;
	}
	
	public int getMinuto() {
		return minuto;
	}
	
	public int getHora() {
		return hora;
	}
	
	public void zerarCronometro() {
		cSegundo = 0;
		cMinuto = 0;
		cHora = 0;
	}
	
}
