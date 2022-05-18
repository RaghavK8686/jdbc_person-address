package com.ty.person_address.service;

import com.ty.person_address.dao.PersonDao;
import com.ty.person_address.dto.Person;

public class PersonService {

	PersonDao personDao=new PersonDao();
	public int savePerson(Person person)
	{
		return personDao.savePerson(person);
	}
}
