package com.ty.person_address.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.person_address.dto.Person;
import com.ty.person_address.util.ConnectionObject;

public class PersonDao {

	public int savePerson(Person person) {
		String sql = "insert into person values(?,?,?,?)";

		Connection connection = ConnectionObject.getConnection();

		try {
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setInt(1, person.getId());
			preparedstatement.setString(2, person.getName());
			preparedstatement.setString(3, person.getEmail());
			preparedstatement.setString(4, person.getPhone());

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
}
