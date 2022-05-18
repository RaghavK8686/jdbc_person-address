package com.ty.person_address.controller;

import com.ty.person_address.dao.AddressDao;

import com.ty.person_address.dto.Address;

public class TestSaveAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address address=new Address();
		address.setAid(4);
		address.setStreet("3rd cross");
		address.setDoor_num("10");
		address.setCity("chile");
		address.setPin("741258");
		
		AddressDao adao=new AddressDao();
		int res=adao.saveAddress(address, 2);
		if (res>0)
		{
			System.out.println("Data inserted");
		}
		else
		{
			System.out.println("Data not inserted");
		}
	
	
	}
}
