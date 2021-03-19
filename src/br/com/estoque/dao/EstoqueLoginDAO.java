package br.com.estoque.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;
import com.sun.jdi.connect.spi.Connection;

import br.com.estoque.model.EstoqueLogin;
import br.com.estoque.ultil.ConnectionFactory;

public class EstoqueLoginDAO {
	
	private EstoqueLogin estoqueLogin;
	private java.sql.Connection conn;		//conect ao banco de dados 
	private java.sql.PreparedStatement ps;	//permite execultar querys
	private ResultSet rs;			//tabela
	public int confirma;
	
	
	 public EstoqueLoginDAO() throws Exception {
 		 try {
 			conn = ConnectionFactory.getConection();
 		 }catch(Exception e) {
 			 throw new Exception("Erro ao conectar ao BD!! "+ e.getMessage());
 		 }
 	 }
	
	public EstoqueLogin consultarLogin (String login, String senha ) throws Exception{
	
		

	 try {
		 	
			String sql = "select * from login where login = ? and senha = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, login);
			ps.setString(2, senha);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				confirma =1;
				
			} else {
				JOptionPane.showMessageDialog(null, "Usuário ou Senha incorretos!");
			}
			
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	return estoqueLogin;
}
}
