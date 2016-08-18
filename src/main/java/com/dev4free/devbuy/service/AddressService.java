package com.dev4free.devbuy.service;

import java.util.ArrayList;

import com.dev4free.devbuy.po.Address;



public interface AddressService {

	/**
	 * 查询收货地址
	 * @return 
	 */
	public ArrayList<Address> findAddressByUserName(String username);
	
}
