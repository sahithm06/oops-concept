package com.practice;
interface IRegular
{
	String openCap();
	String closeCap();
}
interface Clickable{
	String click();
}
abstract class Pen{
	private int length;
	private String brand,type,material,color;
	public Pen(int length,String brand,String type,String material,String color)
	{
		this.setColor(color);
		this.setMaterial(material);
	
	this.setBrand(brand);
	this.setLength(length);
	
	this.setType(type);
	
	
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
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
public 	String write()
	{
		return "writing with the "+this.getClass().getSimpleName();
	}
	abstract String hold();
	abstract String changeRefill();
	
}

class RegularPen extends Pen implements IRegular
{

	public RegularPen(int length, String brand, String type, String material, String color) {
		super(length, brand, type, material, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	String hold() {
		// TODO Auto-generated method stub
		return "holding the regular pen";
	}

	@Override
	String changeRefill() {
		// TODO Auto-generated method stub
		return "changing the refill of regular pen";
	}

	@Override
	public String openCap() {
		// TODO Auto-generated method stub
		return "opening the cap of regular pen";
	}

	@Override
	public String closeCap() {
		// TODO Auto-generated method stub
		return "closing the cap of regular pen";
	}
	
	
}


class ClickPen extends Pen implements Clickable{

	public ClickPen(int length, String brand, String type, String material, String color) {
		super(length, brand, type, material, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String click() {
		// TODO Auto-generated method stub
		return "click the pen to write";
	}

	@Override
	String hold() {
		// TODO Auto-generated method stub
		return "holding the clickable pen ";
	}

	@Override
	String changeRefill() {
		// TODO Auto-generated method stub
		return "changing the refill of clickable";
	}
	
}


class PenClass{
	
	
	public static void main(String args[])
	{
		Pen p= new RegularPen(1,"reynolds","regular","plsatic","black");
		System.out.println(p.changeRefill());
		System.out.println(p.hold());
		System.out.println(p.write());
		
		IRegular ir=(RegularPen)p;
		
		System.out.println(ir.closeCap());
		System.out.println(ir.openCap());
		
		p= new ClickPen(1,"reynolds","regular","plsatic","black");
		System.out.println(p.changeRefill());
		System.out.println(p.hold());
		System.out.println(p.write());
	
		Clickable c=(ClickPen)p;
		System.out.println(c.click());
		
		
	}

}
