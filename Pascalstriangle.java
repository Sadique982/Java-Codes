import java.io.*;
class pascals
{
	public static void main(String arg[])
	{
		int n=4,m=1,i,j,k,l;
		System.out.println("The pattern is:-");
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=m;k++)
			{
				System.out.print(k+" ");
			}
			m++;
			n--;
			System.out.println();
		}
	}
}