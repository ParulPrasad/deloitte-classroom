package com.deloitte;
import java.util.*;
import java.util.Arrays;

public class EmployeeMethods {

	public static void main(String[] args) {
		Employee e1=new Employee(101,28000,"Rahul");
		Employee e2=new Employee(205,50000,"Priya");
		Employee e3=new Employee(120,30000,"Amit");
		
		List<Employee> empList=Arrays.asList(e1,e2,e3);
		Collections.sort(empList);
		empList.forEach(System.out::println);
		
		Comparator<Employee> sortById=new Comparator<Employee>() {
			@Override
			public int compare(Employee o1,Employee o2) {
				return o1.getEmpId()-o2.getEmpId();
			}
		};
		
		Collections.sort(empList,sortById);
		empList.forEach(System.out::println);
		
//		List<Integer> nums=Arrays.asList(5,3,10,1,6);
//		Collections.sort(nums);
//		nums.forEach(System.out::println);
		
	}

}
