import java.io.*;
class primebycalling
{
	int x,y;
	primebycalling(int a,int b)
	{
		x=a;
		y=b;
	}
	int prime(int z)
	{
		int i,c=0;
		for(i=1;i<=z;i++)
			{
				if(z%i==0)
				c++;
			}
		if(c==2)
		return 1;
		else
		return 0;
	}
	int display()
	{
		int count=0;
		for(int j=(x+1);j<y;j++)
		{
			int k=prime(j);
			if(k==1)
			{
				count++;
				System.out.println(j);
			}
		}
		return count;
	}
	public static void main(String arg[])throws Exception
	{
	int a1,b1,z1,c1;
	InputStreamReader read=new InputStreamReader(System.in);
	BufferedReader in=new BufferedReader(read);
	System.out.println("enter any 2 numbers");
	a1=Integer.parseInt(in.readLine());
	b1=Integer.parseInt(in.readLine());
	primebycalling obj=new primebycalling(a1,b1);
	System.out.println("PRIME NUMBER BETWEEN "+a1+" AND "+b1+" ARE:-");
	c1=obj.display();
	System.out.println("TOTAL PRIME NUMBER BETWEEN "+a1+" and "+b1+" is "+c1);
	}
}