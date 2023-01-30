package programs;

public class MinWithoutSort {
public static void main(String[] args) {
		
		int a[] = {9,1,5,10,2};
		int min=a[0];
		for (int i = 1; i < a.length; i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		
		System.out.println(min);
	}

}
