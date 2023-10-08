import java.io.*;
class classname
{
	public static void main(String arg [])throws Exception
	{
		int n,m,i,s=0,a,ch,r=0;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("1 for palindrome number");
		System.out.println("2 for perfect number");
		System.out.println("enter your choice" );
		ch=Integer.parseInt(in.readLine());
		switch(ch)
		{
			case 1:
				System.out.println("enter any number");
				n=Integer.parseInt(in.readLine());
				m=n;
				while(n>0)
				{
					a=n%10;
					n=n/10;
					r=r*10+a;
				} 
				if(r==m)
					System.out.println("palindorme" );
				else
					System.out.println("not palindrome");
				break;
			case 2:
				System.out.println("enter any number");
				n=Integer.parseInt(in.readLine()); 
				for(i=1;i<n;i++)
				{
					if(n%i==0)
						s=s+i;
				}
				if(s==n)
					System.out.println("perfect number");
				else
					System.out.println("not perfect number");
				break;
			default:
				System.out.println("wrong choice");
		}
	}
}
