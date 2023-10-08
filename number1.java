import java.awt.*;
import java.io.*;
import java.util.*;
import java.lang.*;
class number1
{
	public void prime_number(int m)
	{
		int a=0,j,c;
		System.out.println("Not a prime no. \nThe next 10 prime no are");
		while(true)
		{
			c=0;
			m=m+1;
			for(j=1;j<=m;j++)
			{
				if(m%j==0)
				c++;
			}
			if(c==2)
			{
				a++;
				System.out.println(m);
			}
			if(a==10)
			break;
		}
	}
	public static void main(String arg[])throws Exception
	{
		
		int ctr=0;
		int i,n;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("enter the number");
		n=Integer.parseInt(in.readLine());
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			ctr++;
		}
		number1 obj=new number1();
		if(ctr==2)
		System.out.println("it is a prime no");
		if(ctr>0&&ctr!=2)
		obj.prime_number(n);
	}
}