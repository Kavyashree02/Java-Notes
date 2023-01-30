package programs;

public class MaxWithoutSort {
	
	public static void main(String[] args) {
		
		int[] a = {9,1,5,10,2};
		int max=a[0];
		for (int i = 1; i < a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		
		System.out.println(max);
	}

}
