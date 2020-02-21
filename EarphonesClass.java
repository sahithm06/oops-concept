package day4;
interface wireless
{
	String bluetooth();
	String disconnect();
	
	
}
abstract class Earphones
{
	private String brand;
	private int cost;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	abstract String makeConnection();
	
	
}
class  MiEarphones extends Earphones
{

	@Override
	String makeConnection() {
		// TODO Auto-generated method stub
		return "making the wired connection ,pulgging into the phone";
	}
	
}
class BluetoothEarphones extends Earphones implements wireless
{

	@Override
	public String bluetooth() {
		// TODO Auto-generated method stub
		return "bluetooth is implented in th earphones";
	}

	@Override
	public String disconnect() {
		// TODO Auto-generated method stub
		return "disconnected from the device";
	}

	@Override
	String makeConnection() {
		// TODO Auto-generated method stub
		return "making connection woth the elp of bluetooth to other devices";
	}
	

	
	
}


public class EarphonesClass {
	
	
	public static void main(String args[]) 
	{
		Earphones ep=new MiEarphones();
		ep.setBrand("Mi");
		ep.setCost(500);
		//ep.setName("");
		System.out.println(ep.getBrand());
		System.out.println(ep.getCost());
		System.out.println(ep.makeConnection());
		ep=new BluetoothEarphones();
		ep.setBrand("boats");
		ep.setCost(1000);
		System.out.println(ep.getBrand());
		System.out.println(ep.getCost());
		System.out.println(ep.makeConnection());
		
		
		
	}

	
	
	
	
	
	
	
	
	
}
