package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class StudentDAO {
	public void insertD() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		System.out.println("Driver load");
		Statement st = con.createStatement();
		st.executeUpdate("insert into batchpractice.student values(558,'Krishna','Mumbai')");
		System.out.println("Record inserted..");
	}
	public void insertDPS() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		PreparedStatement ps = con.prepareStatement("insert into batchpractice.student values(?,?,?)");
		ps.setInt(1, 556);
		ps.setString(2, "Shyam");
		ps.setString(3, "Nagpur");
		ps.executeUpdate();
		System.out.println("Record inserted..");
	}
	public void insertPPS(int id,String name,String address) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		PreparedStatement ps = con.prepareStatement("insert into batchpractice.student values(?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, address);
		ps.executeUpdate();
		System.out.println("Record inserted..");
	}
}
