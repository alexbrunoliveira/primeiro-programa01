package cursojava.thread;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.InsetsUIResource;

public class TelaTimeThread extends JDialog{
	
	/*Controle de componentes*/
	private JPanel jpanel = new JPanel(new GridBagLayout());
	
	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("stop");
	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			while (true) {/*Fica sempre rodando*/
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").
						format(Calendar.getInstance().getTime()));
				try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	
	private Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			while (true) {/*Fica sempre rodando*/
				mostraTempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").
						format(Calendar.getInstance().getTime()));
				try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	private Thread thread1Time;
	private Thread thread2Time;

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
		mostraTempo.setEditable(false);
		jpanel.add(mostraTempo, gridBagConstraints);
		
		
		descricaoHora2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy ++;
		mostraTempo2.setEditable(false);
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
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time = new Thread(thread1);
				thread1Time.start();
				
				thread2Time = new Thread(thread2);
				thread2Time.start();	
				
				/*Habilitando e desabilitando botões*/
				jButton.setEnabled(false);
				jButton2.setEnabled(true);
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();
				thread2Time.stop();
				
				/*Habilitando e desabilitando botões*/
				jButton.setEnabled(true);
				jButton2.setEnabled(false);
				
			}
		});
		
		/*Impede q o botão STOP seja usado antes do START*/
		jButton2.setEnabled(false);
		 
		add(jpanel, BorderLayout);
		/*será sempre o último comando*/
		setVisible(true);
	}
}
