
package programs;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		
		String s = "home sweet home";
		String[] str = s.split(" ");
		
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		for (String word : str)
		{
			//System.out.println(word);
			set.add(word);
		}
		
		//System.out.println(set);
		
		for (String string : set) {
			System.out.print(string+" ");
		}
		
		/*for (String newone : set) {
			
			int count = 0;
			for (String oldone : str) 
			{
				if (oldone.equals(newone)) 
				{
					count++;
				}
			}
			
			System.out.println(newone+"="+count);
		}*/
	}

}
