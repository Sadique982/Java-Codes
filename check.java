import java.io.*;
class check
{
	public static void main(String arg[])throws Exception
	{
		
		int ctr=0,a=0,j,c,i,n,m;
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		System.out.println("enter the number");
		n=Integer.parseInt(in.readLine());
		m=n;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			ctr++;
		}
		if(ctr==2)
		System.out.println("it is a prime no");
		if(ctr>0&&ctr!=2)
		{
			System.out.println("Not a prime no.\n\"The next 10 prime no are\"");
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
	}
}