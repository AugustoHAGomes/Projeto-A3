package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class FrmSobreNos {

	private JFrame frmLançamentoDeHoras;

	/**
	 * Launch the application.
	 */
	public static void Open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmSobreNos window = new FrmSobreNos();
					window.frmLançamentoDeHoras.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmSobreNos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLançamentoDeHoras = new JFrame();
		frmLançamentoDeHoras.setIconImage(Toolkit.getDefaultToolkit().getImage(FrmSobreNos.class.getResource("/forms/Logo.png")));
		frmLançamentoDeHoras.setResizable(false);
		frmLançamentoDeHoras.setTitle("LançamentoDeHoras");
		frmLançamentoDeHoras.setBounds(100, 100, 375, 399);
		frmLançamentoDeHoras.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frmLançamentoDeHoras.getContentPane().add(panel, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		frmLançamentoDeHoras.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JTextArea txtrRegistreSeuHorrio = new JTextArea();
		txtrRegistreSeuHorrio.setFont(new Font("Arial Black", Font.BOLD, 17));
		txtrRegistreSeuHorrio.setText("REGISTRE SEU HORÁRIO");
		txtrRegistreSeuHorrio.setBounds(54, 11, 257, 34);
		panel_2.add(txtrRegistreSeuHorrio);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Marcação Comum");
		rdbtnNewRadioButton.setBounds(38, 52, 109, 23);
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Hora Extra");
		rdbtnNewRadioButton_1.setBounds(208, 52, 109, 23);
		panel_2.add(rdbtnNewRadioButton_1);
	}
}
