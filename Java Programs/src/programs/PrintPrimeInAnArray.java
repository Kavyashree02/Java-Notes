package programs;

public class PrintPrimeInAnArray {
	
	public static void main(String[] args) {
		
		int a[]={2,8,3,9,7,11};
		for (int i = 0; i < a.length; i++) 
		{
			int n=a[i];
			int j=2;
			while (j<=n) 
			{
				if (n%j==0)
				{
					break;
				}
				else
				{
					j++;
				}
			}
			
			if (n==j)
			{
				System.out.print(n+" ");
			}
			/*else
			{
				System.out.println(n+" "+"Its not a prime number");
			}*/
		}
	}

}
