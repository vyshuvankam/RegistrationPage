package com.tap.model;

public class Employee 
{
	String name;
	String email;
	String contact;
	String address;
	int age;
	
	public Employee(String name, String email, String contact, String address, int age) 
	{
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.address = address;
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return "Employee [name=" + name + ", email=" + email + ", contact=" + contact + ", address=" + address
				+ ", age=" + age + "]";
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getContact() 
	{
		return contact;
	}
	
	public void setContact(String contact) 
	{
		this.contact = contact;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	
}
