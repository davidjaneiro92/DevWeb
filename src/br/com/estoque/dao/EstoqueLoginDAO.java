package br.com.estoque.dao;

import java.sql.ResultSet;

import br.com.estoque.model.EstoqueLogin;
import br.com.estoque.ultil.ConnectionFactory;

public class EstoqueLoginDAO {
	
	private EstoqueLogin estoqueLogin;
	private java.sql.Connection conn;		//conect ao banco de dados 
	private java.sql.PreparedStatement ps;	//permite execultar querys
	private ResultSet rs;			//tabela

	 public EstoqueLoginDAO() throws Exception {
 		 try {
 			conn = ConnectionFactory.getConection();
 		 }catch(Exception e) {
 			 throw new Exception("Erro ao conectar ao BD!! "+ e.getMessage());
 		 }
 	 }

	 public EstoqueLogin consultarlogin (String cpf) throws Exception {
  		 try {
  			 ps = conn.prepareStatement("select * from Login where login = ? and senha = ?");
  			 ps.setString(1, cpf);
  			 rs = ps.executeQuery();
  			 if(rs.next()) {
  				 String login = rs.getString("login");
  				 String senha = rs.getString("senha");
  				
  				 
  				estoqueLogin = new EstoqueLogin(login, senha);
  			 }
  		 return estoqueLogin;
  		 }catch(Exception e) {
   			 throw new Exception("Erro ao Consultar Login "+ e.getMessage());
   		 }
  	 }
}
