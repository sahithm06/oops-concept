package day3;
import java.util.*;
interface payment
{
	String makePayment();
	
}
class WalletPayment implements payment
{

	@Override
	public String makePayment() {
		// TODO Auto-generated method stub
		return "reached destination \nyour fare is 246 rs and is deducted from the paytm wallet";
	}
	
}
class CashPayment1 implements payment 
{

	@Override
	public String makePayment() {
		// TODO Auto-generated method stub
		return "reached detination \nyour fare -321 ,please pay in cash";
	}
	
	
	
}

class Traveller
{
	private String name,pno,addresss;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public String getAddresss() {
		return addresss;
	}

	public void setAddresss(String addresss) {
		this.addresss = addresss;
	}
	

	
}

class Vechile
{
	private String driverName,drivernumber;
	private String carNumber,carName;
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDrivernumber() {
		return drivernumber;
	}
	public void setDrivernumber(String drivernumber) {
		this.drivernumber = drivernumber;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}

	
}
class Uber 
{
	//ArrayList<Traveller> tlist=new ArrayList<Traveller>();
	ArrayList<Vechile> Vlist=new ArrayList<Vechile>();
	public Uber(ArrayList<Vechile> Vlist)
	{
		this.Vlist=Vlist;
	}
	
	Vechile searchVechiles() 
	{
		System.out.println("searching nearest drivers");
		return Vlist.get(2);
	}
	
	public String book(Traveller t)
	{
		Vechile v=searchVechiles();
		return "you booked succesfully  \n arriving in 3 minutes\ndeatils of vechile are "+v.getCarName()+"\n"+v.getCarNumber()+"\n"+v.getDriverName()+"\n"+v.getDrivernumber();

	}

	public String payment(payment p)
	
	{
		return p.makePayment();
	}
	

}
public class UberClass {
	
	public static void main(String args[])
	{
		ArrayList<Vechile> Vlist=new ArrayList<Vechile>();
	
		Vechile v1=new Vechile();
		v1.setCarName("verna");
		v1.setCarNumber("ts09l1234");
		v1.setDriverName("rama swamy");
		v1.setDrivernumber("89078907");
		Vlist.add(v1);
		v1.setCarName("swift");
		v1.setCarNumber("ts09l12334");
		v1.setDriverName("swamy");
		v1.setDrivernumber("89078907");
		Vlist.add(v1);
		v1.setCarName("wagoner");
		v1.setCarNumber("ts025674");
		v1.setDriverName("haseeb");
		v1.setDrivernumber("890789097");
		Vlist.add(v1);
		Uber u=new Uber(Vlist);
		Traveller t=new Traveller();
		t.setAddresss("uppal");
		t.setName("sahith");
		t.setPno("78978078979");
		System.out.println(u.book(t));
		System.out.println(u.payment(new CashPayment1()));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
