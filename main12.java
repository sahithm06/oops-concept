package com.practice;

interface ICharger{
	
	String PowerPad();
}
abstract class Charger
{
	private double outputVolts,outputAmpheres;
	private String brand,type;
	public Charger(String brand,String type,double outputVolts,double outputAmpheres)

	{
		this.setType(type);
		this.setBrand(brand);
		this.setOutputAmpheres(outputAmpheres);
		this.setOutputVolts(outputVolts);
		
	}
	public double getOutputAmpheres() {
		return outputAmpheres;
	}
	public void setOutputAmpheres(double outputAmpheres) {
		this.outputAmpheres = outputAmpheres;
	}
	public double getOutputVolts() {
		return outputVolts;
	}
	public void setOutputVolts(double outputVolts) {
		this.outputVolts = outputVolts;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
 String on()
 {
	 return "switching on the charger "+this.getClass().getSimpleName();
 }
 String off()
 {
	 return "switching off the charger "+this.getClass().getSimpleName();
 }
abstract String charge();




}


class RegularCharger extends Charger {

	public RegularCharger(String brand, String type, double outputVolts, double outputAmpheres) {
		super(brand, type, outputVolts, outputAmpheres);
		// TODO Auto-generated constructor stub
	}

	@Override
	String charge() {
		// TODO Auto-generated method stub
		return "chaarge functionality of the regular charger ";
	}
	

	
}

class TurboCharger extends Charger {

	public TurboCharger(String brand, String type, double outputVolts, double outputAmpheres) {
		super(brand, type, outputVolts, outputAmpheres);
		// TODO Auto-generated constructor stub
	}

	@Override
	String charge() {
		// TODO Auto-generated method stub
		return "high speed charger which is call turbo charger";
			
	}
	
	
}

class WirelessCharger extends Charger implements ICharger
{

	public WirelessCharger(String brand, String type, double outputVolts, double outputAmpheres) {
		super(brand, type, outputVolts, outputAmpheres);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String PowerPad() {
		// TODO Auto-generated method stub
		return "power pad functionality is to provide the wireless power ";
	}

	@Override
	String charge() {
		// TODO Auto-generated method stub
		return "wireless charging ";
	}
	

	
}

public class main12 {

	public static void main(String args[])
	{
		Charger c=new RegularCharger("samsung","regular", 5,2);
		System.out.println(c.charge());
		System.out.println(c.getOutputAmpheres());
		System.out.println(c.on());
		System.out.println(c.off());
		
		
		c=new TurboCharger("moto","turbo", 5,3);
		System.out.println(c.charge());
		System.out.println(c.getOutputAmpheres());
		System.out.println(c.on());
		System.out.println(c.off());
		
		c=new WirelessCharger("iphone","wire less",5,3);
		ICharger ic=(WirelessCharger)c;
		System.out.println(c.charge());
		System.out.println(c.getOutputAmpheres());
		System.out.println(c.on());
		System.out.println(c.off());
		System.out.println(ic.PowerPad());
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
;