package programs;

public class String1 {

	public static void main(String[] args) {

		String s = "my name is kavya";
		
		String[] k = s.split(" ");
		
		for (int i = 0; i < k.length; i++) {
		k[i]=k[i].substring(0, 1).toUpperCase()+k[i].substring(1, k[i].length());
			System.out.print(k[i]+" ");
		}
		System.out.println();
		
				for (int i = k.length-1; i >=0; i--) {
					System.out.print(k[i]+" ");
					
				}
				System.out.println();
		
	}

}
