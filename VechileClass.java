package com.practice;
import java.util.*;
interface IVechile
{
	String windowUp();
	String WindowDown();
	String WindowClean();
	String gear();
}
interface Icar extends IVechile{

	String bluetooth();
	String radioOn();
	String radioOff();
	String powerSteering();
	
	
}

interface Itruck extends IVechile
{
	String LoadOn();
	String LoadOff();
}

abstract class Vechile
{
	private String brand;
	private double cost,speed;
	private int no_of_wheels;
	
	
	abstract String accerlate();
	abstract String wash();
	abstract String brakes();
	//abstract String use();
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getNo_of_wheels() {
		return no_of_wheels;
	}
	public void setNo_of_wheels(int no_of_wheels) {
		this.no_of_wheels = no_of_wheels;
	}
	

}
class Car extends Vechile implements Icar
{

	@Override
	public String windowUp() {
		// TODO Auto-generated method stub
		return "move the window up";
	}

	@Override
	public String WindowDown() {
		// TODO Auto-generated method stub
		return "closing the window";
	}

	@Override
	public String WindowClean() {
		// TODO Auto-generated method stub
		return "cleainng the glass windows";
	}

	@Override
	public String gear() {
		// TODO Auto-generated method stub
		return "gear functionalaity of the car";
	}

	@Override
	public String bluetooth() {
		// TODO Auto-generated method stub
		return "bluetooth facility and funcationalaity";
	}

	@Override
	public String radioOn() {
		// TODO Auto-generated method stub
		return "on radio";
	}

	@Override
	public String radioOff() {
		// TODO Auto-generated method stub
		return "off radio";
	}

	@Override
	public String powerSteering() {
		// TODO Auto-generated method stub
		return "power steering functionality";
	}

	@Override
	String accerlate() {
		// TODO Auto-generated method stub
		return "incresing the  speed";
	}

	@Override
	String wash() {
		// TODO Auto-generated method stub
		return "car wash in show room or  privately";
	}

	@Override
	String brakes() {
		// TODO Auto-generated method stub
		return "apllying brakes";
	}

	
	
	
}

class Truck extends Vechile implements Itruck
{

	@Override
	public String windowUp() {
		// TODO Auto-generated method stub
		return "closing the window in truck";
	}

	@Override
	public String WindowDown() {
		// TODO Auto-generated method stub
		return "opening the window";
	}

	@Override
	public String WindowClean() {
		// TODO Auto-generated method stub
		return "clean the truck  side glass";
	}

	@Override
	public String gear() {
		// TODO Auto-generated method stub
		return "gear in truck ";
	}

	@Override
	public String LoadOn() {
		// TODO Auto-generated method stub
		return "increse and carry the load";
	}

	@Override
	public String LoadOff() {
		// TODO Auto-generated method stub
		return "decrese the load and remove the load ";
	}

	@Override
	String accerlate() {
		// TODO Auto-generated method stub
		return "incresing the sped";
	}

	@Override
	String wash() {
		// TODO Auto-generated method stub
		return "truck wash";
	}

	@Override
	String brakes() {
		// TODO Auto-generated method stub
		return "apply brakes to the truck";
	}

	
	
}
public class VechileClass {

	
	public  static void main(String args[])
	{
		ArrayList<Vechile> vec=new ArrayList<Vechile>();
		Vechile c1=new Car();
		c1.setCost(300000);
		c1.setNo_of_wheels(4);
		c1.setSpeed(50);
		vec.add(c1);
		c1=new Truck();
		
		c1.setCost(500000);
		c1.setNo_of_wheels(6);
		c1.setSpeed(60);
		vec.add(c1);
		for (Vechile c : vec)
		{
		
			System.out.println(c.accerlate());
			System.out.println(c.brakes());
			System.out.println(c.getCost());
				
		}
	}
	
}
	
	
	