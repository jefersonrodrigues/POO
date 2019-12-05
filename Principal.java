package contador;

import java.awt.EventQueue;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField valor;

	/**
	 * Launch the application.
     * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
                    try {
                        Principal frame = new Principal();
                        frame.setVisible(true);
                    } catch (Exception e) {
                    }
                });
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 3, 2, 2));
		
		valor = new JTextField();
		valor.setText("100");
		contentPane.add(valor);
		valor.setColumns(10);
		
		JLabel contador = new JLabel("COUNTER");
		contador.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(contador);
		contador.setForeground(Color.black);
		contador.setFont(new Font("Verdana", Font.BOLD, 20));
	

		JButton iniciar = new JButton("START");
		contentPane.add(iniciar);
		iniciar.setBackground(new Color(179,179,179));


		JButton parar = new JButton("STOP");
		contentPane.add(parar);
		parar.setBackground(new Color(179,179,179));	

		
		JButton red = new JButton("RED");
		contentPane.add(red);
		red.setBackground(new Color(255,102,102));

		
		JButton yellow = new JButton("YELLOW");
		contentPane.add(yellow);
		yellow.setBackground(new Color(255,255,102));

		
		JButton normal = new JButton("NORMAL");
		contentPane.add(normal);
		normal.setBackground(new Color(179,179,179));
		
		Contagem c = new Contagem(valor, contador);
		iniciar.addActionListener(c);
		parar.addActionListener(c);
		red.addActionListener(c);
		yellow.addActionListener(c);
		normal.addActionListener(c);
		
		ContagemServidor cs = new ContagemServidor(c);
		cs.start();
	}

}
