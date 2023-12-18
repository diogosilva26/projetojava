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

public class DadosView extends JFrame {

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
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DadosView frame = new DadosView();
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
	public DadosView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dados ");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 40));
		lblNewLabel.setBounds(152, 0, 132, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nome");
		lblNewLabel_1_2.setBounds(10, 84, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Email");
		lblNewLabel_1_3.setBounds(10, 112, 46, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Bairro");
		lblNewLabel_1_4.setBounds(10, 203, 46, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Cidade");
		lblNewLabel_1_5.setBounds(10, 228, 46, 14);
		contentPane.add(lblNewLabel_1_5);
		
		textField = new JTextField();
		textField.setBounds(49, 81, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_6 = new JLabel("Rua");
		lblNewLabel_1_6.setBounds(10, 178, 46, 14);
		contentPane.add(lblNewLabel_1_6);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(49, 109, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(45, 228, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(45, 175, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(45, 200, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Complemento");
		lblNewLabel_2.setBounds(141, 178, 71, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_5 = new JTextField();
		textField_5.setBounds(210, 175, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(210, 200, 86, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(210, 225, 86, 20);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_2_1 = new JLabel("CEP");
		lblNewLabel_2_1.setBounds(141, 203, 59, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Numero");
		lblNewLabel_2_2.setBounds(141, 228, 46, 14);
		contentPane.add(lblNewLabel_2_2);
		
		lblNewLabel_1 = new JLabel("Endereço");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 136, 97, 31);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_3 = new JLabel("Dados pessoais");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_3.setBounds(10, 51, 150, 20);
		contentPane.add(lblNewLabel_3);
		
		btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				MenuView menuView = new MenuView();
				menuView.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(0, 0, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
