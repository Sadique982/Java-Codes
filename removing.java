import java.io.*;
class removing
{
	public static void main(String []args)throws Exception
	{
		int n[]=new int[30];
		int i,j,s,p,c;
		DataInputStream in=new DataInputStream(System.in);
		for(i=0;i<10;i++)
		{
			System.out.println("ENTER ANY NUMBER");
			n[i]=Integer.parseInt(in.readLine());
		}
		s=10;
		for(i=0;i<s;i++)
		{
			c=0;
			for(int k=i;k<s;k++)
			{
				if(n[k]==n[i])
					c++;
			}
			for(j=i;j<s;j++)
			{
				if(c>1)
				{
					for(p=j;p<s-1;p++)
					{
						n[p]=n[p+1];
					}
					s--;
					j--;
				}
			}
		}
		System.out.println("THE LIST AFTER REMOVING DUPLICATE NUMBER PRESENT IN LIST-");
		for(i=0;i<s;i++)
		{
			System.out.println(n[i]);
		}
	}
}