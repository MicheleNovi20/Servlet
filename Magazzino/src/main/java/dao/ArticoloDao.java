package dao;

 //Creare una tabella in database per poter rappresentare un'articolo,caratterizzato dalle seguenti informazioni:
         //codice,descrizione,quantita
       //Creare la servlet,la classe dao e model relativi all'articolo
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.Articolo;

public class ArticoloDao {

	public void insert (Articolo a)throws SQLException {
		
		Connection dbConnection =null;
		java.sql.PreparedStatement cmd=null;
		
		try {
			String driver="com.mysql.cj.jdbc.Driver";
			 Class.forName(driver);
			//Creiamo la stringa di connessione
			 String url="jdbc:mysql://localhost:3306/eserciziocompleto";
					 //Otteniamo una connessione con username e password
		dbConnection= DriverManager.getConnection(url,"mikele","mikele1");
			 String updateTableSQL="INSERT INTO articolo(descrizione, quantita) VALUES (?,?)";
			 
			 cmd=dbConnection.prepareStatement(updateTableSQL);
			  cmd.setString(1, a.getDescrizione());
			  cmd.setInt(2, a.getQuantita());
			  
			  //execute update SQL statement 
			   cmd.executeLargeUpdate();
			   
			   System.out.println("Record is updated to DBUSER table");
			   
		   }catch (Exception e) {
			   
			  e.printStackTrace();
		   }finally {
			   
			   if (cmd !=null) {
				   cmd.close();
			   }
			   
			   if (dbConnection !=null) {
				   dbConnection.close();
				   
			   }
		   }	   
		}
	}
	

