package programs;

import java.util.LinkedHashSet;

public class NumberOfVowels {

	public static void main(String[] args) {
		
		
		String s = "kavyashree";
		char[] s1 = s.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		
		
		for (Character ch : set) 
		{
			int count = 0;
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
			{
				
				for (int i = 0; i < s1.length; i++) 
				{
					if(ch==s1[i])
					{
						count++;
					}
					
				}
				System.out.println(ch+"="+count+" ");
			}
		}
		
		//System.out.println("="+count);
	}
}
