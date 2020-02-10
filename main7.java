package com.practice;
abstract class chair
{
	private int legs_or_wheels;
	private String material,color;
	public chair(int nof,String mt,String c)

	{
      		setNo_of_legs(nof);
      		setMaterial(mt);
      		setColor(c);
      		
	}
	public int getNo_of_legs() {
		return legs_or_wheels;
	}
	public void setNo_of_legs(int no_of_legs) {
		this.legs_or_wheels = no_of_legs;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	abstract String sit();
	abstract String getup();
	abstract String clean();
abstract String move();
}
class RegularChair extends chair 
{

	public RegularChair(int nof, String mt, String c) {
		super(nof, mt, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	String sit() {
		// TODO Auto-generated method stub
		return "sitting on the regular chair";
	}

	@Override
	String getup() {
		// TODO Auto-generated method stub
		return "getting up from the regular chair";
	}

	@Override
	String clean() {
		// TODO Auto-generated method stub
		return "cleaing the regular chair";
		}

	@Override
	String move() {
		// TODO Auto-generated method stub
		return "moving the reugular chair";
	}
	
	
	
}
interface IWheelChair{
	
	String applyBrakes();
	String rotate();
	String adjust();
	
}

class SmartWheelChair extends chair implements IWheelChair{

	public SmartWheelChair(int nof, String mt, String c) {
		super(nof, mt, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	String sit() {
		// TODO Auto-generated method stub
		return "sitting on the wheel chair";
	}

	@Override
	String getup() {
		// TODO Auto-generated method stub
		return "getting up from the wheel chair";
	}

	@Override
	String clean() {
		// TODO Auto-generated method stub
		return "cleaning up the wheel chair";
	}

	@Override
	String move() {
		// TODO Auto-generated method stub
		return "moving the wheel chair";
	}

	@Override
	public String applyBrakes() {
		// TODO Auto-generated method stub
		return "applying brakes to stop the wheel chair";
	}

	@Override
	public String rotate() {
		// TODO Auto-generated method stub
		return "rotating the whell chair";
	}

	@Override
	public String adjust() {
		// TODO Auto-generated method stub
		return "bring the wheel chair to the relaxed position or adjusting";
	}

}





public class main7 {
public static void main(String args[])
{
	chair c1 = new RegularChair(4,"plastic","cream");
	System.out.println(c1.clean());
	System.out.println(c1.getup());
	System.out.println(c1.move());	
	//System.out.println();
	
	c1=new SmartWheelChair(4,"sponge","black");
	System.out.println(c1.clean());
	System.out.println(c1.getup());
	System.out.println(c1.move());	
	//System.out.println(c1.move());
	IWheelChair iw= (SmartWheelChair)c1;
	System.out.println(iw.applyBrakes());
	System.out.println(iw.adjust());
	System.out.println(iw.rotate());
	
}
}
