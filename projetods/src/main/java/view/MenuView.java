package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Usuario;

import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class MenuView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel nomeUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuView frame = new MenuView();
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
	public MenuView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 143, 22);
		contentPane.add(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Dados");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				DadosView dadosView = new DadosView();
				dadosView.setVisible(true);
				
			}
		});
		menuBar.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Editar");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				EditarView editarView = new EditarView();
				editarView.setVisible(true);
			}
		});
		menuBar.add(mntmNewMenuItem_1);
		
		JLabel lblNewLabel = new JLabel("Painel de controle");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 40));
		lblNewLabel.setBounds(41, 127, 349, 57);
		contentPane.add(lblNewLabel);
		
		nomeUsuario = new JLabel("");
		nomeUsuario.setFont(new Font("SansSerif", Font.BOLD, 30));
		nomeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		nomeUsuario.setBounds(0, 53, 424, 39);
		contentPane.add(nomeUsuario);
	}
	
	public void inserirNomeUsuario(String nome){
		nomeUsuario.setText("Bem vindo "+ nome);
	}
}
