package cursojava.thread;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
		
		for (int pos =0; pos < 10; pos ++ ) {
			
			//Quero execultar esse envio  com um tempo de parada / tempo determinado*/
			System.out.println("Executando algo da rotina, por exemplo envio de e-mail");
			
			Thread.sleep(1000);/*D� um tempo*/
		}
		
		System.out.println("Fim do c�digo de teste da Thread");
	}
}