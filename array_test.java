import java.io.*;
class array_test
{
	public static void main(String []arg)throws Exception
	{
		int i,j;
		int a[][]={{1,2,3,4},{5,6,7,8},{9,1,5,0}};
		System.out.println("THE ELEMENTS IN THE 3*4 MATRICS ARE-");
		for(j=0;j<=2;j++)
		{
			for(i=0;i<=3;i++)
			System.out.print(a[j][i]+" ");
			System.out.println();
		}
	}
}