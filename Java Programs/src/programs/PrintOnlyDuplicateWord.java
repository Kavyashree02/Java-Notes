package programs;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicateWord {
	
	public static void main(String[] args) {
		
		String s = "home sweet home home";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for (String word : str) 
		{
		  set.add(word)	;
		}
		
		for (String newone : set)
		{
			int count = 0;
			for (String oldone : str)
			{
				if (oldone.equals(newone))
				{
					count++;
				}
				
			}
			
			if (count>1)
			{
				System.out.println(newone+" "+count);
			}
		}
	}

}
