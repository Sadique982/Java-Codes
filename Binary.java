import java.io.*;
class Binary
{
	public static void main(String arg[])throws Exception
	{
		long n;
		int n1,i,l,r,x,p,sum;
		String s="",s1="",s2="";
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Enter any binary Number");
		n=Long.parseLong(in.readLine());
		s=Long.toString(n);
		l=s.length();
		if(l%3!=0)
		{
			while(true)
			{
				s="0"+s;
				l=s.length();
				if(l%3==0)
					break;
			}			
		}
		while(true)
		{
			p=0;sum=0;
			s1=s.substring(s.length()-3);
			x=Integer.parseInt(s1);
			while(x!=0)
			{
				r=x%10;
				x/=10;
				sum=sum+r*(int)Math.pow(2,p);
				p++;
			}
			s=s.substring(0,s.length()-3);
			s2=Integer.toString(sum)+s2;
			if(s.equals(""))
				break;
		}
		n1=Integer.parseInt(s2);
		System.out.println("The Octal value of binary number "+n+" is "+n1);
	}
}