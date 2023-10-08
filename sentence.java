import java.io.*;
class Sentence
{
	String s;
	public Sentence(String a)
	{
		s=a+" ";
	}
	public void encode()
	{
		char ch;
		String s1="",s2="";
		int i,j;
		s=s.toUpperCase();
		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch!=' ')
				s1=s1+ch;
			else
			{
				for(j=0;j<s1.length();j++)
				{
					ch=s1.charAt(j);
					ch+=3;
					if(ch>90)
						ch-=26;
					s2=s2+ch;
				}
				System.out.println(s2+" ");
				s1=s2="";
			}
		}
	}
	public static void main(String arg[])throws Exception
	{
		DataInputStream in=new DataInputStream(System.in);
		String a;
		System.out.println("Enter any sentence");	
		a=in.readLine();
		Sentence obj=new Sentence(a);
		obj.encode();
	}
}