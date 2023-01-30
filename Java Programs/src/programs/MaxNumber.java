package programs;

public class MaxNumber {
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
		
		System.out.println(a[a.length-1]);
}

}
