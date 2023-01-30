package programs;

public class LamdaImplementation {
	public static void main(String[] args) {
		
		Lamda lm = ()->{
			
			System.out.println("Implementation");
		}; 
		
		lm.m1(); 
		
		Lamda lam = new Lamda() {
			
			@Override
			public void m1() {
				
				System.out.println("Implementation");
			}
		};
		
		lam.m1();
	}
	

}
