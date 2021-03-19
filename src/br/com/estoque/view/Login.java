package br.com.estoque.view;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.estoque.dao.EstoqueLoginDAO;
import br.com.estoque.model.EstoqueLogin;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txt_login;
	private JPasswordField txt_senha;
	
	private EstoqueLogin Estoque;
	private EstoqueLoginDAO dao;

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
		
		txt_login = new JTextField();
		txt_login.setBorder(null);
		txt_login.setBounds(123, 109, 125, 25);
		contentPane.add(txt_login);
		txt_login.setColumns(10);
		
		txt_senha = new JPasswordField();
		txt_senha.setBorder(null);
		txt_senha.setBounds(123, 156, 125, 20);
		contentPane.add(txt_senha);
		
		JButton btn_login = new JButton("");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
