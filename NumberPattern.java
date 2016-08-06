
public class NumberPattern {

	public static void main(String[] args)
	{
		int i=9,j;
		for(i=1; i<10; i++)
		{	
			if (i<=5)
			{
				for(j=1;j<=i;j++)
					System.out.print(j);
			}
			else
			{
				for(j=i+1;j>i && j<=10;j++)
					System.out.print(j-i);
			}
			System.out.println();
			
		}
	}
}
