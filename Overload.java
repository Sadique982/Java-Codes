import java.io.*;
class Overload
{
	void Display(int num)
	{
		double d=Math.sqrt(num);
		if(num==(d*d))
			System.out.println("Perfect");
		else
			System.out.println("Not");
	}
	void Display(String str, char ch)
	{str=str.toUpperCase();
		ch=Character.toUpperCase(ch);
		int a=0;
		for(int i=0;i<str.length();i++)
		{
			char chr =str.charAt(i);
			if(chr==ch)
			{a=1;
				System.out.println("Present");break;}
		}
		if(a==0)
			System.out.println("Not Present");
	}
	void Display(String str)
	{
		str=str.toUpperCase();
		int i,ctr=0;
		for(i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(!(ch>=65 && ch<=90)&&!(ch>='0'&&ch<='9'))
				ctr++;
		}
		System.out.println("No. of special characters"+ctr);
	}
	public static void main(String args[])throws Exception
	{
		DataInputStream in=new DataInputStream(System.in);
		Overload obj=new Overload();
		String s,s1;
		char ch;
		int n;
		System.out.println("Enter the no. to check wheather it is perfect or not");
		n=Integer.parseInt(in.readLine());
		obj.Display(n);
		System.out.println("Enter any string and character to check wheather it is present in the string or not and check no. of special characters in it");
		s=in.readLine();
		ch=(char)in.read();
		obj.Display(s,ch);
		obj.Display(s);
	}
}