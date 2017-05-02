package com.yash.pojo;

public class Person {
	
	private String name;
	private int age;
	private String email;

	public Person(String name) {
		this.name = name;
	}
	
	public Person(int age){
		this.age=age;
	}
	
	public Person(String name,int age, String email){
		this.name=name;
		this.age=age;
		this.email=email;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public void showPersonDetail(){
		System.out.println("Name : "+getName());
		System.out.println("Age : "+getAge());
		System.out.println("Email : "+getEmail());
	}
	
}
