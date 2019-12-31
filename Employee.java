package com.deloitte;
import java.util.*;
import java.lang.String;
public class Employee implements Comparable<Employee> {
	private int empId;
	private double sal;
	private String empName;
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", sal=" + sal + ", empName=" + empName + "]";
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public double getSal() {
		return sal;
	}


	public void setSal(double sal) {
		this.sal = sal;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Employee(int empId, double sal, String empName) {
		super();
		this.empId = empId;
		this.sal = sal;
		this.empName = empName;
	}
    @Override
    public int compareTo(Employee o)
    {
    	return (int)(this.sal-o.sal);
    }
}
