package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProceduresExceptionHandling {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String dbUrl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "Rafiq@aashiq2";
		String query = "call selectallmovies();";
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbUrl, username, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
					
			while(rs.next()) {
				System.out.print("Title : " + rs.getString("title") + "\t");
				System.out.print("Genre : " + rs.getString("genre") + "\t");
				System.out.print("Director : " + rs.getString("director") + "\t");
				System.out.println("Release year : " + rs.getString("release_year"));
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			con.close();
		}
	}
}
