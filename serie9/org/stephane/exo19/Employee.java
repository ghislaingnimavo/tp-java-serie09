package org.stephane.exo19;

public class Employee {
	
	private int salary ;
	
	
	public Employee() 
	{	
		
	}
	
	public Employee(int salary) 
	{
		
		this.salary = salary;
	}

	public int getSalary() 
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Salary=" + salary + ", LastName()=" + getLastName() + ", FirstName()=" + getFirstName()
				+ ", Age()=" + getAge() + "]";
	}

	private String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getAge() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	
	}



