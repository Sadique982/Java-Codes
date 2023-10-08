import java.io.*;
class string_array
{
	int i,f;
	String s[]=new String[20];
	String c[]=new String[20];
	String s1;
	public void input()throws Exception
	{
		DataInputStream in=new DataInputStream(System.in);
		for(i=0;i<20;i++)
		{
			System.out.println("ENTER THE NAME OF STATE");
			s[i]=in.readLine();
			System.out.println("ENTER THE OF CAPITAL OF "+s[i]);
			c[i]=in.readLine();
		}
	}
	public void search()throws Exception
	{
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("ENTER THE NAME OF STATE WHOSE CAPITAL IS TO BE PRINTED");
		s1=in.readLine();
		for(i=0;i<20;i++)
			{
				if(s[i].equalsIgnoreCase(s1))
				{
					System.out.println("CAPITAL OF "+s+" IS "+c[i]);
					f=1;
					break;
				}
			}
			if(f!=1)
				System.out.println("THE STATE IS NOT PRESENT IN THE LIST");
		}
	public static void main(String []arg)throws Exception
	{
		string_array in=new string_array();
		in.input();
		in.search();
	}
}