import java.io.*;
class No
{
	public static void main(String arg[])throws Exception
	{
		int n[]= new int[10];
		int p,i,ctr;
		DataInputStream in=new DataInputStream(System.in);
		for(i=0;i<10;i++)
		{
			System.out.println("Enter any Number");
			n[i]=Integer.parseInt(in.readLine());
		}
		for(p=0;p<10;p++)
		{
			for(i=0;i<(10-1)-p;i++)
			{
				if(n[i]>n[i+1])
				{
					int t=n[i];
					n[i]=n[i+1];
					n[i+1]=t;
				}
			}
		}
		for(i=0;i<10;i++)
		{
			ctr=0;
			for(p=i;p<10;p++)
			{
				if(n[p]==n[i])
					ctr++;
			}
			System.out.println("Frequency of "+n[i]+"=="+ctr);
			i=i+ctr-1;
		}
	}
}