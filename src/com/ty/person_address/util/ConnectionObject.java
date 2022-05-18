package com.ty.person_address.util;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.SQLException;

import static com.ty.person_address.util.AppConstants.*;

public class ConnectionObject {

	static {
		try {
			Class.forName(DRIVER);
		}
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}

	}
	
	public  static Connection  getConnection() {
		
		try {
		return 	DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	}

