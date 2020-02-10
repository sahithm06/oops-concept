package com.practice;
interface Drink
{
	String drink();
	
}
interface oil
{
	String applyOil();
}
abstract class Bottle
{

	private int capacity;
	private String brand,material;
	public Bottle(int c,String b,String m)
	{
	setCapacity(c);
	setBrand(b);
	setMaterial(m);
	
	}	

	abstract String openlid();
	abstract String closelid();
	abstract String fill();
	abstract boolean isEmpty();
	abstract boolean isFull();

	public int getCapacity() {
	return capacity;
	}

 public void setCapacity(int capacity) {
	this.capacity = capacity;
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



}

class WaterBottle extends Bottle implements Drink{

	public WaterBottle(int c, String b, String m) {
		super(c, b, m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String drink() {
		// TODO Auto-generated method stub
		return "Drinking the water";
	}

	@Override
	String openlid() {
		// TODO Auto-generated method stub
		return "opening the lid of water bottle";
	}

	@Override
	String closelid() {
		// TODO Auto-generated method stub
		return "closing the lid of the water bottle";
	}

	@Override
	String fill() {
		// TODO Auto-generated method stub
		return "filling the water bottle";
	}

	@Override
	boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean isFull() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
}
class OilBottle extends Bottle implements oil{

		public OilBottle(int c, String b, String m) {
			super(c, b, m);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String applyOil() {
			// TODO Auto-generated method stub
			return "apply the oil to legs or hair or to anything";
		}

		@Override
		String openlid() {
			// TODO Auto-generated method stub
			return "opeing the oil bottle";
		}

		@Override
		String closelid() {
			// TODO Auto-generated method stub
			return "closing the oil bottle";
		}

		@Override
		String fill() {
			// TODO Auto-generated method stub
			return "filling the oil in the oil bottle";
		}

		@Override
		boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		boolean isFull() {
			// TODO Auto-generated method stub
			return true;
		}
		

		
	}





public class main4 {

	
	public static void main(String args[])
	{
		Bottle b=new WaterBottle( 2,"tuperware", "hard plastic");
		System.out.println(b.closelid());		
		System.out.println(b.openlid());	
		System.out.println(b.fill());	
		System.out.println("is empty :"+ b.isEmpty());	
		 Drink d1=(WaterBottle)b;
		 System.out.println(d1.drink());	
		 b= new OilBottle(1,"abc","light plastic ");
	   System.out.println(b.closelid());
	   System.out.println(b.openlid());
	   System.out.println(b.fill());
	   System.out.println("is emppty :"+b.isEmpty());
	   oil o1=(OilBottle)b;
	   System.out.println(o1.applyOil());
	   
	   
	   
	}
	

	
}

