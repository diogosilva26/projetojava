package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import service.UsuarioService;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginView extends JFrame {
	UsuarioService usuarioService = new UsuarioService();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField loginLoginField;
	private JPasswordField senhaLoginField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
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
	public LoginView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Wi$e");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 40));
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setBounds(0, 0, 119, 42);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(LoginView.class.getResource("/viewImages/ilustração.png")));
		lblNewLabel_1.setBounds(273, 0, 161, 165);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setBounds(146, 56, 46, 14);
		contentPane.add(lblNewLabel_2);

		loginLoginField = new JTextField();
		loginLoginField.setBounds(144, 70, 119, 20);
		contentPane.add(loginLoginField);
		loginLoginField.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Senha");
		lblNewLabel_3.setBounds(146, 101, 46, 14);
		contentPane.add(lblNewLabel_3);

		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] senhaChar = senhaLoginField.getPassword();
				String senha = new String(senhaChar);

				if (!usuarioService.autenticarLogin(loginLoginField.getText(), senha)) {
					JOptionPane.showMessageDialog(null, "Acesso negado. Verifique suas credenciais");
				} else {
					MenuView menuView = new MenuView();
					menuView.setVisible(true);
					 String nomeUsuario = loginLoginField.getText();
					 
					 menuView.inserirNomeUsuario(nomeUsuario);
					 
					
				}
			}
		});
		btnNewButton.setBounds(154, 142, 89, 23);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_4 = new JLabel("Ou");
		lblNewLabel_4.setBounds(190, 163, 23, 14);
		contentPane.add(lblNewLabel_4);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroView cadastroView = new CadastroView();
				cadastroView.setVisible(true);
			}
		});
		btnCadastrar.setBounds(154, 178, 89, 23);
		contentPane.add(btnCadastrar);

		senhaLoginField = new JPasswordField();
		senhaLoginField.setText("");
		senhaLoginField.setBounds(146, 114, 117, 20);
		contentPane.add(senhaLoginField);
	}

}
