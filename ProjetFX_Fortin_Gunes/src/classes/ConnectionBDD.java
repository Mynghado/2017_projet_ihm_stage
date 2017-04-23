package classes;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBDD {
	
	// URL de connexion
	private static String url = "jdbc:mysql://localhost/bdd_stage";
	// Nom du user
	private static String user = "root";
	// Mot de passe de l'utilisateur
	private static String passwd = "";
	// Objet Connection
	private static java.sql.Connection connect;
		   
	// M�thode pour r�cup�rer l'instance de connexion, si elle n'�xiste pas d�j�, on la cr��.
	public static java.sql.Connection getCo(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(connect == null){
			try {
				connect = DriverManager.getConnection(url, user, passwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return connect;   
	}     
}
