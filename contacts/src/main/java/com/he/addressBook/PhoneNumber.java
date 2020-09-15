package com.he.addressBook;

public class PhoneNumber {
    private String label;
    private String phoneNumber;

    public PhoneNumber(String label, String phoneNumber) throws Exception {
        // TODO
    	this.label=label;
    	this.phoneNumber=phoneNumber;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
