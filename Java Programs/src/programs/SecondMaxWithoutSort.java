package programs;

public class SecondMaxWithoutSort {
	public static void main(String[] args) {
		
		int a[]={10,12,5,2,11};
		
		int fmax=0;
		int smax=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>fmax)
			{
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]>smax)
			{
				smax=a[i];
			}
		}

		System.out.println(fmax+"  "+smax);
	}
	
	
}
