package com.ty.person_address.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ty.person_address.dto.Address;
import com.ty.person_address.util.ConnectionObject;

public class AddressDao {

	public int saveAddress(Address address, int pid) {
		String sql = "insert into address values(?,?,?,?,?,?)";

		Connection connection = ConnectionObject.getConnection();

		try {
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setInt(1, address.getAid());
			preparedstatement.setString(2, address.getStreet());
			preparedstatement.setString(3, address.getDoor_num());
			preparedstatement.setString(4, address.getCity());
			preparedstatement.setString(5, address.getPin());
			preparedstatement.setInt(6, pid);

			return preparedstatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}
	
	public List<Address> getAddress(int id) {
		Connection connection = ConnectionObject.getConnection();
		String sql = "select * from address where pid=?";
		ArrayList<Address> list = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			
			while (rs.next()) {
				Address address = new Address();
				address.setAid(rs.getInt(1));
				address.setStreet(rs.getString(2));
				address.setDoor_num(rs.getString(3));
				address.setCity(rs.getString(4));
				address.setPin(rs.getString(5));
				
				list.add(address);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return null;		
	}
	public int deleteAddress(int pid) {
		String query="DELETE FROM address WHERE pid=?";
		
		Connection connection=ConnectionObject.getConnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, pid);
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		return 0;
	}
}




