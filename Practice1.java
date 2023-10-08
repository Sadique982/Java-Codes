import java.io.*;
class Practice1
{
	public static void main(String arg[])throws Exception
	{
		String s;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Enter any String");
		s=in.readLine();
		System.out.println("THE ANSWER TO MY QUESTION IS "+s.substring(0,0));
	}
}