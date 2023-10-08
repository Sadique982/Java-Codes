import java.io.*;
class double_dim_bubble_sort
{
	public static void main(String args[])throws Exception
	{
		int n[][]=new int[5][5];
		int i,j,k,t;
		DataInputStream in=new DataInputStream(System.in);
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.print("ENTER ANY NUMBER : ");
				n[i][j]=Integer.parseInt(in.readLine());
			}
		}
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				for(k=0;k<4-j;k++)
				{
					if(n[i][k]>n[i][k+1])
					{
						t=n[i][k];
						n[i][k]=n[i][k+1];
						n[i][k+1]=t;
					}
				}
			}
		}
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				for(k=0;k<4-i;k++)
				{
					if(n[k][j]>n[k+1][j])
					{
						t=n[k][j];
						n[k][j]=n[k+1][j];
						n[k+1][j]=t;
					}
				}
			}
		}
		System.out.println("NEW MATRICS : ");
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.print(n[i][j]+"\t");
			}
			System.out.println();
		}
	}
}