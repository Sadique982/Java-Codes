import java.io.*;
class magic
{
	public static void main(String arg[])throws Exception
	{
		int n,m,r,s,f=0;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("ENTER ANY NUMBER");
		n=Integer.parseInt(in.readLine());
		m=n;
		s=0;
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			s=s+r;
			if(n==0)
			{
				n=s;
				if(s==1)
				{
					f=1;
				}
				if(s<=9)
				{
					break;
				}
				s=0;
			}
		}
		if(f==1)
		System.out.println(m+" IS MAGIC NUMBER");
		else
		System.out.println(m+" IS NOT MAGIC NUMBER");
	}
}