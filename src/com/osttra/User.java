package com.osttra;

public class User {
	
	private int username;
	private int pasword;
	private String firstName;
	private String lastName;
	private String email;
	private int age;
	
	public User() {
		
	}

	public User(int username, int pasword, String firstName, String lastName, String email, int age) {
		super();
		this.username = username;
		this.pasword = pasword;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}





	public int getUsername() {
		return username;
	}

	public void setUsername(int username) {
		this.username = username;
	}

	public int getPasword() {
		return pasword;
	}

	public void setPasword(int pasword) {
		this.pasword = pasword;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		
		return username+", "+pasword+", "+firstName+", "+lastName+", "+email;
	}
	
	public boolean equals(Object obj) {
		
		boolean status = false;
		
		System.out.println("inside equals()...");
		
		User user = (User) obj;
		
		if( getUsername() == user.getUsername() && getAge() == user.getAge()) {
			
			status = true;
		}
		return status;
	}

}
