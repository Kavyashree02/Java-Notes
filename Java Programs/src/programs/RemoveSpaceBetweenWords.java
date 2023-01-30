package programs;

public class RemoveSpaceBetweenWords {

	public static void main(String[] args) {
		
		String str = "Welcome to home";
		String[] s = str.split(" ");
		for (int i =0; i<s.length ; i++) 
		{
			System.out.print(s[i]);
		}
	}
}
