package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Endereco;
import model.Usuario;
import service.UsuarioService;

public class CadastroView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nomeField;
	private JTextField emailField;
	private JTextField ruaField;
	private JTextField bairroField;
	private JTextField CidadeField;
	private JTextField complementoField;
	private JTextField cepField;
	private JTextField numeroField;
	private JPasswordField senhaField;
	private JTextField estadoField;

	/**
	 * Launch the application.
	 */
	private UsuarioService usuarioService;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroView frame = new CadastroView();
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
	public CadastroView() {
		
		usuarioService = new UsuarioService();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel.setBounds(164, 0, 141, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dados pessoais");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 24, 156, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setBounds(10, 59, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		nomeField = new JTextField();
		nomeField.setBounds(46, 56, 86, 20);
		contentPane.add(nomeField);
		nomeField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setBounds(10, 84, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		emailField = new JTextField();
		emailField.setBounds(46, 81, 86, 20);
		contentPane.add(emailField);
		emailField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Senha");
		lblNewLabel_4.setBounds(10, 109, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("Endereço");
		lblNewLabel_1_1.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(0, 134, 156, 24);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Rua");
		lblNewLabel_4_1.setBounds(10, 169, 23, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Bairro");
		lblNewLabel_4_2.setBounds(10, 194, 33, 14);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Cidade");
		lblNewLabel_4_3.setBounds(10, 220, 33, 14);
		contentPane.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Complemento");
		lblNewLabel_4_4.setBounds(139, 167, 70, 14);
		contentPane.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_5 = new JLabel("CEP");
		lblNewLabel_4_5.setBounds(139, 192, 46, 14);
		contentPane.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_4_6 = new JLabel("Numero");
		lblNewLabel_4_6.setBounds(139, 220, 46, 14);
		contentPane.add(lblNewLabel_4_6);
		
		ruaField = new JTextField();
		ruaField.setBounds(46, 164, 86, 20);
		contentPane.add(ruaField);
		ruaField.setColumns(10);
		
		bairroField = new JTextField();
		bairroField.setBounds(46, 189, 86, 20);
		contentPane.add(bairroField);
		bairroField.setColumns(10);
		
		CidadeField = new JTextField();
		CidadeField.setBounds(46, 217, 86, 20);
		contentPane.add(CidadeField);
		CidadeField.setColumns(10);
		
		complementoField = new JTextField();
		complementoField.setBounds(219, 164, 86, 20);
		contentPane.add(complementoField);
		complementoField.setColumns(10);
		
		cepField = new JTextField();
		cepField.setBounds(219, 189, 86, 20);
		contentPane.add(cepField);
		cepField.setColumns(10);
		
		numeroField = new JTextField();
		numeroField.setBounds(219, 217, 86, 20);
		contentPane.add(numeroField);
		numeroField.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] senhaChar = senhaField.getPassword();
				String senha = new String(senhaChar);
				
				Usuario novoUsuario = new Usuario(
						null, 
						nomeField.getText(), 
						emailField.getText(), 
						senha,
						new Endereco(
								null, 
								cepField.getText(), 
								ruaField.getText(), 
								numeroField.getText(), 
								bairroField.getText(), 
								estadoField.getText()));
					boolean cadastroSucedido = usuarioService.cadastrarUsuario(novoUsuario);	
				
				
				
				if (cadastroSucedido) {
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
					nomeField.setText("");
		            emailField.setText("");
		            senhaField.setText("");
		            cepField.setText("");
		            ruaField.setText("");
		            numeroField.setText("");
		            bairroField.setText("");
		            estadoField.setText("");

					LoginView loginView = new LoginView();
					loginView.setVisible(true);
				}else {
					msg("Cadastro negado, verifique se o email é valido");
				}
				
			}
		});
		btnNewButton.setBounds(378, 216, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buscar com Cep");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(207, 139, 109, 23);
		contentPane.add(btnNewButton_1);
		
		senhaField = new JPasswordField();
		senhaField.setBounds(46, 109, 86, 20);
		contentPane.add(senhaField);
		
		JLabel lblNewLabel_5 = new JLabel("Estado");
		lblNewLabel_5.setBounds(334, 169, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		estadoField = new JTextField();
		estadoField.setBounds(378, 166, 86, 20);
		contentPane.add(estadoField);
		estadoField.setColumns(10);
	}
	
	private void msg(String mensagem) {
	    JFrame frame = new JFrame();
	    JOptionPane.showMessageDialog(frame, mensagem, "Aviso", JOptionPane.WARNING_MESSAGE);
	}
}
