//Create Employee class with id and name
//Display 5 Employee details

package com.Week1;

public class Employee {
	int id;
	String name;
	
	public void show() {
		System.out.println("The employer id is: "+id);
		System.out.println("His/Her name is: "+name);
	}
	public static void main(String args[]) {
		Employee e1=new Employee();
		e1.show();
		e1.id=11;
		e1.name="Bona";
		e1.show();
	}
}