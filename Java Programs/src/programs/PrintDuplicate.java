package programs;

import java.util.LinkedHashSet;

public class PrintDuplicate {
	
public static void main(String[] args) {
		
		
		String s = "testyantra";
		LinkedHashSet<Character> sets = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++)
		{
			//System.out.println(s.charAt(i));
			sets.add(s.charAt(i));
			//System.out.println(sets);
			
		} 
		
		System.out.println(sets);
		
		for(Character ch:sets)
		{
			int count=0;
			for (int i = 0; i < s.length(); i++) 
			{
				if (ch==s.charAt(i))
				{
				   count++;	
				}
			}
			
			if (count>1)
			{
				System.out.println(ch+" = "+count);
			}
			
			//System.out.println(ch+" - "+count);
		

		}
}
}
