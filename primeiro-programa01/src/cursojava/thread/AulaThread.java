package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {

		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();

		/* C�digo do sitema do usu�rio continua o fluxo de trabalho */
		System.out.println("Fim do c�digo de teste da Thread");
		/*
		 * Fluxo do sistema, cadastro de venda, uma emiss�o de nota fiscal, algo do tipo
		 */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio ");
	}

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			/* C�digo da rotina */

			/* C�digo da rotina que eu quero executar em paralelo do envio de e-mail */
			for (int pos = 0; pos < 10; pos++) {

				// Quero execultar esse envio com um tempo de parada / tempo determinado*/
				System.out.println("Executando algo da rotina, por exemplo envio de nota fiscal");

				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} /* D� um tempo em milisegundos */
			}

			/* Fim do c�digo paralelo */

		}
	};

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			/* C�digo da rotina */

			/* C�digo da rotina que eu quero executar em paralelo do envio de e-mail */
			for (int pos = 0; pos < 10; pos++) {

				// Quero execultar esse envio com um tempo de parada / tempo determinado*/
				System.out.println("Executando algo da rotina, por exemplo envio de e-mail");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				/* D� um tempo em milisegundos */
			}

			/* Fim do c�digo paralelo */
		}
	};
}
