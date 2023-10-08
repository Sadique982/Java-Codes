import java.io.*;
class string
{
	public static void main(String arg[])throws Exception
	{
		String 	s;
		char ch;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("ENTER ANY STRING");
		s=in.readLine();
		System.out.println("ASCII CODE OF EACH CHARACTER IN IT-");
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			System.out.println(ch+"-"+(int)ch);
		}
	}
}