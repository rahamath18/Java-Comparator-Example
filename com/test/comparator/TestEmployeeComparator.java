package com.test.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployeeComparator {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(8, "EEE", 555.55F));
		empList.add(new Employee(404, "BBB", 111.11f));
		empList.add(new Employee(305, "CCC", 333.33F));
		empList.add(new Employee(1, "DDD", 444.44F));
		empList.add(new Employee(2, "AAA", 222.22F));
		
		System.out.println("Before (Comparator) sort\t\t" + empList);
		
		Collections.sort(empList, new EmployeeIdComparator());
		System.out.println("After (Comparator) sort by Id\t\t" + empList);
		
		Collections.sort(empList, new EmployeeNameComparator());
		System.out.println("After (Comparator) sort by Name\t\t" + empList);
		
		Collections.sort(empList, new EmployeeSalaryComparator());
		System.out.println("After (Comparator) sort by Salary\t" + empList);
		
	}

}

/*
 O/P:-
 
Before (Comparator) sort		[8|EEE|555.55, 404|BBB|111.11, 305|CCC|333.33, 1|DDD|444.44, 2|AAA|222.22]
After (Comparator) sort by Id		[1|DDD|444.44, 2|AAA|222.22, 8|EEE|555.55, 305|CCC|333.33, 404|BBB|111.11]
After (Comparator) sort by Name		[2|AAA|222.22, 404|BBB|111.11, 305|CCC|333.33, 1|DDD|444.44, 8|EEE|555.55]
After (Comparator) sort by Salary	[404|BBB|111.11, 2|AAA|222.22, 305|CCC|333.33, 1|DDD|444.44, 8|EEE|555.55]
 
 * */
