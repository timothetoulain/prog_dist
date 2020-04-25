package com.example.demo2;


public class Reader {

	private String name;
	private String email;

	public Reader() {
		super();
	}
	
	public Reader(String name, String email) {
		super();
		this.name= name;
		this.email=email;
	}
	public Reader(String name) {
		super();
		this.name= name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name= name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Reader [name=" + name + "]";
	}


}
