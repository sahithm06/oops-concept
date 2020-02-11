package com.practice;
interface IAlarm
{
	String setAlarm();
}
interface SmartWatch extends IAlarm{
	String touch();
	String bluetooth();
	String disconnect();	
	
}

abstract class Clock{
	
	private String brand,material ;
	private double cost;
	public  Clock(String brand,String material,double cost){
		
		this.setBrand(brand);
		this.setMaterial(material);
		this.setCost(cost);

	}

	abstract String showTime();
	abstract String changeTime();
	abstract String fixWatch();
	abstract String repair();

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

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

}
class WallClock extends Clock implements IAlarm {

	public WallClock(String brand, String material, double cost) {
		super(brand, material, cost);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String setAlarm() {
		// TODO Auto-generated method stub
		return "wall clock alarm is set to 5 :00 am";
	}

	@Override
	String showTime() {
		// TODO Auto-generated method stub
		return "current time is 6 00 am";
	}

	@Override
	String changeTime() {
		// TODO Auto-generated method stub
		return "time changed to 10 am in wall clock";
	}

	@Override
	String fixWatch() {
		// TODO Auto-generated method stub
		return "fixing the wall clock on the wall";
	}

	@Override
	String repair() {
		// TODO Auto-generated method stub
		return "repaired and set the default settings to wall clock";
	}

	
	
}


class SmartClock extends Clock implements SmartWatch{

	public SmartClock(String brand, String material, double cost) {
		super(brand, material, cost);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String setAlarm() {
		// TODO Auto-generated method stub
		return "set alarm to 6 am in smart clock";
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return "usiing the touch for the other options";
	}

	@Override
	public String bluetooth() {
		// TODO Auto-generated method stub
		return "coonect to the other device via blutooth";
	}

	@Override
	public String disconnect() {
		// TODO Auto-generated method stub
		return "disconnectd from the other device";
	}
	
	@Override
	String showTime() {
		// TODO Auto-generated method stub
		return "current time is 7 00 am";
	}

	@Override
	String changeTime() {
		// TODO Auto-generated method stub
		return "time changed to 10 am in smart clock";
	}

	@Override
	String fixWatch() {
		// TODO Auto-generated method stub
		return "fixing the smart clock ";
	}

	@Override
	String repair() {
		// TODO Auto-generated method stub
		return "repaired and set the default settings to smart  clock";
	}

	
}
public class main14 {
     public static void main(String args[])
     {
	//SmartClock(String brand, String material, double cost
	Clock c1= new WallClock("quartz","metal",5000);
	System.out.println(c1.changeTime());
	System.out.println(c1.fixWatch());
	System.out.println(c1.getCost());
	System.out.println(c1.showTime());
	IAlarm ia=(WallClock)c1;
	System.out.println(ia.setAlarm());
	c1= new SmartClock("quartz","metal",5000);
	System.out.println(c1.changeTime());
	System.out.println(c1.fixWatch());
	System.out.println(c1.getCost());
	System.out.println(c1.showTime());
	SmartWatch sw=(SmartClock)c1;
	
	System.out.println(sw.setAlarm());
	System.out.println(sw.bluetooth());
	System.out.println(sw.disconnect());
	System.out.println(sw.touch());
}


}











