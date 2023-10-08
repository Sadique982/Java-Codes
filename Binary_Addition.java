import java.io.*;
class Binary_Addition
{
	public String Bin(int t,int t1,int c)
	{
		int r,r1,s;
		String k="";
		if(t==0)
			return(c+k);
		else
		{
			r=t%10;
			t/=10;
			r1=t1%10;
			t1/=10;
			s=r+r1+c;
			if(s==0)
			{
				c=0;
				k="0"+k;
			}
			if(s==1)
			{
				c=0;
				k="1"+k;
			}
			if(s==2)
			{
				c=1;
				k="0"+k;
			}
			if(s==3)
			{
				c=1;
				k="1"+k;
			}
			return(Bin(t,t1,c)+k);
		}
	}
	public static void main(String[]arg)throws Exception
	{
		int n,m,t,t1;
		String x;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("ENTER TWO BINARY NUMBER\'S");
		n=Integer.parseInt(in.readLine());
		m=Integer.parseInt(in.readLine());
		if(n<m)
		{
			t=n;
			n=m;
			m=t;
		}
		t=n;
		t1=m;
		Binary_Addition obj=new Binary_Addition();
		x=obj.Bin(t,t1,0);
		if(x.charAt(0)=='0')
			x=x.substring(1);
		System.out.println("THE SUM OF "+n+" AND "+m+" IS :"+x);
	}
}