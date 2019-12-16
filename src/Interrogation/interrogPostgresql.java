package Interrogation;

import java.sql.*;
import java.io.*;
import java.util.ArrayList;

import GenerationSQL.*;

public class interrogPostgresql  {
	private static String username="lo17xxx";
	private static String password="dblo17";
	private static String url = "jdbc:postgresql://tuxa.sme.utc/dblo17";

	public static void interroger(String requete) throws SQLException {
	String nom;
	int nbre;
	
	// ---- configure START

	// The URL that will connect to TECFA's MySQL server
	// Syntax: jdbc:TYPE:machine:port/DB_NAME



	//requete="select distinct numero from  rubrique  where rubrique='focus';";

	// INSTALL/load the Driver (Vendor specific Code)
	try {
		Class.forName("org.postgresql.Driver");
	}
	catch(java.lang.ClassNotFoundException e) {
		System.err.print("ClassNotFoundException: ");
		System.err.println(e.getMessage());
	}

	try {
		Connection con;
		Statement stmt;
		// Establish Connection to the database at URL with usename and password
		con = DriverManager.getConnection(url, username, password);
		stmt = con.createStatement();
		 // Send the query and bind to the result set
		ResultSet rs = stmt.executeQuery(requete);

		int counter=0;
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();
		ArrayList<String> columnNames=new ArrayList<>();
		for (int i = 1; i <= columnCount; i++ ) {
			columnNames.add(rsmd.getColumnName(i));
		}
		for (String str : columnNames){
			System.out.print(str+"\t");
		}
		System.out.println();
		while (rs.next()) {
			String s;
			for (String str : columnNames){
				s = rs.getString(str);
				System.out.print(s);
			}
			System.out.println();
			counter++;
		}
		System.out.println();
		System.out.println("Nombre total des fichiers: "+counter);
	// Close resources
	stmt.close();
	con.close();
	    
	} 
	// print out decent erreur messages
	catch(SQLException ex) {
		System.err.println("==> SQLException: ");
		while (ex != null) {
		System.out.println("Message:   " + ex.getMessage ());
		System.out.println("SQLState:  " + ex.getSQLState ());
		System.out.println("ErrorCode: " + ex.getErrorCode ());
		ex = ex.getNextException();
		System.out.println();
		}
	}

	}
}
