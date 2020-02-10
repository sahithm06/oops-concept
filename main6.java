package com.practice;
interface tapping
{
	String tap();
}

interface Handle{
	
	String gripTheHandle();
    
}

interface Ithreads{
	String tightThethreads();
	String looseTheThreads();
}

abstract class Bat{
	
	
	private String materialtype,brand;
	private double weight;
public Bat(double w,String b,String mt) {
		setMaterialtype(mt);
		setBrand(b);
		setWeight(w);
    }
public String getMaterialtype() {
	return materialtype;
}
public void setMaterialtype(String materialtype) {
	this.materialtype = materialtype;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
	
abstract String hit();
abstract String hold();


}

class CricketBat extends Bat implements tapping,Handle{

	public CricketBat(double w, String b, String mt) {
		super(w, b, mt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String tap() {
		// TODO Auto-generated method stub
		return "tapping on the ground with cricket bat";
	}

	@Override
	public String hit() {
		// TODO Auto-generated method stub
		return "hitting the ball with cricket bat";
	}

	@Override
	public String hold() {

		// TODO Auto-generated method stub
		return "holding the cricket bat";
	}

	@Override
	public String gripTheHandle() {

		// TODO Auto-generated method stub
		return "cover the handle of the cricket bat with grip";
	}


}

class TennisBat extends Bat implements Ithreads,Handle

{

	public TennisBat(double w, String b, String mt)
 {
		super(w, b, mt);
		// TODO Auto-generated constructor stub
	}

	@Override

	public String tightThethreads() {
		// TODO Auto-generated method stub
		return "tight the threads of the tenis bat";
	}

	@Override

	public String looseTheThreads() {
		// TODO Auto-generated method stub
		return "fixing of thee threads of the tennis bat";
	}

	@Override

	public String hit() {
		// TODO Auto-generated method stub
		return "hitting the ball with the tennis bat";
	}

	@Override

	public String hold() {
		// TODO Auto-generated method stub
		return "hloding the tennis bat";
	}

	@Override

	public String gripTheHandle() {
		// TODO Auto-generated method stub
		return "griping up the handle of the tennis bat";}


}

public class main6 {

	public static void main(String args[])
	{
	Bat b1=new CricketBat(1,"mrf","wood");
	tapping t1=(CricketBat)b1;
	Handle h1=(CricketBat)b1;
	
	System.out.println(b1.hit());
	System.out.println(b1.hold());
	System.out.println(t1.tap());
	System.out.println(h1.gripTheHandle());
	
	b1= new TennisBat(1.0,"abc","plastic");
	
	h1=(TennisBat)b1;
	
	System.out.println(h1.gripTheHandle());
	Ithreads it=(TennisBat)b1;
	System.out.println(it.tightThethreads());
	
	}

	
}
