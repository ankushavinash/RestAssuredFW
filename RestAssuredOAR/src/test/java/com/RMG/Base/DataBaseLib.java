package com.RMG.Base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class DataBaseLib {
	
	@Test
	public void databaseTest() throws Throwable {
		Driver regDriver=new Driver();
		DriverManager.registerDriver(regDriver);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		Statement stat = conn.createStatement();
		ResultSet result = stat.executeQuery("select * from project where project_Name='RMG';");
		while(result.next()) {
			System.out.println(result.getString(1)+"|"+result.getString(2)+"|"+result.getString(3)+"|"
					+result.getString(4)+"|"+result.getString(5)+"|"+result.getString(6)+"|");
		}
		conn.close();
	}

}
