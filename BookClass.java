package day4;
interface Reviews
{
	String seeReviews();
}
interface Audio 
{
	String listenSample();
	
}
interface Hard
{
	String searchSecondHand();
}
class Book
{
	private int cost;
	private String title,author;
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
class AudioBook extends Book implements Reviews,Audio
{
	
	//inheritance and abstraction
	@Override
	public String listenSample() {
		// TODO Auto-generated method stub
		return "listening audio sample of the book";
	}

	@Override
	public String seeReviews() {
		// TODO Auto-generated method stub
		return "seeing the reviews of the audio book";
	}
	
}


class HardBook extends Book implements Reviews,Hard
{
// inhertance and abstraction
	@Override
	public String searchSecondHand() {
		// TODO Auto-generated method stub
		return "searching for the second hand book";
	}

	@Override
	public String seeReviews() {
		// TODO Auto-generated method stub
		return "reviewing the hard book";
	}
	
}





public class BookClass {
	
	public static void main(String args[])
	{
		Book b1= new HardBook(); 
		b1.setAuthor("vidya");
		b1.setCost(10000);
		b1.setTitle("true colors");    // polymorphism
		Book b2 =new AudioBook();
		b2.setAuthor("haseeb");
		b2.setCost(10000);
		b2.setTitle(" 'How to become a topper'- by hasseb chouhan" );
		Audio a=(AudioBook)b2;
		Hard h =  (HardBook)b1;
		System.out.println(b1.getAuthor());
		System.out.println(b1.getCost());
		System.out.println(b1.getTitle());
		System.out.println(b2.getAuthor());
		System.out.println(b2.getCost());
		System.out.println(b2.getTitle());
		System.out.println(a.listenSample());
System.out.println(h.searchSecondHand());

	
	
		
		
		
	}
	
	
	
	

}
