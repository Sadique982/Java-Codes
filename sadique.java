import java.io.*;
class sort
{
	public static void main(String[] args)throws Exception
	{
		int n[][]=new int[4][4];
		int a[]=new int[16];
		int i,j,k=0,p;
		DataInputStream in=new DataInputStream(System.in);
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.println("Enter the Number");
				n[i][j]=Integer.parseInt(in.readLine());
				a[k]=n[i][j];
				k++;
			}
		}
		for(i=0;i<16;i++)
		{
			for(j=0;j<15-i;j++)
			{
				if(a[j]>a[j+1])
				{
					p=a[j];
					a[j]=a[j+1];
					a[j+1]=p;
				}
			}
		}
		k=0;
		System.out.println("NEW MATRICS-");
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				n[i][j]=a[k];
				k++;
				System.out.print(n[i][j]+"\t");
			}
			System.out.println();
		}
	}
}