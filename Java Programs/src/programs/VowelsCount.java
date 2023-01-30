package programs;

import java.util.LinkedHashSet;

public class VowelsCount {
	
	public static void main(String[] args) {
		
    String s = "manjunath";
	char[] s1 = s.toCharArray();
	LinkedHashSet<Character> set = new LinkedHashSet<>();
	for (int i = 0; i < s.length(); i++)
	{
		set.add(s.charAt(i));
	}
	
	int count = 0;
	
	for (Character ch : set) 
	{
		
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
		{
			count++;
				
		}
			System.out.println(ch);
		}
	
	System.out.println(count);
	}

}

