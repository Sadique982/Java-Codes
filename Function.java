import java.io.*;
class Function
{
	public int[] series(int x)
	{
		int n[]=new int[1000000],p=0;
		int a,b,c,i,j,ctr;
		a=0;b=1;
		for(i=3;i<=x;i++)
		{
			ctr=0;
			c=a+b;
			a=b;b=c;
			for(j=1;j<=c;j++)
			{
				if(c%j==0)
					ctr++;
			}
			if(ctr==2)
			{
				n[p]=c;
				p++;
			}
		}
		return (n);
	}
	public static void main(String args[])throws Exception
	{
		int n[];
		int a;
		DataInputStream in=new DataInputStream(System.in);
		Function obj=new Function();
		System.out.println("ENTER ANY NUMBER:-");
		a=Integer.parseInt(in.readLine());
		n=obj.series(a);
		System.out.println("THE SERIES IS:-");
		for(int i=0;i<n.length;i++)
		{
			if(n[i]!=0)
				System.out.println(n[i]);
		}
	}
}