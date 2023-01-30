package programs;

public class SumOfArray {

	public static void main(String[] args) {
		
		int a[]={1,2,3,4};
		int b[]={1,2,3,9,6};
		int count=a.length;
		
		if (a.length<b.length) 
		{
			count=b.length;
		}
		
		for (int i = 0; i < count; i++) 
		{
			try
			{
				System.out.print(a[i]+b[i]+" ");
			}
			catch (Exception e) 
			{
				if (a.length>b.length)
				{
					System.out.println(a[i]);
				}
				else
				{
					System.out.print(b[i]);
				}
			}
			
		}
	}
}
