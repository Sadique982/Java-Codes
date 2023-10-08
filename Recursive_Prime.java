import java.io.*;
class Recursive_Prime
{
	public int prime(int a,int b)
	{
		if(b<=a)
		{
			if(a%b==0)
				return(1+prime(a,b+1));
			else
				return(0+prime(a,b+1));
		}
		else
			return(0);
	}
	public static void main(String arg[])throws Exception
	{
		int n,f;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Enter any Number");
		n=Integer.parseInt(in.readLine());
		Recursive_Prime obj=new Recursive_Prime();
		f=obj.prime(n,1);
		if(f==2)
			System.out.println("Number is Prime");
		else
			System.out.println("Number is Not Prime");
	}
}