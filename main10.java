package com.practice;
interface regulator
{
	String increaseSpeed();
	String decreaseSpeed();
	
}
interface tableFan
{
	
	String charge();
	String move();
	String adjust();
	
}
abstract class Fan 
{
	private int no_of_wings;
	private String material,brand ;
	
public Fan(int n,String m,String b) {
	
	setNo_of_wings(n);
	setMaterial(m);
	setBrand(b);
	
}
public int getNo_of_wings() {
	return no_of_wings;
}

public void setNo_of_wings(int no_of_wings) {
	this.no_of_wings = no_of_wings;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getMaterial() {
	return material;
}

public void setMaterial(String material) {
	this.material = material;
}
abstract String on();
abstract String off();
abstract String rotate();

}

class SealingFan extends Fan implements regulator 
{

	public SealingFan(int n, String m, String b) {
		super(n, m, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String increaseSpeed() {
		// TODO Auto-generated method stub
		return "increasing the speed by 1 of the regular fan";
	}

	@Override
	public String decreaseSpeed() {
		// TODO Auto-generated method stub
		return "decreased the speed by 1 of the regular fan";
	}

	@Override
	String on() {
		// TODO Auto-generated method stub
		return "power on the regular fan";
	}

	@Override
	String off() {
		// TODO Auto-generated method stub
		return "power off the regular fan";
	}

	@Override
	String rotate() {
		// TODO Auto-generated method stub
		return "regular fan is rotatiing";
	}
	

	
}

class TableFan extends Fan implements tableFan,regulator

{

	public TableFan(int n, String m, String b) {
		super(n, m, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String increaseSpeed() {
		// TODO Auto-generated method stub
		return "increasing the speed of the table fan by 1";
	}

	@Override
	public String decreaseSpeed() {
		// TODO Auto-generated method stub
		return "decresing the speed of the table fan by 1";
	}

	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return "charging the table fan";
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return "moving the table fan";
	}

	@Override
	public String adjust() {
		// TODO Auto-generated method stub
		return "adjusting the table fan";
	}

	@Override
	String on() {
		// TODO Auto-generated method stub
		return "power on the table fan";
	}

	@Override
	String off() {
		// TODO Auto-generated method stub
		return "power off the table fan";
	}

	@Override
	String rotate() {
		// TODO Auto-generated method stub
		return "table fan is rotating";
	}
	
	

	
}



public class main10 {

	public static void main(String args[])

	{
		Fan f1=new SealingFan(4,"metal","haveels");
		System.out.println(f1.off());
		System.out.println(f1.on());
		System.out.println(f1.rotate());
		
		regulator r1=(SealingFan)f1;
		System.out.println(r1.decreaseSpeed());
		System.out.println(r1.increaseSpeed());
		
		f1=new TableFan(4,"plastic","cargo");
		
		r1=(TableFan)f1;
		tableFan tf=(TableFan)f1;
		System.out.println(f1.off());
		System.out.println(f1.on());
		System.out.println(f1.rotate());
		
		System.out.println(r1.decreaseSpeed());
		System.out.println(tf.adjust());
		System.out.println(tf.charge());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
