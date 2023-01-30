package programs;

public class PrintSumInAString {
	
	public static void main(String[] args) {
		String s = "a11b12c13";
		//String s="1abg4k8";
		String num="";
		int sum=0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			if (Character.isDigit(s.charAt(i)))
			{
			    num=num+s.charAt(i);
			    
				//System.out.println(num);
			}
		}
		
		int no=Integer.parseInt(num);
		System.out.println(no);
		while(no!=0)
		{
			int rem=no%100;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println(sum);
		
		/*int sum=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i)>='0' && s.charAt(i)<='9') 
			{
				int n=s.charAt(i)-48;
				sum=sum+n;
			}
		}
		
		System.out.println(sum); */
	}

}
