package com.practice;

interface GrandFather1
{
	int age=75;
	String name1="grandfather1 ";
	String grandFather1Details();
			
}
interface GrandMother1
{
	int age=69;
	String name2="grandmother1 ";
	String grandMother1Details();
			
}
interface GrandMother2
{
	int age=69;
	String name3="grandmother2 ";
	String grandMother2Details();
			
}
interface GrandFather2
{
	int age=65;
	String name4 ="grandfather2 ";
	String grandFather2Details();
	
}

interface Father extends GrandFather1,GrandMother1
{
	int age=45;
	String name5="father ";
	String FatherDetails();
}
interface Mother extends GrandMother2,GrandFather2
{
	
	int age=39;
	String name6="1 ";
	String MotherDetails();
}


class child1 implements Father,Mother
{

	@Override
	public String grandFather1Details() {
		// TODO Auto-generated method stub
		return "grand father 1 born in vizag";
	}

	@Override
	public String grandMother1Details() {
		// TODO Auto-generated method stub
		return "grand mother1 born in tirupathi";
	}

	@Override
	public String grandMother2Details() {
		// TODO Auto-generated method stub
		return "grand mother 2 born in hyderbad";
	}

	@Override
	public String grandFather2Details() {
		// TODO Auto-generated method stub
		return "grand father 2 born in benguluru";
	}

	@Override
	public String MotherDetails() {
		// TODO Auto-generated method stub
		return "motherv born in the hyderBAD";
	}

	@Override
	public String FatherDetails() {
		// TODO Auto-generated method stub
		return "FATHER born in the delhi";
	}
	
	
	
	
}

public class main16 {
	
	public static void main(String args[])
	{
	child1 c1 = new child1();
			
System.out.println(c1.grandMother1Details()+"and married to my "+c1.name1);
		System.out.println(c1.grandMother2Details()+" and married to my "+c1.name4);
		System.out.println(c1.MotherDetails()+" and married to my "+c1.name5);


	}


}




















