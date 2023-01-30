package programs;

public class NamePattern {
	public static void main(String[] args) {
		
		for (int i = 1; i < 15; i++)
		{
			for (int j = 1; j < 15; j++)   //(i<=3 && j==1  ) || (i==3 && j<=3)
			{
				if (((i<4) && (j==1 || j==5 || j==6 || j==9 || j==13 || j==15)) || ((i==3) && (j==2 || j==3 || j==7 || j==11 || j==14)) ||
					((i==2) && (j==10)) || ((i==1) && (j==7 || j==11)))
				{
					System.out.print("* ");
				}
			}
			
			System.out.println(" ");
		}
	}

}
