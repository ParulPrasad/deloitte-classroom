package com.deloitte;

public class EmployeeAdder {
	
	public void AddEmployee(Employee emp) throws Exception {
		if(emp.getEmpId()<10000 || emp.getEmpId()>99999)
			throw new InvalidEmployeeIdException("Invalid id entered");
		if(emp.getEmpName().length()<3)
			throw new InvalidEmployeeNameException2("Invalid name");
		if(emp.getSal()<30000 || emp.getSal()>80000)
			throw new InvalidEmployeeSalException2("Invalid salary");
		else
			System.out.println("done");
	}

}
