import java.io.*;
class pryamid
{
	public static void main(String arg[])
	{
		int n=5,m=1,i,j,k,l;
		System.out.println("The pattern is:-");
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=m;k++)
			{
				System.out.print("*");
			}
			m+=2;
			n--;
			System.out.println();
		}
	}
}