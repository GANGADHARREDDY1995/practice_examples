package com.samples;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
	String name;
	int age;
	int id;
	String sex;

	Employee(String name, int age, int id, String sex) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getID() {
		return id;
	}

	public String getSex() {
		return sex;
	}

	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());

	}

}

public class EmployeeTest {
	public static void main(String[] args) throws Exception {

		Employee d = new Employee("Ganaga", 23, 12345, "male");
		Employee d1 = new Employee("Shiva", 35, 1234567, "male");
		Employee d2 = new Employee("Vijaya", 27, 1234589, "female");
		Employee d3 = new Employee("Bhargav", 6, 1234598, "male");
		ArrayList al = new ArrayList();

		al.add(d);
		al.add(d1);
		al.add(d2);
		al.add(d3);

		Collections.sort(al);

		for (Object empo : al) {
			Employee emp = (Employee) empo;
			System.out.println(emp.getName() + " " + emp.getAge() + " " + emp.getSex() + " " + emp.getID());

		}

	}
}
