package com.practice;


interface walking
{
	String walk();
	String Run(); // every walkable animal can run
}
interface jumping
{
	String jump();

}
interface slithering
{
	String slither();

}
public abstract class Animal{
    private String Name,breed;
     private int length,height;
    private  String  colour ;
     public Animal(int len,int ht,String col,String breed)
     {
    	 Name=this.getClass().getName();
    	 length=len;
    	 height=ht;
    	colour=col;
    	 this.breed=breed;
     }
     
    public abstract String sleep();
	public abstract String eat();
	
	public int getLength() { return length; }
	public String getName() { return Name ;}
	public String  getColour() {return colour; }
	public String getBreed() {return breed;}
	public int getHeight() {return height ;}
}
 class Dog extends Animal implements walking {

	 public Dog(int len,int ht,String col,String breed)
	 {
		 super( len,ht,col, breed);
		 
		 
	 }
	 
	 
	 
	 
	 
	@Override
	public String walk() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName()+" is walking";
	}

	@Override
	public String Run() {
		// TODO Auto-generated method stub
		return (this.getClass().getSimpleName())+" is running";
	}

	@Override
	public String sleep() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName()+" is sleeping";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName()+" is eating";
	}
	public String bark()										//new method in dog
		{
			
			return this.getClass().getSimpleName()+" is barking";
		}
	

}
class Snake extends Animal implements slithering{

	

	 public Snake(int len,int ht,String col,String breed)
	 {
		 super( len,ht,col, breed);
		 
		 
	 }
	 

	@Override
	public String sleep() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName()+" is sleeping";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName()+" is eating";
	}

	@Override
	public String slither() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName()+" is slithering";
	}
   
}

class Rabbit extends Animal implements jumping,walking
{


	 public Rabbit(int len,int ht,String col,String breed)
	 {
		 super( len,ht,col, breed);
		 
		 
	 }
	 
	@Override
	public String walk() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName()+" is walking";
	}

	@Override
	public String Run() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName()+" is running";
	}

	@Override
	public String sleep() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName()+" is sleeping";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName()+" is eating";
	}

	@Override
	public String jump() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName()+" is jumping";
	}


}

class Main
{
	
public static void main(String args[])
{	Dog d1=  new Dog(3,2,"balck","pub");
	Animal a1=d1;
	System.out.print(a1.sleep());
	
	System.out.println(a1.eat());
	System.out.println("length in meters: "+a1.getLength());
	System.out.println("breed: "+a1.getBreed());

  a1 = new Rabbit(1,2,"white","normal");
  System.out.print(a1.sleep());
	
	System.out.println(a1.eat());
	System.out.println("length in meters: "+a1.getLength());
	System.out.println("breed: "+a1.getBreed());
  
  
a1 = new Snake(4,1,"gold","cobra");
System.out.print(a1.sleep());

System.out.println(a1.eat());
System.out.println("length in meters: "+a1.getLength());
System.out.println("breed: "+a1.getBreed());


walking w1= d1;
System.out.println(w1.walk());
//jumping 
//slithering

}	
		
}





