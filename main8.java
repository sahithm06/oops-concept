package com.practice;

interface  MobileData{
	String dataon();
	String dataoff();
	
}
interface Internet extends MobileData
{
	String wifiON();
	String wifiOff();
	String hotspotOn();
	String hotspotOff();
	
}

abstract class phone {
	
	private String phoneNo ,color,brandName ;
	private int modelNo  ;
	
	public  phone (String pno,String c,String bN ,int mno )
	{
		
		phoneNo=pno;
		//model=m;
		color=c;
		brandName=bN;
		modelNo=mno;

	}
	abstract String  call()   ;
	abstract String     message();
	abstract String     poweroff();
	abstract String     poweron();
	
	
	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	
}
class  NormalPhone extends   phone  implements MobileData{

	public NormalPhone(String pno,  String c, String bN, int mno) {
		super(pno,  c, bN, mno);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String dataon() {
		// TODO Auto-generated method stub
		return "mobile data is on";
	}

	@Override
	public String dataoff() {
		// TODO Auto-generated method stub
		return "mobile data is turned off";
	}

	@Override
	String call() {
		// TODO Auto-generated method stub
		return "calling from normal phone";
	}

	@Override
	String message() {
		// TODO Auto-generated method stub
		return "messaging from the normal phone";
	}

	@Override
	String poweron() {
		// TODO Auto-generated method stub
		return "turing on the mobile phone";
	}

	@Override
	String poweroff() {
		// TODO Auto-generated method stub
		return "turning off the mobile phone";
	}
	

}

class  SmartPhone   extends phone implements Internet    {

	public SmartPhone(String pno,  String c, String bN, int mno) {
		super(pno,  c, bN, mno);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String dataon() {
		// TODO Auto-generated method stub
		return "mobile data is on in smart phone";
	}

	@Override
	public String dataoff() {
		// TODO Auto-generated method stub
		return "mobile data is turn off in smart phone";
	}

	@Override
	public String wifiON() {
		// TODO Auto-generated method stub
		return "wifi is turned on in smart phone";
	}

	@Override
	public String wifiOff() {
		// TODO Auto-generated method stub
		return "wifi is turned off in smart phone";
	}

	@Override
	public String hotspotOn() {
		// TODO Auto-generated method stub
		return "hotspot is turned on i";
	}

	@Override
	public String hotspotOff() {
		// TODO Auto-generated method stub
		return "smart phone is turned off in smart phone";
	}

	@Override
	String call() {
		// TODO Auto-generated method stub
		return "calling from smart phone";
	}

	@Override
	String message() {
		// TODO Auto-generated method stub
		return "messaging from smart phone";
	}

	@Override
	String poweroff() {
		// TODO Auto-generated method stub
		return "power off the smart phone";
	}

	@Override
	String poweron() {
		// TODO Auto-generated method stub
		return "powering on the smart phone";
	}
	
	
	
	
	
	
	
}

public class main8 {
	public static void main(String argss[])
	{
		phone p1=new NormalPhone("9897989796", "black", "nokia", 2302);
		MobileData md=(NormalPhone)p1;
		System.out.println(p1.call());
		System.out.println(p1.poweroff());
		System.out.println(p1.poweron());
		System.out.println(p1.message());
		System.out.println(md.dataoff());
		System.out.println(md.dataon());
	 p1 = new  SmartPhone("9897989796", "red", "samsung", 202);
	 
	 System.out.println(p1.call());
	 System.out.println(p1.poweroff());
	 System.out.println(p1.poweron());
	 System.out.println(p1.getBrandName());
	 System.out.println(p1.message());
	 Internet in=(SmartPhone)p1;
	 System.out.println(md.dataoff());
		System.out.println(in.dataon());
		System.out.println(in.hotspotOff());
		System.out.println(in.dataoff());
		System.out.println(in.hotspotOn());
		System.out.println(in.wifiOff());
		System.out.println(in.wifiON());
	}
	
}
