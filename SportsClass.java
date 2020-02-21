

package day4;

import java.util.ArrayList;

interface camera
{
	
	String frontcam();
	String takePicture();
}
interface Touch
{
	String touch();
	
}
class Laptop
{
    private int cost;
    private String brand,model;
    public String powerOn()
    {
    	return "power on the"+this.brand+"laptop";
    	
    }
	public String powerOff()
	{
		return "power off the"+this.brand+"laptop";
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
}


class HP extends Laptop implements camera

{

	@Override
	public String frontcam() {
		// TODO Auto-generated method stub
		return "opening the cam";
	}

	@Override
	public String takePicture() {
		// TODO Auto-generated method stub
		return " taken a picture";
	}
	

	
}

class Dell extends Laptop implements Touch,camera
{

	@Override
	public String frontcam() {
		// TODO Auto-generated method stub
		return "front cam in dell";
	}

	@Override
	public String takePicture() {
		// TODO Auto-generated method stub
		return "taken a picture in dell laptop";
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return "implenting the touch featutres to the laptop";
	}
	
}



public class SportsClass {

	public static void main(String args[])
	{
		ArrayList<Laptop> laptop=new ArrayList<Laptop>();
		Laptop l=new HP();
		camera c=(HP)l;
		
		l.setBrand("hp");
		l.setCost(50000);
		l.setModel("2340E");
		laptop.add(l);
		l=new Dell();
		Touch t=(Dell)l;
		laptop.add(l);
		l.setBrand("dell");
		l.setCost(60000);
		l.setModel("240E");
		for(Laptop lappy : laptop)
		{
			System.out.println("the brand "+lappy.getBrand());
			System.out.println(lappy.powerOff());
			System.out.println(lappy.powerOn());
			System.out.println("cost : "+lappy.getCost());
		}
		
		System.out.println(c.frontcam());
		System.out.println(t.touch());
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
