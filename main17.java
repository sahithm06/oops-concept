package com.practice;
import java.util.ArrayList;
abstract class Employee
{
	
	private String name,phnoeNo,designation;
	private int age;
	private double salary;
	
	 abstract String employeeDetails();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhnoeNo() {
		return phnoeNo;
	}
	public void setPhnoeNo(String phnoeNo) {
		this.phnoeNo = phnoeNo;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
class Manager extends Employee
{

	@Override
	String employeeDetails() {
		// TODO Auto-generated method stub
		return "iam a manager of the zemoso comapny";
	}
	
	
	
	
}
class HR extends Employee
{

	@Override
	String employeeDetails() {
		// TODO Auto-generated method stub
		return "im the HR recuiter of the zemoso technologies";
	}
	
	
	
	
}
class Intern extends Employee
{

	@Override
	String employeeDetails() {
		// TODO Auto-generated method stub
		return "ima a intern in zemoso technologies";
	}
	
	
	
	
}




class SubOrdinates extends Employee
{

	@Override
	String employeeDetails() {
		// TODO Auto-generated method stub
		return "ima a subordinates (worker) in the zemoso technologies";
	}
	
}
public class main17 {

	
	public static void main(String args[])
	{   
		Employee empl=new Manager();
		
		ArrayList<Employee> emp =new  ArrayList<Employee>();
		 emp.add(empl);
		empl.setDesignation("Manager1");
		empl.setSalary(5000000);
		empl=new Intern();
		 emp.add(empl);
		empl.setSalary(20000);
		empl.setDesignation("intern");
		empl=new HR();
		empl.setSalary(400000);
		empl.setDesignation("HR mnaager");
		
		 emp.add(empl);
		 	for(Employee e: emp)
		 	{
		 		System.out.println("the desgination of employee is "+e.getDesignation()+" and salary is  "+e.getSalary());
		 	}
	
	}

	
}
