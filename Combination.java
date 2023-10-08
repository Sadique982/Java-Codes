import java.io.*;
class Combination
{
	public static void main(String arg[])throws Exception
	{
		String x,s1="",s[]=new String[1000];
		char ch;
		String c,c1="",c2="",c3="",c4="";
		int n,i,j,f=0,p=0;;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Enter any 4 Different Digit Number");
		n=Integer.parseInt(in.readLine());
		x=Integer.toString(n);
		if(!(x.length()==4))
		{
			System.out.print("Not a 4 digit number");
			System.exit(0);
		}
		for(i='0';i<='9';i++)
		{
			f=0;
			for(j=0;j<x.length();j++)
			{
				ch=x.charAt(j);
				if(i==ch)
				{
					f++;
					s1=s1+ch;
				}
			}
			if(f>1)
			{
				System.out.println("Not a different digit Number");
				System.exit(0);
			}
		}
		c1=c1+s1.charAt(0);
		c2=c2+s1.charAt(1);
		c3=c3+s1.charAt(2);
		c4=c4+s1.charAt(3);
		if(c1.equals("0"))
		{
			c1=c2;c2=c3;c3=c4;c4="0";
		}
		for(i=1;i<=9;i++)
		{
			x=Integer.toString(i);
			if(x.equals(c1))
			{
				s[p]=c1+c2+c3+c4;
				p++;
				s[p]=c1+c2+c4+c3;
				p++;
				s[p]=c1+c3+c2+c4;
				p++;
				s[p]=c1+c3+c4+c2;
				p++;
				s[p]=c1+c4+c2+c3;
				p++;
				s[p]=c1+c4+c3+c2;
				p++;
				c=c1;
				c1=c2;c2=c3;c3=c4;c4=c;
			}
		}
		System.out.println("The Possible "+p+" Combinations of numbers are :");
		for(i=0;i<p;i++)
			System.out.print(s[i]+"\t");
	}
}