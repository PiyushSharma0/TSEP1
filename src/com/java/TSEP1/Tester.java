package com.java.TSEP1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComp implements Comparator<Student> {
	@Override
	public int compare (Student o1, Student o2) {
		
		int x = o1.name.compareTo(o2.name);
		return x;
	}
}

public class Tester {
	public static void main(String[] args) {
		StudentService service = new StudentService();
		List<Student> list = service.displayStudent();
		System.out.println(list);
		service.addStudent();
		Collections.sort(list, new MyComp());
		System.out.println(list);
	}
}
