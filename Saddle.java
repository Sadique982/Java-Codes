import java.io.*;
class Saddle
{
	public static void main(String[] args)throws Exception
	{

		int a[][]={{4,6,12},{2,8,14},{1,3,6}};
		int n=3,i,j,p=0,w=0,ctr=0,x,a1;
		DataInputStream in=new DataInputStream(System.in);
/*		System.out.println("Enter Size of Array :");
		n=Integer.parseInt(in.readLine());
		a= new int[n][n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("Enter any Number :");
				a[i][j]=Integer.parseInt(in.readLine());
			}
		}
*/
		for(i=0;i<n;i++)
		{
			x=a[i][0];
			w=a[i][0];
			for(j=0;j<n;j++)
			{
				if(a[i][j]<=x)
				{
					x=a[i][j];p=j;
				}
			}
			for(j=0;j<n;j++)
			{
				if(a[j][p]>=w)
					w=a[j][p];
			}
			if(x==w)
			{		
				ctr=1;
				break;
			}
		}
		System.out.println("The  Matrix is:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+ "\t");
            }
            System.out.println();
        }
		if(ctr==0)
			System.out.println("No Saddle point");
		else
		{
			x=a[0][0];
			for(i=0;i<n;i++)
			{
				for(j=0;j<n-1;j++)
				{
					if(x<a[j][j])
					{
						p=a[j][j];
						a[j][j]=x;
						a[j+1][j+1]=p;
					}
					else if(x> a[j][j])
						x=a[j+1][j+1];
					else
						x=a[j+1][j+1];
				}
			}
			System.out.println("Saddle point"+w);
			System.out.println("The Saddle Matrix is:");
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(a[i][j]+ "\t");
				}
				System.out.println();
			}
		}
	}
}