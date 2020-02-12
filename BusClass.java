package day3;
import java.util.*;

interface IsmartBus
{
	
	String acOn();
	String acOff();
	String LocationTracking();
	String musicSystem();
}

abstract class Bus
{
	private int no_of_tyres,headLights;
	private String brand,color;
	abstract String engineOn();
	abstract String engineOff();
	abstract String gearUp();
	abstract String gearDown();
	public int getNo_of_tyres() {
		return no_of_tyres;
	}
	public void setNo_of_tyres(int no_of_tyres) {
		this.no_of_tyres = no_of_tyres;
	}
	public int getHeadLights() {
		return headLights;
	}
	public void setHeadLights(int headLights) {
		this.headLights = headLights;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}

class OrdinaryBus extends Bus
{

	@Override
	String engineOn() {
		// TODO Auto-generated method stub
		return "turn on the engine ";
	}

	@Override
	String engineOff() {
		// TODO Auto-generated method stub
		return "turn off the engine";
	}

	@Override
	String gearUp() {
		// TODO Auto-generated method stub
		return "increse the level of gear and go faast";
	}

	@Override
	String gearDown() {
		// TODO Auto-generated method stub
		return "decresse the level of the gear and go slow";
	}
	

	
}
class SmartBus extends Bus implements IsmartBus
{

	@Override
	String engineOn() {
		// TODO Auto-generated method stub
		return "turn on the engine of smart bus";
	}

	@Override
	String engineOff() {
		// TODO Auto-generated method stub
		return "turn off the engine off the smart buss";
	}

	@Override
	String gearUp() {
		// TODO Auto-generated method stub
		return "gaer up the smart bus";
	}

	@Override
	String gearDown() {
		// TODO Auto-generated method stub
		return "gear down the smart bus";
	}

	@Override
	public String acOn() {
		// TODO Auto-generated method stub
		return "turn on the ac ";
	}

	@Override
	public String acOff() {
		// TODO Auto-generated method stub
		return "turn off the ac";
	}

	@Override
	public String LocationTracking() {
		// TODO Auto-generated method stub
		return "current location of the bus at raidurg";
	}

	@Override
	public String musicSystem() {
		// TODO Auto-generated method stub
		return "playing the oh baby song";
	}
	


	
}


public class BusClass {
	
	
	
	public static void main(String args[])
	{
		
		ArrayList<Bus> bus=new ArrayList<Bus>();
		Bus b1=new OrdinaryBus();
		bus.add(b1);
		b1.setBrand("tata");
		b1.setColor("rend and white");
		b1.setNo_of_tyres(6);
		b1.setHeadLights(4);
		b1=new SmartBus();
		bus.add(b1);
		b1.setBrand("telsa");
		b1.setColor("green and white");
		b1.setNo_of_tyres(4);
		IsmartBus isb= (SmartBus)b1;
		System.out.println(isb.acOff());		
		System.out.println(isb.acOn());
		System.out.println(isb.LocationTracking());
		System.out.println(isb.musicSystem());
		
		
		for(Bus b :bus)
		{
			System.out.println(b.getColor());
			System.out.println(b.engineOn());
			System.out.println(b.gearUp());
			System.out.println("the brand "+b.getBrand());
			
		}

		
}


	
	
	
	
	
	
	
	
	
	
	
	

}
