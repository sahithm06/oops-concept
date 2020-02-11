package com.practice;
import java.util.*;
interface PinOperations
{
	
    boolean verifyPin(int pin);
     boolean changePin();
	
}
class Pin implements PinOperations{
	
	
	private int pin;
	
	Scanner sc=new Scanner (System.in);
	


	@Override
	public boolean verifyPin(int pin) {
		// TODO Auto-generated method stub
		if(this.pin==pin) { return true;}
		
		
		else {return false;}
	}

	@Override
	public boolean changePin()
	{
		
		System.out.println("enter the pin to change");
		int pin=sc.nextInt();
		if(verifyPin(pin)) 
		{
			System.out.println("enter new pin");
			this.pin=sc.nextInt();
			return  true;
		}
		else
		{
		return false;
		}
	
	
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
	
}
	
class Atm
{
	
	private String BankAccNo,Name,Pno;
	private double Balance;
	PinOperations p;
	
	public Atm(String accno,String name,double bal,PinOperations p)
	{
		this.Balance=bal;
		this.BankAccNo=accno;
		this.Name=name;
		this.p=p;
	}
	Scanner sc=new Scanner (System.in);
	public String getPno() { 
		return Pno;
	}
	public void setPno(String pno) {
		Pno = pno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBankAccNo() {
		return BankAccNo;
	}
	public void setBankAccNo(String bankAccNo) {
		BankAccNo = bankAccNo;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public String withDrawl(int amt)
	{
		
		System.out.println("enter the pin");
		int pin=sc.nextInt();
		if(p.verifyPin(pin))
		{
			Balance = Balance -amt;
			return "succesful, colect your money"+amt;
		}
		else return "unsuccesfull";
	
	}
	
	
}


public class main15 {
	
	public static void main (String args[]) {
		Pin p= new Pin();
		p.setPin(1234);
		PinOperations po=p;
	Atm a1=new Atm("12345","sahir",17419.00,po);
	
	System.out.println(a1.withDrawl(1000));
	System.out.println(a1.getBalance());
	System.out.println(po.changePin());
	

	 
	}
	
	
	
	
	
	
	
	
	

}
