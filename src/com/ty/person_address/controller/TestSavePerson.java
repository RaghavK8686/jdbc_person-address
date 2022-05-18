package com.ty.person_address.controller;

import com.ty.person_address.dao.PersonDao;
import com.ty.person_address.dto.Address;
import com.ty.person_address.dto.Person;

public class TestSavePerson {

	public static void main(String[] args) {
		Person person=new Person();
		person.setId(2);
		person.setName("naina");
		person.setEmail("naina@gmail.com");
		person.setPhone("1264654321");
		
		PersonDao dao=new PersonDao();
		int res=dao.savePerson(person);		
		if(res>0)
		{
			System.out.println("Data inserted");
		}
		else
		{
			System.out.println("Data not inserted");
		}
	}
	
			
}
