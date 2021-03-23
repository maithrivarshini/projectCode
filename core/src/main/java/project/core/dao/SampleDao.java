package project.core.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleDao
{
	public String authenticateUser(String un , String pw)  {

		Connection con = null;
		Statement statement = null;
		ResultSet resultSet = null;

		String userNameDB = "";
		String passwordDB = "";

		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
			statement = con.createStatement();
			resultSet = statement.executeQuery("select username,password from login");
			while (resultSet.next()) {
				userNameDB = resultSet.getString("username");
				passwordDB = resultSet.getString("password");

				if (un.equals(userNameDB) && pw.equals(passwordDB)) {
					return "SUCCESS";
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		return "Invalid user credentials";
	}
}
