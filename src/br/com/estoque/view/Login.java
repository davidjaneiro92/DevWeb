package br.com.estoque.view;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txt_email;
	private JPasswordField txt_senha;

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
		
		txt_email = new JTextField();
		txt_email.setBorder(null);
		txt_email.setBounds(123, 109, 125, 25);
		contentPane.add(txt_email);
		txt_email.setColumns(10);
		
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
