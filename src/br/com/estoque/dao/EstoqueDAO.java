package br.com.estoque.dao;

import java.sql.ResultSet;

import br.com.estoque.model.EstoqueLogin;
import br.com.estoque.ultil.ConnectionFactory;

public class EstoqueDAO {
	
	private EstoqueLogin estoque;
	private java.sql.Connection conn;		//conect ao banco de dados 
	private java.sql.PreparedStatement ps;	//permite execultar querys
	private ResultSet rs;			//tabela

	 public EstoqueDAO() throws Exception {
 		 try {
 			conn = ConnectionFactory.getConection();
 		 }catch(Exception e) {
 			 throw new Exception("Erro ao conectar ao BD!! "+ e.getMessage());
 		 }
 		 
 		 
 	 }

}
