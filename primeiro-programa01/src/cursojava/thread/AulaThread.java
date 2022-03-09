package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
		
		new Thread() {
			public void run() { /*Executa o que nós queremos */
				/*Código da rotina */
				
				/*Código da rotina que eu quero executar em paralelo do envio de e-mail*/
				for (int pos =0; pos < 10; pos ++ ) {
					
					//Quero execultar esse envio  com um tempo de parada / tempo determinado*/
					System.out.println("Executando algo da rotina, por exemplo envio de e-mail");
					
					try {
						Thread.sleep(1000); 
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}/*Dá um tempo em milisegundos*/
				}
				
				/*Fim do código paralelo*/
				
			};
			
		}.start();/*Liga a Thread que fica processando paralelamente(por trás)*/
		
		/*=========================   Divisão das Threads   =============================*/
		
		new Thread() {
			public void run() { /*Executa o que nós queremos */
				/*Código da rotina */
		
		/*Código da rotina que eu quero executar em paralelo do envio de e-mail*/
		for (int pos =0; pos < 10; pos ++ ) {
			
			//Quero execultar esse envio  com um tempo de parada / tempo determinado*/
			System.out.println("Executando algo da rotina, por exemplo envio de nota fiscal");
			
			try {
				Thread.sleep(4000); 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}/*Dá um tempo em milisegundos*/
		}
		
		/*Fim do código paralelo*/
		
	};
	
}.start();/*Liga a Thread que fica processando paralelamente(por trás)*/

		
		
		/*Código do sitema do usuário continua o fluxo de trabalho*/
		System.out.println("Fim do código de teste da Thread");
		/*Fluxo do sistema, cadastro de venda, uma emissão de nota fiscal, algo do tipo*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário ");
	}
}