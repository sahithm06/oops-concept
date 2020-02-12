package day3;
import java.util.*;
interface Read
{
	String read();
	
}
class Member
{
	private int memID;
	private String name,pno;
	String memberDetails()
	{
		return "the member details are"+this.memID+"\n"+this.name+" \n"+this.pno+" \n";
	}
	public int getMemID() {
		return memID;
	}
	public void setMemID(int memID) {
		this.memID = memID;
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
	
	
}
class Book
{
	private String author,title;
	private boolean available;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}	

}

class Library
{
	private String LibraryName;
	ArrayList<Book> book;
	public Library(ArrayList<Book> b)
	{
		this.book=b;
	}
	public String getLibraryName() {
		return LibraryName;
	}

	public void setLibraryName(String libraryName) {
		LibraryName = libraryName;
	}
	
	private void writeToDB()
	{
		System.out.println("record is inserted  to database");
	}
	public 	String request(Book b,Member m)
	{
		if(b.isAvailable())
		{
			b.setAvailable(false);
			writeToDB();
			return "the book named "+b.getTitle()+" ,author "+b.getAuthor()+" is issued to "+m.getName()+" with id"+m.getMemID();
		}
		
		else
		{
			return "book not availabel";
		}
	}
	public void  book(ArrayList<Book> b)
	{
		book.addAll(b);
		
	}
	public String Return(Book b)
	{
		b.setAvailable(true);
		return "added to data base and library";
	}
	
}



public class Libraryclass {

	public static void main(String args[])
	{
	ArrayList<Book> book=new ArrayList<Book>();
	Book b1=new Book();
	b1.setAuthor("sahith");
	b1.setAvailable(true);
	b1.setTitle("Wisdom");
	book.add(b1);
	b1=new Book();
	b1.setAuthor("pansu");
	b1.setAvailable(true);
	b1.setTitle("how to avoid persons");
	book.add(b1);
	b1=new Book();
	b1.setAuthor("vidya");
	b1.setAvailable(true);
	b1.setTitle("true colors");
	book.add(b1);
	
	Library l=new Library(book);
	Member m1=new Member();
	m1.setMemID(123);
	m1.setName("sahith");
	m1.setPno("9876543210");
	System.out.println("member is requesting");
	
    System.out.println(l.request(b1, m1));
    
	System.out.println(l.Return(b1));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
