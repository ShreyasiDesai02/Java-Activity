package com.einfochips.Sample.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserDao {
	public boolean insertUser(User u) throws Exception{
		Class.forName("");
		Connection con = DriverManager.getConnection("","","");
		PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?,?)");
				
		ps.setString(1, u.getEmail());
		ps.setString(2, u.getName());
		ps.setString(3, u.getPassword());
		ps.setString(4, u.getAddress());
		ps.setString(5, u.getMobile());
		
		boolean b = ps.execute();
		con.close();
		return b;
	}
}
