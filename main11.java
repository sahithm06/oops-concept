package com.practice;

abstract class Specs 
{
   String materialType;
   String frameType,color;
   public Specs(String materialType,String frameType,String color)
   {
	   this.frameType=frameType;
	   this.color=color;
	   this.materialType = materialType;

   }
   String wear() {
		// TODO Auto-generated method stub
		return "putting on the glasses ";
	}


	String remove() {
		// TODO Auto-generated method stub
		return "putting off the glasses";
	}

	
	String clean() {
		// TODO Auto-generated method stub
		return "clean the cooling glasses";
	}
public String openTemples() {
	// TODO Auto-generated method stub
	return "opening the side frames";
}


public String closeTemples() {
	// TODO Auto-generated method stub
	return "closing the side frames";
}

abstract String purpose();

public String getMaterialType() {
	return materialType;
}

public void setMaterialType(String materialType) {
	this.materialType = materialType;
}

public String getFrameType() {
	return frameType;
}

public void setFrameType(String frameType) {
	this.frameType = frameType;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

}
class SightSpecs extends Specs {
	
	private double sight;
	public SightSpecs(String materialType, String frameType, String color,double sight) 
	{
		super(materialType, frameType, color);
		this.sight=sight;
		// TODO Auto-generated constructor stub
	}


	@Override
	String purpose() {
		// TODO Auto-generated method stub
		return "for the purpose of clear vison";
	}

	public double getSight() {
		return sight;
	}

	public void setSight(double sight) {
		this.sight = sight;
	}

	

}
class CoolingGlasses extends Specs{

	public CoolingGlasses(String materialType, String frameType, String color)
	{
		super(materialType, frameType, color);
		
		// TODO Auto-generated constructor stub
	}
	String purpose() {
		// TODO Auto-generated method stub
		return "to look stylish ";
	}
	
}

class PowerGlasses extends SightSpecs
{
 
	public PowerGlasses(String materialType, String frameType, String color,double sight)
	{
		
		super(materialType, frameType, color,sight);
		// TODO Auto-generated constructor stub
	}

	@Override
	String purpose() {
		// TODO Auto-generated method stub
		return "to look stylish as well as the for the clear vision";
	}
	
	
}

public class main11{
	
	public static void main(String Args[]) { 
		
	Specs s1=new SightSpecs("metal","full frame","black",1.5);
	
	System.out.println(s1.clean());
	System.out.println(s1.closeTemples());
	System.out.println(s1.openTemples());
	System.out.println(s1.purpose());
	System.out.println(s1.wear());
	
	
	s1=new CoolingGlasses("plastic ","ovalshape","mango yellow");
	
	System.out.println(s1.clean());
	System.out.println(s1.closeTemples());
	System.out.println(s1.openTemples());
	System.out.println(s1.purpose());
	System.out.println(s1.wear());
	
	 s1=new SightSpecs("metal","rectangular","blue",2.4);
	
	
	 System.out.println(s1.clean());
		System.out.println(s1.closeTemples());
		System.out.println(s1.openTemples());
		System.out.println(s1.purpose());
		System.out.println(s1.wear());
	
	
	
	
	
	}
	
	
	
	
	
	
	
	

}