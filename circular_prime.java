import java.io.*;
class circular_prime
{
	public static void main(String arg[])throws Exception
	{
		long n,y,x,r;
		long i,m,s=1,p,ctr=0,ctr1=0;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("ENTER ANY NUMBER");
		n=Long.parseLong(in.readLine());
		n=(byte)n;
		
		System.out.println(n);/**
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10;
			ctr++;
		}
		s=s/10;
		x=m;
		y=0;
		p=0;
		while(m>0)
		{
			r=m%s;
			m=m/s;
			y=r*10+m;
			ctr1=0;
			System.out.println("FACTORS of "+y+" ARE-");
			for(i=1;i<=y;i++)
			{
				if(y%i==0)
				{
					ctr1++;
					System.out.println(i);
				}
			}
			if(ctr1==2)
				p++;
			m=y;
			if(y==x)
				break;
		}
		if(p==ctr&&p!=0)
			System.out.println("CIRCULAR PRIME");
		else
			System.out.println("NOT A CIRCULAR PRIME");*/
	}
}