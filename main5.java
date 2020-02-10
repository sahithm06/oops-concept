package com.practice;
interface WashAndDry
{
	String wash();
	String dry();
	
	
}
abstract class shoe
{
	 private int size;
	private String color,materialtype;
	public shoe(int s,String c,String mt)
	{
		setSize(s);
		setColor(c);
		setMaterialtype(mt);
	}

	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterialtype() {
		return materialtype;
	}
	public void setMaterialtype(String materialtype) {
		this.materialtype = materialtype;
	}

  abstract String design();
  abstract String wear();
  abstract String remove();

}
class Loafers extends shoe 
{

	public Loafers(int s, String c, String mt) {
		super(s, c, mt);
		// TODO Auto-generated constructor stub
	}

	@Override
	String design() {
		// TODO Auto-generated method stub
		return "designing the loafers";
	}

	@Override
	String wear() {
		// TODO Auto-generated method stub
		return "wearing the loafers";
	}

	@Override
	String remove() {
		// TODO Auto-generated method stub
		return "removing the loafers";
	}
	

	
}


class Boots extends shoe implements WashAndDry
{

	public Boots(int s, String c, String mt) {
		super(s, c, mt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String wash() {
		// TODO Auto-generated method stub
		return "washing the boots";
	}

	@Override
	public String dry() {
		// TODO Auto-generated method stub
		return "drying the boots";
	}

	@Override
	String design() {
		// TODO Auto-generated method stub
		return "designing the boots";
	}

	@Override
	String wear() {
		// TODO Auto-generated method stub
		return "wearing the boots";
	}

	@Override
	String remove() {
		// TODO Auto-generated method stub
		return "removing the boots";
	}
	
}


public class main5 {

	public static void main(String args[]) {
	shoe s1= new Loafers(10,"blue","rough cotton");
	
	System.out.println(s1.wear());
	System.out.println(s1.remove());
	
	System.out.println(s1.design());
	
	s1=new Boots(12,"dark red","shining polyster");
	System.out.println(s1.wear());
	System.out.println(s1.remove());
	System.out.println(s1.design());
	WashAndDry wd=(Boots)s1;
	System.out.println(wd.wash());
	System.out.println(wd.dry());
	//System.out.println();
	
	
	}	
	
	
	
	
	
	
}
