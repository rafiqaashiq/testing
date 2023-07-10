package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCenvironment {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String dbURL = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "Rafiq@aashiq2";
		String query = "select * from movies;";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbURL,username,password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			System.out.print("Title : " + rs.getString("title") + "\t");
			System.out.print("Genre : " + rs.getString("genre") + "\t");
			System.out.print("Director : " + rs.getString("director") + "\t");
			System.out.println("Release year : " + rs.getString("release_year"));
		}
	}
}
