package programs;

import java.util.LinkedHashSet;

public class RemoveDuplicateInt {
	
	public static void main(String[] args) {
		
		int s[]={1,2,3,2};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
	
		for (int i = 0; i < s.length; i++) {
		
			set.add(s[i]);
		}
		System.out.println(set);
		
		
		for (Integer num : set) {
			int count = 0;
			for (int i = 0; i < s.length; i++) 
			{
				if (num==s[i]) 
				{
					count++;
					//System.out.println(num);
				}
			}
			
			System.out.println(num+"-"+count);
		}	
	}

}
