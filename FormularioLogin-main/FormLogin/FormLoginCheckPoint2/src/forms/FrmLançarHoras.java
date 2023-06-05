package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmLançarHoras {

	private JFrame frmCadastroUser;
	private JTextField txtDATA;
    private JLabel lblinfo;
    private JTextField txtEntrada;
    private JTextField txtSaida;
	/**
	 * Launch the application.
	 */
	public static void open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmLançarHoras window = new FrmLançarHoras();
					window.frmCadastroUser.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmLançarHoras() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroUser = new JFrame();
		frmCadastroUser.setResizable(false);
		frmCadastroUser.setIconImage(		
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\fhj784\\Downloads\\Logo.png"));
		frmCadastroUser.setTitle("Cadastro");
		frmCadastroUser.setBounds(100, 100, 587, 462);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frmCadastroUser.getContentPane().add(panel, BorderLayout.NORTH);

		JLabel lblCadastro = new JLabel("LANÇAR HORAS");
		lblCadastro.setFont(new Font("Verdana", Font.BOLD, 26));
		lblCadastro.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblCadastro);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		frmCadastroUser.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);

		JLabel lblDATA = new JLabel("DATA");
		lblDATA.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDATA.setBounds(131, 29, 44, 14);
		panel_1.add(lblDATA);

		JLabel lblEntrada = new JLabel("HORÁRIO DE ENTRADA");
		lblEntrada.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEntrada.setBounds(58, 65, 117, 14);
		panel_1.add(lblEntrada);

		JLabel lblSaida = new JLabel("HORÁRIO DE SAÍDA");
		lblSaida.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSaida.setBounds(58, 105, 117, 17);
		panel_1.add(lblSaida);

		txtDATA = new JTextField();
		txtDATA.setBounds(214, 26, 161, 20);
		panel_1.add(txtDATA);
		txtDATA.setColumns(10);
		
		final JLabel lblinfo = new JLabel(""); 
		lblinfo.setBounds(29, 153, 516, 143); 
		panel_1.add(lblinfo); 
		JButton btnSalvar = new JButton("SALVAR"); 
		btnSalvar.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				String DATA = txtDATA.getText(); 
				String entrada = txtEntrada.getText();   
				String saida = txtSaida.getText();
				
				System.out.println("data:" + DATA + " entrada:" + entrada + " saida:" + saida); 
				
				if(DATA.length() > 0) { 
					lblinfo.setText("Registro confirmado!    "+ " Você entrou as:  "+ entrada +"  E saiu as:  "+ saida); 
					lblinfo.setForeground(Color.BLACK);
				}else {
					lblinfo.setText("Preencha a Data!"); 
					lblinfo.setForeground(Color.RED);
				}
				
				
			}
		});
		btnSalvar.setBorder(new LineBorder(Color.WHITE, 2, true)); 
		btnSalvar.setForeground(Color.WHITE); 
		btnSalvar.setBackground(Color.DARK_GRAY); 
		btnSalvar.setBounds(58, 320, 117, 37); 
		panel_1.add(btnSalvar); 

		JButton btnSair = new JButton("CANCELAR");
		btnSair.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				new FrmLogin(); 
				FrmLogin.main(null); 
				frmCadastroUser.dispose(); 
			}
		});
		btnSair.setForeground(Color.WHITE); 
		btnSair.setBorder(new LineBorder(Color.WHITE, 2, true)); 
		btnSair.setBackground(Color.DARK_GRAY); 
		btnSair.setBounds(360, 320, 117, 37); 
		panel_1.add(btnSair); 
		
		txtEntrada = new JTextField();
		txtEntrada.setColumns(10);
		txtEntrada.setBounds(214, 62, 161, 20);
		panel_1.add(txtEntrada);
		
		txtSaida = new JTextField();
		txtSaida.setColumns(10);
		txtSaida.setBounds(214, 103, 161, 20);
		panel_1.add(txtSaida);
		
		
	}
}