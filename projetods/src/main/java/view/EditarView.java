package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class EditarView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditarView frame = new EditarView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EditarView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEditar = new JLabel("Editar");
		lblEditar.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblEditar.setBounds(183, 11, 89, 24);
		contentPane.add(lblEditar);
		
		JLabel lblNewLabel_1 = new JLabel("Dados pessoais");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 46, 156, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setBounds(10, 81, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(46, 78, 86, 20);
		contentPane.add(textField);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setBounds(10, 106, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(46, 103, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_4 = new JLabel("Senha");
		lblNewLabel_4.setBounds(10, 131, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("Endereço");
		lblNewLabel_1_1.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(0, 156, 156, 24);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Rua");
		lblNewLabel_4_1.setBounds(10, 191, 23, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Bairro");
		lblNewLabel_4_2.setBounds(10, 216, 33, 14);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Cidade");
		lblNewLabel_4_3.setBounds(10, 242, 33, 14);
		contentPane.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Complemento");
		lblNewLabel_4_4.setBounds(139, 189, 70, 14);
		contentPane.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_5 = new JLabel("CEP");
		lblNewLabel_4_5.setBounds(139, 214, 46, 14);
		contentPane.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_4_6 = new JLabel("Numero");
		lblNewLabel_4_6.setBounds(139, 242, 46, 14);
		contentPane.add(lblNewLabel_4_6);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(46, 186, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(46, 211, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(46, 239, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(219, 186, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(219, 211, 86, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(219, 239, 86, 20);
		contentPane.add(textField_7);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(335, 238, 89, 23);
		contentPane.add(btnEditar);
		
		JButton btnNewButton_1 = new JButton("Buscar com Cep");
		btnNewButton_1.setBounds(315, 161, 109, 23);
		contentPane.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(46, 131, 86, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				MenuView menuView = new MenuView();
				menuView.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(0, 0, 89, 23);
		contentPane.add(btnNewButton);
	}

}
