package com.java.TSEP1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
	List<Student> list = new ArrayList<>();
	
	public List<Student> displayStudent(){
		
		list.add(new Student(1, "Jane", 2500.00f));
		list.add(new Student(2, "Alex", 5160.00f));
		list.add(new Student(3, "Bob", 1520.00f));
		list.add(new Student(4, "Catherine", 9623.00f));
		
		return list;
	}
	
	public void addStudent() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter details to add a new record:");
		System.out.println("Enter id: ");
		int id = input.nextInt();
		
		System.out.println("Enter Name: ");
		String name = input.next();
		
		System.out.println("Enter Salary: ");
		float salary = input.nextFloat();
		
		input.close();
		
		list.add(new Student(id, name, salary));
	}
}
