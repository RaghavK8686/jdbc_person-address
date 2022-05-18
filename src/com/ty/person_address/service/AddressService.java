package com.ty.person_address.service;

import java.util.List;


import com.ty.person_address.dao.AddressDao;
import com.ty.person_address.dto.Address;

public class AddressService {

	AddressDao addressDao = new AddressDao();

	public int saveAddress(Address address, int pid) {
		return addressDao.saveAddress(address, pid);
	}

	public List<Address> getAddress(int pid) {
		return addressDao.getAddress(pid);
	}

	public int deleteAddress(int pid) {
		return addressDao.deleteAddress(pid);
	}

}
