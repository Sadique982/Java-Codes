import java.io.*;
class happy_word
{
	public static void main(String args[])throws Exception
	{
		String s2,s1="";
		int i,m,n=0,r,s=0;
		char ch;
		DataInputStream in=new DataInputStream(System.in);
		System.out.print("ENTER ANY WORD : ");
		s2=in.readLine();
		s2=s2.toUpperCase();
		for(i=0;i<s2.length();i++)
		{
			ch=s2.charAt(i);
			if(ch>=65&&ch<=90)
				s1=s1+((int)ch-64);
		}
		n=Integer.parseInt(s1);
		m=n;
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			s=s+r*r;
			if(n==0)
			{
				n=s;
				if(s<10)
					break;
				s=0;
			}
		}
		n=m;
		if(s==1)
			System.out.print(n+" is a \'HAPPY WORD\'");
		else
			System.out.print(n+" is not a \'HAPPY WORD\'");
	}
}
/**eg.- VAT :22120=2^2+2^2+1^2+2^2+0^2=13
1^2+3^2=10
1^2+0^2=1
	HAPPY WORD*/