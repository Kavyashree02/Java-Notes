package programs;

public class SumOfValuesInArray {
	public static void main(String[] args) {
		int[] intArray = {10,20,40,50,60};
		int sum=0;
		
		for(int num:intArray)
		{
			sum= sum+num;
		}
		System.out.println(sum);
		
	}

}
