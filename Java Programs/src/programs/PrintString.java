package programs;

public class PrintString {
	
public static void main(String[] args) {
	
	
	String s="Lekhana";
	System.out.println(s.length());
	
	for (int i = s.length()-1; i >=0 ; i--) 
	{
		System.out.print(s.charAt(i));
	}
	
}
}
