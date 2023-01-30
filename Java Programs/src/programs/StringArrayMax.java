package programs;

public class StringArrayMax {
	
	public static void main(String[] args) {
		
		String str[]={"abc", "a" , "abcde" , "abcd" , "lekhu"};
		
		String max=str[0];
		for (int i = 0; i < str.length; i++) 
		{
			if(max.length()<str[i].length())
			{
				max=str[i];
			}
		}
		
		//System.out.println(max);
		
		for (int i = 0; i < str.length; i++) 
		{
		   if (max.length()==str[i].length())
		   {
			System.out.println(str[i]);
		   }	
		}
	}

}
