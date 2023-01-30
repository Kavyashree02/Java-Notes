package programs;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int fib1 =0;
		int fib2=1;
		int fib3=0;
		System.out.println("Enter the number of fibnocci Numbers to generate");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		System.out.println(fib1);
		System.out.println(fib2);
		for (int i = 0; i < n; i++) 
		{
			fib3=fib1+fib2;
			if(fib3<n)
			{
				System.out.println(fib3);
			}
			else
			{
				break;
			}
			fib1=fib2;
			fib2=fib3;
		}
		
		
		
		
//	INCLUDE 0,1 IT IS PRINTING 25+2 NUMBERS
		/*System.out.println(fib1);
		System.out.println(fib2);
		for (int i = 0; i < n; i++) 
		{
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.println(fib3);
		}

		//	INCLUDE 0,1 IT IS PRINTING 25 NUMBERS
		/*for (int i = 3; i <=n ; i++) {
			
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			
			System.out.println(fib3); 	
		}*/
			
		}

}
