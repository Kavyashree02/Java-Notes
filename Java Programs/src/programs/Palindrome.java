package programs;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String s = "lekhana";
		String rev = "";
		for (int i = s.length()-1; i >=0 ; i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if (rev.equals(s)) {
			
			System.out.println(s+" ---> "+"Palindrome");
			
		}
		else
		{
			System.out.println(s+" ---> "+"Its not a palindrome");
		}
	}

}
