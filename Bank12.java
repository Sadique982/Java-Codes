import java.io.*;
import java.util.*;
class Banking
{
	public static void main(String arg[])throws Exception
	{
		int x;
		DataInputStream in=new DataInputStream(System.in);
		while(true)
		{
			System.out.println("1-BANK ADMINISTRATOR");
			System.out.println("2-ACCOUNT HOLDER");
			System.out.println("3-NEW ACCOUNT");
			System.out.println("4-EXIT");
			x=Integer.parseInt(in.readLine());
			switch(x)
			{
				case 1:
					
			}
		}			
	}
}