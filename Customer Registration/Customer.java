package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
	private String name;
	private String email;
	private String password;
	private double regAmount;
	private Date dob;
	private CustomerType type;
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public Customer(String name, String email, String password, double regAmount, Date dob, CustomerType type) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.dob = dob;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", regAmount=" + regAmount + ", dob=" + sdf.format(dob)
				+ ", type=" + type + "]";
	}

	public Customer(String email) {
		super();
		this.email = email;
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("in cust's equals");
		if (o instanceof Customer) {
			Customer c = (Customer) o;
			return email.equals(c.email);
		}
		return false;
	}

}
