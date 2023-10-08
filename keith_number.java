import java.io.*;
class keith
{
	public static void main(String[] args)throws Exception
	{
		int n,m,r1,r2,r3,ctr=0,s=0,p=0;
		DataInputStream in=new DataInputStream(System.in);
		System.out.print("ENTER THE THREE DIGIT NUMBER : ");
		n=Integer.parseInt(in.readLine());
		m=n;
		while(m!=0)
		{
			m/=10;
			ctr++;
		}
		if(ctr!=3)
		{
			System.out.println("NOT A THREE DIGIT NUMBER");
			System.exit(0);
		}
		else
		{
			m=n;
			r3=m%10;
			m/=10;
			r2=m%10;
			m/=10;
			r1=m%10;
			while(true)
			{
				s=r1+r2+r3;
				
				r1=r2;
				r2=r3;
				r3=s;
		//		System.out.print(s+"\t");
				if(s==n)
				{
					
					p=1;
					break;
				}
			/*	if(s>n)
				{
					p=0;
					break;
				}*/
			}
			if(p==1)
				System.out.println(n+" IS A KEITH NUMBER");
			else
				System.out.println(n+" IS NOT A KEITH NUMBER");
		}
	}
}