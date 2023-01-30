package programs;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int no=3;
		boolean flag = true;
		if (no<=1)
		{
			flag=false;
		}
		for (int i = 2; i < no; i++) 
		{
			if (no%i==0)
			{
				flag=false;
				break;
			}
		}
		
		if (flag == true) 
		{
			System.out.println("Prime number");
		}
		
		else
		{
			System.out.println("Not a prime number");
		}
	}

}
