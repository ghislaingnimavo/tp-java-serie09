package org.stephane.exo19;

public class Person {
	
	private String firstName, lastName;
	private int age;
	
	public Person(String lastName, String firstName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Person() {
		// TODO Auto-generated constructor stub
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	


}
