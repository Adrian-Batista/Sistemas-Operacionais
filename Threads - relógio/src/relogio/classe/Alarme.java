package relogio.classe;

public class Alarme implements Runnable {

	Data data;
	
	public Alarme(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		while(data.opcAlarme) {
		
			if(data.hora == data.aHora && data.minuto == data.aMinuto) {
				System.out.println("ALARME!");
				break;
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
