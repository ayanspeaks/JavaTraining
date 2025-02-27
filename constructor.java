package com.test;

class Employee{
	public Employee() {
		System.out.println("Default constructor.");
	}
	
	public Employee(int x, String str) {
		System.out.println("parameterised constructor");                                                                                                                                                                                                                                                                              
	}
	
	public Employee(Employee obj) {
		System.out.println("object parameterised constructor");
	}
	
	//factory method
	public Employee getObj(Employee emp) {
		if(emp == null) {
			emp = new Employee();
		}
		
		System.out.println("object created.");
		return emp;
		
	}
	
	public static Employee getInstance() {
		return new Employee();
	}
	
	public int add() {
		return 2 + 5;
	}
	
}

public class ConstructorsDemo {
	public static void main(String[] args) {
		
		Employee obj3 = new Employee();
		
		Employee obj1 = new Employee(10, "Java");
		
		Employee obj2 = new Employee(obj1);
		
		Employee obj4 = Employee.getInstance();
	}

}


