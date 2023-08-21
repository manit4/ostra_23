package com.osttra.pojo;

import java.io.Serializable;

public class Student implements Comparable<Student>, Serializable{
	
	private transient int key;
	private String value;
	public Student() {
		
	}
	public Student(int key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public int compareTo(Student o) {
		
		return this.value.compareTo(o.value);
			
		
	}

}
