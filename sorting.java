import java.io.*;
class sorting
{
	public static void main(String []arg)throws Exception
	{
		int n[]=new int[10];
		int i,s,t,p;
		DataInputStream in=new DataInputStream(System.in);
		for(i=0;i<10;i++)
		{
			System.out.println("================");
			System.out.println("ENTER ANY NUMBER");
			System.out.println("================");
			n[i]=Integer.parseInt(in.readLine());
		}
		s=n.length;
		for(p=0;p<s;p++)
		{
			for(i=0;i<(s-1)-p;i++)
			{
				if(n[i]>n[i+1])
				{
					t=n[i];
					n[i]=n[i+1];
					n[i+1]=t;
				}
			}
		}
		System.out.println("THE SORTED LIST IS-");
		for(int j=0;j<10;j++)
					System.out.println(n[j]);
	}
}