import java.io.*;
class Series_sum
{
	public static void main(String arg[])throws Exception
	{
		int a,n,i,j,c=2,f=1,p;
		double s=1,m;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Enter the value of A and N");
		a=Integer.parseInt(in.readLine());
		n=Integer.parseInt(in.readLine());
		for(i=10;i>=n;i-=2)
		{
			m=Math.pow(a,i);
			for(j=1;j<=c;j++)
				f=f*j;
			s+=m/f;c+=2;
		}
		System.out.println("Sum is-	"+s);
	}
}