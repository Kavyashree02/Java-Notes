package programs;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String s = "malayalam";
		String rev = "";
		for (int i = s.length()-1; i >=0 ; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		if (rev.equals(s)) {
			
			System.out.println(s+" ---> "+"Palindrome");
			
		}
		else
		{
			System.out.println(s+" ---> "+"Its not a palindrome");
		}
	}

}
