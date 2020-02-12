package day3 ;
 import java.util.*;

interface IGearBike{
	
	String gearUp();
	String gearDown();
	String clutchFunction();
	
}

interface Extrafeatures
{
	String DigitalSpeedMeter();
	
}
abstract class Bike {
	
	private String brand,color,model;
	private double cost;
	abstract String accerlate();
	abstract String on();
	abstract String off();
	abstract String applyBrakes();
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
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
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
		
class GearlessBike extends Bike
{

	@Override
	String accerlate() {
		// TODO Auto-generated method stub
		return "accerlating the bike";
	}

	@Override
	String on() {
		// TODO Auto-generated method stub
		return "starting the bike";
	}

	@Override
	String off() {
		// TODO Auto-generated method stub
		return "engine off";
	}

	@Override
	String applyBrakes() {
		// TODO Auto-generated method stub
		return "applying the brakes";
	}
	
	
	
	
}
	class GearBike extends Bike implements IGearBike,Extrafeatures
	{
			private int no_of_gears;
			
		@Override
		public String gearUp() {
			// TODO Auto-generated method stub
			return "gear up and go fast";
		}

		@Override
		public String gearDown() {
			// TODO Auto-generated method stub
			return "gear down and go slow";
		}

		@Override
		public String clutchFunction() {
			// TODO Auto-generated method stub
			return "clutch for the pupose of changing the gears";
		}

		@Override
		String accerlate() {
			// TODO Auto-generated method stub
			return "accrelating the gear bike";
		}

		@Override
		String on() {
			// TODO Auto-generated method stub
			return "engine on (gear bike)";
		}

		@Override
		String off() {
			// TODO Auto-generated method stub
			return "engine off the gear bike";
		}

		@Override
		String applyBrakes() {
			// TODO Auto-generated method stub
			return "apllying brakes to the gear bike";
		}

		public int getNo_of_gears() {
			return no_of_gears;
		}

		public void setNo_of_gears(int no_of_gears) {
			this.no_of_gears = no_of_gears;
		}

		@Override
		public String DigitalSpeedMeter() {
			// TODO Auto-generated method stub
			return "digital speedometer showing the current speed as 40kmph";
		}
		
	
		
		
	}

public class BikeClass {

	
	public static void main(String args[])
	
	{
		ArrayList<Bike> bike=new ArrayList<Bike>();
		Bike b1=new GearlessBike();
		bike.add(b1);
		b1.setBrand("honda activa");
		b1.setColor("red mat ");
		b1.setCost(50000);
		GearBike gb=new GearBike();
		b1=gb;
		b1.setBrand("pulsar");
		b1.setColor("black");
		b1.setCost(1000000);
			bike.add(b1);
			gb.setNo_of_gears(5);
		IGearBike igb=(GearBike)b1;
		System.out.println(igb.clutchFunction());
		System.out.println(igb.gearUp());
		System.out.println("total no of gears are "
				+ ""+gb.getNo_of_gears());
		
		for(Bike b:bike)
		{
			System.out.println(b.accerlate());
			System.out.println(b.applyBrakes());
			System.out.println(b.getBrand());
			System.out.println(b.on());
			
		}
		//System.out.println(igb.);
		
		
	}
	
	
	
	
	
	
	
	
	
}
