package programs;

public class SecondMinWithoutSort {
public static void main(String[] args) {
		
		int a[]={1,7,5,3,2};
		
		int fmin=Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<fmin)
			{
				smin=fmin;
				fmin=a[i];
			}
			else if(smin>a[i])
			{
				smin=a[i];
			}
		}

		System.out.println(fmin+"  "+smin);
	}
}
