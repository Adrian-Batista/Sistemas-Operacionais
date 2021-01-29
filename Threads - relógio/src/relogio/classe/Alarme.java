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
				System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("\n ~~~~~~~~~~ A ~~~~~~~~~~");
				System.out.println("\n ~~~~~~~~~~ L ~~~~~~~~~~");
				System.out.println("\n ~~~~~~~~~~ A ~~~~~~~~~~");
				System.out.println("\n ~~~~~~~~~~ R ~~~~~~~~~~");
				System.out.println("\n ~~~~~~~~~~ M ~~~~~~~~~~");
				System.out.println("\n ~~~~~~~~~~ E ~~~~~~~~~~");
				System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~");
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
