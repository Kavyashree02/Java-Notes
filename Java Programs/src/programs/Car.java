package programs;

public class Car {

	public static void main(String[] args) {

		String s = "carbusvehiclebusautocarcar";
		int count = 0;
		if(s.substring(0, 3).equalsIgnoreCase("car"))
		{
			count++;
		}
//		for(int i = 0; i<s.length();i++) {
//			
//		if((s.charAt(i)=='c')&& (s.charAt(i+1)=='a') && (s.charAt(i+2)=='r')) {
//			count ++;
//		}
//			
//		}
		System.out.println(count);
	}

}
