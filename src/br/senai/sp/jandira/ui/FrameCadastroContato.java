package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class FrameCadastroContato extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtData;
	private final ButtonGroup Sexo = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public FrameCadastroContato() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 282, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnSalvar = new JButton("Gravar contato");
		btnSalvar.setForeground(Color.BLACK);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Cliquei no botão!!!");
				
			}
		});
		btnSalvar.setBounds(52, 314, 128, 42);
		contentPane.add(btnSalvar);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.BLACK);
		lblNome.setBounds(16, 61, 53, 28);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(16, 84, 173, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail: ");
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setBounds(16, 112, 53, 28);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(16, 138, 173, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setForeground(Color.BLACK);
		lblTelefone.setBounds(16, 169, 100, 14);
		contentPane.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(16, 194, 86, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade: ");
		lblCidade.setForeground(Color.BLACK);
		lblCidade.setBounds(134, 169, 46, 14);
		contentPane.add(lblCidade);
		
		JComboBox comboCidade = new JComboBox();
		comboCidade.setModel(new DefaultComboBoxModel(new String[] {"Selecione:", "Itapevi", "Jandira", "Barueri", "Osasco", "Carapibuiba"}));
		comboCidade.setToolTipText("Selecione");
		comboCidade.setBounds(134, 193, 86, 22);
		contentPane.add(comboCidade);
		
		JLabel lblSexo = new JLabel("Sexo: ");
		lblSexo.setForeground(Color.BLACK);
		lblSexo.setBounds(16, 225, 46, 14);
		contentPane.add(lblSexo);
		
		JRadioButton rdFeminino = new JRadioButton("Feminino");
		Sexo.add(rdFeminino);
		rdFeminino.setBounds(16, 246, 109, 23);
		contentPane.add(rdFeminino);
		
		JRadioButton rdMasculino = new JRadioButton("Masculino");
		Sexo.add(rdMasculino);
		rdMasculino.setBounds(16, 270, 109, 23);
		contentPane.add(rdMasculino);
		
		JLabel lblData = new JLabel("Data de nascimento: ");
		lblData.setForeground(Color.BLACK);
		lblData.setBounds(131, 225, 125, 14);
		contentPane.add(lblData);
		
		txtData = new JTextField();
		txtData.setBounds(131, 247, 103, 20);
		contentPane.add(txtData);
		txtData.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 266, 55);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Contatos");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 40));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(FrameCadastroContato.class.getResource("/br/senai/sp/jandira/img/contact-book.png")));
		panel.add(lblNewLabel_3);
	}
}
