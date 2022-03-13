package cursojava.thread;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.InsetsUIResource;

public class TelaTimeThread extends JDialog{
	
	/*Controle de componentes*/
	private JPanel jpanel = new JPanel(new GridBagLayout());
	
	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("E-mail");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton = new JButton("Gerar Lote");
	private JButton jButton2 = new JButton("stop");
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
	 private Object BorderLayout;
		
	public TelaTimeThread() {	
		setTitle("Tela de time com Thread");
		setSize(new Dimension(240,240));
		setLocationRelativeTo(null);	/*centraliza tela*/
		setResizable(false);			/*Impede redimensionamento de tela pelo usuário*/
		/*Primeira parte  concluída*/
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();/*Controldor de posicionamento de componentes*/
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2; // Tamanho 2 para cada elemento
		gridBagConstraints.insets = new InsetsUIResource (5,10,5,5); // Alinhando distancia entre cada item
		gridBagConstraints.anchor = gridBagConstraints.WEST; // Posicionament = anchor, west alinha para esquerda
		
		descricaoHora.setPreferredSize(new Dimension(200,25));
		jpanel.add(descricaoHora, gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension (200,25));
		gridBagConstraints.gridy ++;
		jpanel.add(mostraTempo, gridBagConstraints);
		
		
		descricaoHora2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy ++;
		jpanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy ++;
		jpanel.add(mostraTempo2, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1; // tamanho 1 para cada elemento
		
		jButton.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridy ++;
		jpanel.add(jButton, gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridx ++;
		jpanel.add(jButton2, gridBagConstraints);
		
		jButton.addActionListener(new ActionListener() {
				
			
			
			public void actionPerformed(ActionEvent e) {
				
				ObjetoFilaThread filaThread = new ObjetoFilaThread();
				filaThread.setNome(mostraTempo.getText());
				filaThread.setEmail(mostraTempo2.getText());
				
				fila.add(filaThread);
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
								
			}
		});
		
		fila.start();
		
		add(jpanel, BorderLayout);
		/*será sempre o último comando*/
		setVisible(true);
	}
}
