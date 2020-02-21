package day4;
import java.util.*;
//import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat; 

import java.util.Calendar;
 class KYCRange
{
	private Date signUpDate,currDate;
	private int compare1,compare2;
	private  Date date;
	private Date startKYCDate,endKYCDate;
	private String sKYC, eKYC;
	
	private SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-yyyy"); 
	
	public KYCRange( String date1,String date2) throws ParseException 
	 {
		  
		    this.signUpDate= sdf.parse(date1);
		    this.currDate= sdf.parse(date2);
		
	 }

	public void printInput()
	{
		System.out.println("The anniversary date is "+signUpDate+" \n"+"the current date is "+currDate);
	}

	
	 public int compareDates(Date d1,Date d2)
	 {
		 return d1.compareTo(d2);
	 }
	
	 
	 
	 public Date addDays(Date date ,int days)
	 {
		 Calendar c =Calendar.getInstance();
		 c.setTime(date);
		 c.add(Calendar.DATE, days);
		 return c.getTime();
	 }
	
	 
	 
	 @SuppressWarnings("deprecation")
	public String findRange()
	 {
		 date = signUpDate;
		 date.setYear(currDate.getYear());
		 //bringing the anniversary year(only year) to given current year
		if(signUpDate.getYear()==currDate.getYear())
		{	
		 date.setYear(currDate.getYear()+1);
		}
		
			
		 endKYCDate=addDays(date, 30);
		 
		 startKYCDate=addDays(date, -30);
		 
		   compare1 = compareDates(currDate,startKYCDate);
		   compare2= compareDates(currDate,endKYCDate);
		   sKYC= sdf.format(startKYCDate);
		   eKYC= sdf.format(endKYCDate);
		   
		   if(compare1==1 && compare2 == -1)
		   {
			  
			   return sKYC+"\n"+sdf.format(currDate);
		   }
		   
		   else 
		   {
			return sKYC+"\n"+eKYC;

		   }
		
 
	 }

	public Date getSignUpDate() {
		return signUpDate;
	}

	

	public Date getCurrDate() {
		return currDate;
	}

	





}


public class GruberHealthCare {
	
	
	
//	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws ParseException
	{
	int compare;
		 int i;
		 int n;
		 Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 String signUp[]=new String[n];
		 String currentDate[]=new String[n];
		
		 for(i=0;i<n;i++)
		 {
			 signUp[i]=sc.next();
			 currentDate[i]=sc.next();
		 }
				 
		 
		 for(i=0;i<n;i++)
		 {
			KYCRange kyc=new KYCRange(signUp[i],currentDate[i]);
			
			kyc.printInput();
			compare=kyc.compareDates(kyc.getSignUpDate(),kyc.getCurrDate());	  
		    if(compare>=0 )
		     {  System.out.println("No range"); }
		    else
		    {System.out.println(kyc.findRange());   }
		
		}
	}
	

}
