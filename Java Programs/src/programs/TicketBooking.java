package programs;

public class TicketBooking {
	public static void main(String[] args) {
		String str= "indigo4000";
		
		int num = Integer.parseInt(str.substring(6));
		
		if(num<5000 && num>4000)
		{
			System.out.println("Ticket is booked");
		}
		else
		{
			System.out.println("Not booked");
		}
	}

}
