package day3;
import java.util.*;
interface ordering{
	
	String order(Restaurent r);
}
/*interface payment 
{
	String makePayment();
}*/
class Restaurent 
{
	
	private String  name,pno;
     public Restaurent(String name,String pno)
     {
    	 
    	 this.name=name;
    	 this.pno=pno;
     }	 
    	 
    	 public String getPno() {
     
		return pno;
    	 }

	public void setPno(String pno) {
		this.pno = pno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String menu() 
	{
		return "heavy food \n biryani 250\nbutter nnaan 150\nlight food\nburger 60\npuff  25\n";
		
		
	}
	
}
class Zomato implements ordering
{
	ArrayList<Restaurent> rest=new ArrayList<Restaurent>();
	
	public Zomato(ArrayList<Restaurent> rest)
	{
		this.rest=rest;
	}
	void showRestaurents() 
	{

		for(Restaurent r : rest)
		{
			System.out.println(r.getName());
		}
	}
	
	public String order(Restaurent r)
	
	{
		
		return r.menu();
		
		
	}
	
	public String selectingItems()
	{
	  return "selecting the items and the items are selected";
	
	}
public 	String paymentfunction(payment p, Customer1 c1)
	{
		
		return c1.getName()+p.makePayment();
	}
	
}
	
class CashPayment implements payment 
{

	@Override
	public String makePayment() {
		// TODO Auto-generated method stub
		return "pay at the time of delivery";
	}
	
	
}
class Customer1
{
	private String name,pno,address;
	String ShowDetails() {
		
			return "customer detalis are displayed here";
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
class CardPayment implements payment
{

	@Override
	public String makePayment() {
		// TODO Auto-generated method stub
		return "your payment is succesfull ,please collect you delivey athe the adrress provided";
	}
	
}

public class ZomatoClass {

	public static void main(String args[]) {
		 
		Restaurent r1 = new Restaurent("bawarchi","5675333363557");
		
		Restaurent r2= new Restaurent("taj mahal","6355734556");
		
		ArrayList<Restaurent> rest=new ArrayList<Restaurent>();
		rest.add(r1);
		rest.add(r2);
		Customer1 c1=new Customer1();
		c1.setAddress("uppal");
		c1.setName("sahith");
		c1.setPno("346547585858");
		System.out.println("Restaurents are\n");
		Zomato z=new Zomato(rest);
		
		z.showRestaurents();
		System.out.println("menu \n");
		System.out.println(z.order(r1));
		
		System.out.println(z.paymentfunction(new CashPayment(),c1));
		
	}
}

















