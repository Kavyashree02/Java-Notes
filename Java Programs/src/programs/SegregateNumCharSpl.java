package programs;

public class SegregateNumCharSpl {

	public static void main(String[] args) {


		String s = "ab11Rf*&q56";
		String alp="";
		String num="";
		String spl="";

		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				alp=alp+s.charAt(i);
			}	
			else if (s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
			}
			else
			{
				spl=spl+s.charAt(i);
			}
		}
		System.out.println(alp+" "+num+" "+spl);
	}
	
	

}


