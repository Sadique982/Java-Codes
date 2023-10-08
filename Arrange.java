import java.io.*;
class Arrange
{
	public static void main(String[] args)throws Exception
	{

		int n[];
		int m,i,j,t,odd,p,x;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Enter Size of Array :");
		m=Integer.parseInt(in.readLine());
		n= new int[m];
		for(i=0;i<m;i++)
		{
			System.out.print("Enter any Number :");
			n[i]=Integer.parseInt(in.readLine());
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<(m-1)-i;j++)
			{
				if(n[j]>n[j+1])
				{
					 t=n[j];
					n[j]=n[j+1];
					n[j+1]=t;
				}
			}
		}
		if(m%2==0)
			odd=m-1;
		else
			odd=m-2;
		p=m-1;
		while(odd>0)
		{
			t=n[odd];
			x=odd;
			while(x!=p)
			{
				n[x]=n[x+1];
				x++;
			}
			n[x]=t;
			odd-=2;
			p--;
		}
		p=(m-1)/2;
		for(i=0;i<p;i++)
		{
			t=n[i];
			n[i]=n[p];
			n[p]=t;
			p--;
		}
		System.out.println("THE FINAL ARRAY-");
		for(i=0;i<m;i++)
					System.out.print(n[i]+"\t");
	}  	
}