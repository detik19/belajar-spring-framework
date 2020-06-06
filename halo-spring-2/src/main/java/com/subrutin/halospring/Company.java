package com.subrutin.halospring;

public class Company {

	private Employee employee;

	public Company(Employee employee) {
		super();
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Company [employee=" + employee + "]";
	}


	
	
	
	
	
}
