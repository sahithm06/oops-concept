package com.practice;

interface  Connection{
	
	String makeConnection();
}

/*interface WireLessConnection
{
	String makeWirelessConnection();
	
}*/

class Bluetooth implements Connection{
	
	
	public String makeConnection() {
return "makin up the bluetooth connection";
	}


}
class wifiprotect implements Connection
{

	@Override
	public String makeConnection() {
		// TODO Auto-generated method stub
		return "making up the wifi wireless connections ";
	}
	
}


abstract class Printer {
	private String  brand,model,color  ;
	private String catridgeType      ;
	
	public   Printer(String b,  String c, String ct ,String m )
	{
		
		brand=b;
		model=m;
		color=c;
		catridgeType=ct;
		
		
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCatridgeType() {
		return catridgeType;
	}

	public void setCatridgeType(String catridgeType) {
		this.catridgeType = catridgeType;
	}
	abstract String poweron() ;
	abstract String poweroff();
	abstract String  print();
	abstract String  insertpaper();
	abstract String  removepaper();
	
	abstract String establishConnection();
}
class  WiredPrinter extends  Printer   implements Connection{

	
	public WiredPrinter(String b, String c, String ct, String m) {
		super(b, c, ct, m);
	
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeConnection() {
		// TODO Auto-generated method stub
		return "making up the wired connecton";
	}

	@Override
	String poweron() {
		// TODO Auto-generated method stub
		return "power on the printer";
	}

	@Override
	String poweroff() {
		// TODO Auto-generated method stub
		return "power off the printer";
	}

	@Override
	String print() {
		// TODO Auto-generated method stub
		return "print the pages";
	}

	@Override
	String insertpaper() {
		// TODO Auto-generated method stub
		return "inserting the pages";
	}

	@Override
	String removepaper() {
		// TODO Auto-generated method stub
		return "removeing the pages";
	}
	String establishConnection()
	{
		
		return "wired connection is established";
		
	}
	
	
	
}

class  WireLessPrinter   extends Printer    {
	Connection wlc;
	
	public WireLessPrinter(String b, String c, String ct, String m, Connection wlc) 
	{
		super(b, c, ct, m);
		this.wlc=wlc;
		// TODO Auto-generated constructor stub
	}

	

	@Override
	String poweron() {
		// TODO Auto-generated method stub
		return "power on the printer (wirelss)";
	}

	@Override
	String poweroff() {
		// TODO Auto-generated method stub
		return "power off the printer ";
	}

	@Override
	String print() {
		// TODO Auto-generated method stub
		return "printing the pages from wireless printer";
	}

	@Override
	String insertpaper() {
		// TODO Auto-generated method stub
		return "inserting the pages to the wireless printer";
	}

	@Override
	String removepaper() {
		// TODO Auto-generated method stub
		return "remove the pages from the wireless printer";
	}
	
	String establishConnection()
	{
		
		return wlc.makeConnection();
		
	}
	
	
}








public class main9 {
	public static void main(String argss[])
	{
		
		Printer p1=new WiredPrinter("epson","white","inkjet","123");
		
		
		System.out.println(p1.poweroff());
		System.out.println(p1.poweron());
		System.out.println(p1.print());
		System.out.println(p1.removepaper());
		System.out.println(p1.getBrand());
		System.out.println(p1.establishConnection());
		
		Connection wlc=new wifiprotect();
		p1 = new WireLessPrinter("HP","black","laser","124",wlc);
		
	
		System.out.println(p1.getBrand());
		System.out.println(p1.poweroff());
		System.out.println(p1.poweron());
		System.out.println(p1.insertpaper());
		System.out.println(p1.removepaper());
		
		System.out.println(p1.establishConnection());
	}
	

}
