package com.deloitte;

public class Employee {
    private int empId;
    private String empName;
    private float sal;
    
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}
	 public Employee() {
		 
	 }
	  public Employee(int empId,String empName,float sal) {
		  super();
		  this.empId=empId;
		  this.empName=empName;
		  this.sal=sal;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
