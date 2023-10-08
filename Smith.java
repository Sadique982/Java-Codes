import java.io.*;
class Smith
{
	public static void main(String arg[])throws Exception
	{
		int n,a,r,s1=0,i,f=0,j,x,s2=0;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Enter Any Number");
		n=Integer.parseInt(in.readLine());
		a=n;
		while(a!=0)
		{
			r=a%10;
			a=a/10;
			s1=s1+r;
		}
		a=n;
		for(i=2;i<=a;i++)
		{
			f=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
					f++;
			}
			if(f==2)
			{
				if(a%i==0)
				{
					a=a/i;
					r=i;
					while(r!=0)
					{
						x=r%10;
						r=r/10;
						s2=s2+x;
					}
					i--;
				}
			}
		}
		if(s1==s2)
			System.out.println("Smith Number");
		else
			System.out.println("Not a Smith Number");
	}
}