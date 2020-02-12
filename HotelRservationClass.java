package day3;
import java.util.*;
class Room
{
	private int rNo;
	private String roomType;
	private boolean Status;
	public Room(int rNo,String roomType, boolean Status)
	{
		this.rNo=rNo;
		this.roomType=roomType;
		this.Status=Status;
	}
	public int getrNo() {
		return rNo;
	}
	public void setrNo(int rNo) {
		this.rNo = rNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public boolean getStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}

}
class Hotel implements Booking
{
	ArrayList<Room> rooms;
	private String hotelName,add;
	public Hotel(ArrayList<Room> rooms)
	{
		this.rooms=rooms;
		
	}
	
	void showAvailableRooms() 
	{
		System.out.println("the available rroms are");
		
		for(Room r :rooms)
		{ 
			
			if(r.getStatus())
			System.out.println(r.getrNo());
		}
	}
	
 public    String getHotelDetails(Hotel h) {
    	return "the hotel name is "+h.hotelName+"located at "+h.add;
    }

 public String book (Customer c1 ,int r) 
    {
    	return "the room having room number"+r+"is succesfully booked for the "+c1.getName()+"in the hotel"+this.hotelName+"\n your booking id is 123345346356";
    }


}


class Customer
{
	
	private String name,pno;

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
interface  Booking{
	
String book(Customer c1 ,int r) ;

}
public class HotelRservationClass {

	public static void main(String args[])
	{
		
		Room r1=new Room(201,"single",true);
		Room r2=new Room(202,"double",false);
		Room r3=new Room(203,"double",true);
		Room r4=new Room(204,"single",true);
		
		ArrayList<Room> room=new ArrayList<Room>();
		room.add(r1);
		room.add(r2);
		room.add(r3);
		room.add(r4);
		Hotel h1=new Hotel(room);
		Customer c1=new Customer();
		c1.setName("sahith");
		c1.setPno("5366474755");
			
		h1.showAvailableRooms();
		
		System.out.println(h1.book(c1, 203));
	}
	
}


















