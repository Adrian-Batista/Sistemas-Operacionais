package relogio.classe;

public class Cronometro implements Runnable {
	
	Data data;
	
	public Cronometro(Data data) {
		this.data = data;
	}
		
	@Override
	public void run() {
		
		while(data.opcCronometro) {
		
			data.cSegundo++;
			
			if(data.cSegundo==60) {
				data.cSegundo=0;
				data.cMinuto++;
			}
			if(data.cMinuto==60) {
				data.cMinuto=0;
				data.cHora++;
			}
			if(data.cHora==24) 
				data.cHora=0;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
