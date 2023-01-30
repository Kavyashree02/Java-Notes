package programs;

public class KeyPass {
	
	public static void main(String[] args) {
		
		int  a[]={2,3,4,5,6};
		int key=2;
		
		for (int i = 0; i < key; i++)
		{
		
			int temp=a[0];   //second logic
			for (int j = 0; j< a.length-1; j++) 
			{
				//int temp=a[j];	
				a[j]=a[j+1];
				//a[j+1]=temp;
				
			}
			
			a[a.length-1]=temp; //second logic
		}
		
		for (int i = 0; i<a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}

}
