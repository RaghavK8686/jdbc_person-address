package com.ty.person_address.controller;

import java.util.List;

import com.ty.person_address.dto.Address;
import com.ty.person_address.service.AddressService;

public class TestGetAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressService addressService=new AddressService();
		List<Address> list=addressService.getAddress(2);
		if(list!=null)
			System.out.println(list);
		else
			System.out.println("No Address Found");
	}
	}


