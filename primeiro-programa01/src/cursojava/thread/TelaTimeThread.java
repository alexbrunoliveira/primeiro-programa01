package cursojava.thread;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog{
	
	public TelaTimeThread() {	
		setTitle("Tela de time com Thread");
		setSize(new DimensionUIResource(240,240));
		setLocationRelativeTo(null);	/*centraliza tela*/
		setResizable(false);			/*Impede redimensionamento de tela pelo usu�rio*/
		/*Primeira parte  conclu�da*/
		
		GridBagConstraints gridbabConstraints = new GridBagConstraints();
		
		
		setVisible(true);
	}
}
