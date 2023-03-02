
package programs;

public class SumOfNumber {
	
public static void main(String[] args) {
		
		
		int[] a= {9,1,7,2,8};
		
	 
		for (int i = 0; i < a.length; i++) 
		{
			
			for (int j = i+1; j < a.length; j++)
			{
				if (a[i]>a[j])
				{
					int temp = a[i];
					a[i]=a[j];
			        a[j]=temp;
				}
			 
			}
			
		}
		
//		for (int k = 0; k < a.length; k++) 
//		{
//		  System.out.println(a[k]);	
//		  
//		}
		
//		System.out.println(" ");
		
		int sum=0;
		for (int i = a.length-1; i>a.length-4; i--) 
		{
		  sum=sum+a[i];	
		}
		
		System.out.println(sum);
				
}

}
