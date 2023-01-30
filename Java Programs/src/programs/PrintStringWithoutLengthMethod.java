package programs;

public class PrintStringWithoutLengthMethod {
	
	public static void main(String[] args) {
		
		String str = "Lekhana";
		char[] ch = str.toCharArray();
		int count=0;
		for (char c : ch) {
			count++;
			//System.out.println(c);
		}
		
		String rev="";
		for (int i = count-1; i>=0; i--) {
			
			rev=rev+str.charAt(i);
			
			
			//System.out.print(str.charAt(i));
			
		}
		System.out.println(rev);
		
		
	}

}
