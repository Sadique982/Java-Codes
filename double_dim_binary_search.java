import java.io.*;
class double_dim_binary_search
{
	public static void main(String args[])throws Exception
	{
		int n[][]=new int[5][5];
		int i,j,k,x,l,h,m,f=0,t;
		DataInputStream in=new DataInputStream(System.in);
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.print("ENTER ANY NUMBER : ");
				n[i][j]=Integer.parseInt(in.readLine());
			}
		}
		//SORTING
		//COLOUMN SORT
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
		//ROWS SORT
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
		/*System.out.println("DISPLAYING SORTED ARRAY");
		
		
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
				System.out.print(n[i][j]+"\t");
			System.out.println();
		}
		Thread.sleep(3000);*/
		System.out.print("ENTER THE NUMBER TO BE SEARCHED : ");
		x=Integer.parseInt(in.readLine());
		for(i=0;i<5;i++)
		{
			l=0;
			h=4;
			while(l<=h)
			{
				m=(l+h)/2;
				System.out.println(n[i][m]);
				if(x==n[i][m])
				{
					f=1;
					break;
				}
				else if(x<n[i][m])
					h=m-1;
				else
					l=m+1;
			}
			if(f==1)
				break;
		}
		if(f==1)
			System.out.println("THE NUMBER IS PRESENT IN THE ARRAY");
		else
			System.out.println("THE NUMBER IS NOT PRESENT IN THE ARRAY");
		
	}
}