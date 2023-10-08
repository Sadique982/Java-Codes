import java.io.*;
class Revision
{
	public static void main(String arg[])throws Exception
	{
		int i,n;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("ENTER ANY NUMBER");
		n=Integer.parseInt(in.readLine());
		while(true)
		{
			System.out.println("ENTER YOUR CHOICE FOR CHECKING THE NUMBER AS-");
			
			System.out.println("\t01-PRIME NUMBER");
			System.out.println("\t02-EVEN OR ODD NUMBER");
			System.out.println("\t03-BUZZ NUMBER");
			System.out.println("\t04-PERFECT NUMBER");
			System.out.println("\t05-PALLINDROME NUMBER");
			System.out.println("\t06-ARMSTRONG NUMBER");
			System.out.println("\t07-DUCK NUMBER");
			System.out.println("\t08-ATOMORPHIC NUMBER");
			System.out.println("\t09-NEON NUMBER");
			System.out.println("\t10-NIVEN NUMBER");
			System.out.println("\t\tCOVERTING\n\t\t----------\n\t11-BINARY TO DECIMAL");
			System.out.println("\t12-DECIMAL TO BINARY");
			break;
		}
	}
}