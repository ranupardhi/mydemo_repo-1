package com.tcs;

public class Starter {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		System.out.println(emp);
		System.out.println(emp.hashCode());


		Employee emp3 = new Employee(100, "test");
		System.out.println(emp3);
		
		emp.setId(200);
		emp.setName("ABC");
		
		System.out.println(emp);
	}

}