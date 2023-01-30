package programs;

import java.util.LinkedHashSet;

public class RemoveDuplicateInt {
	
	public static void main(String[] args) {
		
		int a[]={1,2,3,2};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
	
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		
		
		for (Integer num : set) {
			int count = 0;
			for (int i = 0; i < a.length; i++) 
			{
				if (num==a[i]) 
				{
					count++;
					//System.out.println(num);
				}
			}
			
			System.out.println(num);
		}	
	}

}
