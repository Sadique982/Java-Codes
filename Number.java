import java.io.*;
class Number
{
	public static void main(String args[])throws Exception
	{
		int i,a,n;
		double d;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Enter any number:-");
		n=Integer.parseInt(in.readLine());
		d=Math.sqrt(n);
		a=(int)d;
		if(a==d)
			System.out.println("Perfect Number");
		else
		{
			System.out.println("Not a Perfect Number\nThe next 10 Perfect Numbers are:-");
			for(i=1;i<=10;i++)
			{
				a++;
				System.out.println(a*a);
			}
		}
	}
}