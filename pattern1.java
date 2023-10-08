import java.io.*;
class pattern
{
	public static void main(String arg[])
	{
		int i,j,n=1;
		System.out.println("THE PATTERN IS:-");
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
			n++;
		}
	}
}