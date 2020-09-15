package com.he.addressBook;

public class Address {

	private String label;
	private String address;
	
	public Address(String label, String address) throws Exception {
		// TODO
		this.label=label;
		this.address=address;
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public String getAddress() {
		return this.address;
	}
}
