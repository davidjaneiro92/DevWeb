package br.com.estoque.view;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.estoque.dao.EstoqueLoginDAO;
import br.com.estoque.model.EstoqueLogin;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	
	private EstoqueLogin estoque;
	private EstoqueLoginDAO dao;
	private Menu menu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 348, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtLogin = new JTextField();
		txtLogin.setBorder(null);
		txtLogin.setBounds(123, 109, 125, 25);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBorder(null);
		txtSenha.setBounds(123, 156, 125, 20);
		contentPane.add(txtSenha);
		
		JButton btn_login = new JButton("");
		btn_login.addActionListener(new ActionListener() {
			//logar
			
			public void actionPerformed(ActionEvent e) {
			
				try {
					dao = new EstoqueLoginDAO();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					estoque = dao.consultarLogin(txtLogin.getText(), txtSenha.getText());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//estoque.setLogin(txtLogin.getText());
				//estoque.setSenha(txtSenha.getPassword().toString());
				
				
				if(dao.confirma ==1) {
					Menu tela = new Menu();
					tela.setVisible(true);
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "Usuário ou Senha incorretos!");
				}
				
			}
		});
		
		btn_login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_login.setOpaque(false);
		btn_login.setContentAreaFilled(false);
		btn_login.setBorderPainted(false);
		btn_login.setBounds(98, 198, 150, 23);
		contentPane.add(btn_login);
		
		JLabel fundo_login = new JLabel("");
		fundo_login.setIcon(new ImageIcon("C:\\Workspace\\Integrado\\img\\login.jpg"));
		fundo_login.setFont(new Font("Tahoma", Font.PLAIN, 23));
		fundo_login.setBounds(0, 0, 338, 338);
		contentPane.add(fundo_login);
	}
}
