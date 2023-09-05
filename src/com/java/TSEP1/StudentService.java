package com.java.TSEP1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
	List<Student> list = new ArrayList<>();
	
	public List<Student> displayStudent(){
		
		list.add(new Student(1, "piyush", 0));
		list.add(new Student(2, "akash", 0));
		list.add(new Student(3, "sunny", 0));
		list.add(new Student(4, "divyansh", 0));
		
		return list;
	}
	
	public void addStudent() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter details to add a new record:");
		System.out.print("Enter id: ");
		int id = input.nextInt();
		
		System.out.println("Enter Name: ");
		String name = input.next();
		
		System.out.println("Enter Salary: ");
		float salary = input.nextFloat();
		
		input.close();
		
		list.add(new Student(id, name, salary));
	}
}
