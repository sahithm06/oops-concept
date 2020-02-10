package com.practice;
interface Button
{
	
	String closeButtons();
	String OpenButtons();

}
abstract class ShirtAbstract  {
	
	private int size;
	private String necktype;
	public ShirtAbstract(int s,String neck)
	{
		setSize(s);
		setNecktype(neck);
		
	}
	
	abstract String wear();
	abstract String remove();
	abstract String wash();
	abstract String dry();

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the necktype
	 */
	public String getNecktype() {
		return necktype;
	}

	/**
	 * @param necktype the necktype to set
	 */
	public void setNecktype(String necktype) {
		this.necktype = necktype;
	}
	
	
}

class Tshirt extends ShirtAbstract  
{
	
	public Tshirt(int s, String neck) {
		super(s, neck);
		// TODO Auto-generated constructor stub
	}
	public String wear() {
		
		return "wearing t shirt";
	}
	public  String remove() {
		
		return "removing tshirt";
		
	}
	 public String wash()
	 {
		 
		 return "washing t shirt";
	 }
	
 public String dry()
 {
	 
	 
	 return "drying the t shirt";
 }




}

class Shirt extends ShirtAbstract implements Button{
	
	
public Shirt(int s, String neck) {
		super(s, neck);
		// TODO Auto-generated constructor stub
	}
public 	String wear() {
		
		return "wearing normalshirt";
	}
	public  String remove() {
		
		return "removing normal shirt";
		
	}
public 	 String wash()
	 {
		 
		 return "washing  normal shirt";
	 }
	
public  String dry()
 {
	 
	 
	 return "drying the noraml shirt";
 }

	public String closeButtons() {
		return "button your shirt";
		
		
	}
	public String OpenButtons() {
	return "unbutton your shirt";
}
}
public  class main3 {
public static void main(String args[]) 
{
	Tshirt tshirt=new Tshirt(32,"roundneck");
	ShirtAbstract  sa=tshirt;
	 System.out.println(sa.wear());
	 System.out.println(sa.remove());
	 System.out.println(sa.dry());
	 System.out.println(sa.wash());
	
	 Shirt shirt=new Shirt(42,"collar less");
	 ShirtAbstract  sa1 =shirt;
	 Button b=shirt;
	 System.out.println(sa1.wear());
	 System.out.println(sa1.remove());
	 System.out.println(sa1.dry());
	 System.out.println(sa1.wash());
	 System.out.println(b.closeButtons());
	 System.out.println(b.OpenButtons());
}
	


}









