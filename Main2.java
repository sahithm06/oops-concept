package com.practice;


interface locks 
{
	String lock();
	String unlock();
}
 abstract class Door {
 Dimensions d1;
 public Door(Dimensions d1)
 {
	 this.d1=d1;
 
 }
 abstract String open();
 abstract String close();
 	abstract  boolean isTransperent();
	abstract String clean();
	//abstract String  clean();
	double Area()
	
	{
		return (d1.getLength())*(d1.getBreadth());

	}
	
	
}
class Dimensions
{
	private int length;
	private int breadth;
    private double thickness;
    public Dimensions(int l,int h,double d)
    {
    	setLength(l);
    	setBreadth(h);
    	setThickness(d);
    	
   }

	public void setThickness(double thickness) {
		this.thickness = thickness;
	}





	public int getLength() {
		return length;
	}





	public void setLength(int length) {
		this.length = length;
	}





	public int getBreadth() {
		return breadth;
	}





	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}





	public double getThickness() {
		return thickness;
	}

}


class GlassDoor extends Door implements locks
{
	

	public GlassDoor(Dimensions d1) {
		super(d1);
	}

	@Override
	boolean isTransperent() {
		// TODO Auto-generated method stub
		return true ;
	}

	@Override
	public String open() {
		// TODO Auto-generated method stub
		return "pushing the glass door";
	}

	@Override
	public String close() {
		// TODO Auto-generated method stub
		return "pulling th glass door";
	}
	
   

  public String clean()
{
	return "cleaning the glass door";
	
}


@Override
public String  lock() {
	// TODO Auto-generated method stub
	return "locking the glass door";
}
@Override
public String unlock() {
	// TODO Auto-generated method stub
	return "unlocking the glass door";
}


}




class WoodDoor extends Door implements locks
{
	public WoodDoor(Dimensions d1) {
		super(d1);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String close() {
		// TODO Auto-generated method stub
		return "closing the wooden door";
	}

	@Override
	public String open() {
		// TODO Auto-generated method stub
		return "opening the wooden door";
	}

	@Override
	boolean isTransperent() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	String clean() {
		// TODO Auto-generated method stub
		return "cleaning the wooden door";
	}

	@Override
	public String lock() {
		// TODO Auto-generated method stub
		return "locking the wodden door";
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "unlocking the wooden door";
	}



}

public class Main2
{
      public static void main(String args[])
	{
		Dimensions d1=new Dimensions(10,6,2);
		Dimensions d2=new Dimensions(6,3,1);
		//GlassDoor gd1
		Door g1=new GlassDoor(d1);;
		
		locks ll=(GlassDoor)g1;
		
		
		System.out.println("area of glass  door"+g1.Area());
		System.out.println(g1.clean());
		System.out.println("transpernent : "+g1.isTransperent());
		System.out.println(g1.clean());

		System.out.println(ll.lock());
		System.out.println(ll.unlock());
		
		 
		//CarGlass cg1
		Door g2=new WoodDoor(d2);;
		ll=(WoodDoor)g2;

		
		
        System.out.println("area of car door"+g2.Area());
		System.out.println(g2.clean());
		

		System.out.println("transpernent : "+g2.isTransperent());
		System.out.println(g2.clean());
		System.out.println(ll.unlock());
		
		
		
		
	}


}



