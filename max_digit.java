import java.io.*;
class max_digit
{
	public static void main(String []arg)throws Exception
	{
		int n[]=new int[5];
		int i,max,m,r,max1;
		DataInputStream in=new DataInputStream(System.in);
		for(i=0;i<5;i++)
		{
			System.out.println("ENTER THE NUMBER");
			n[i]=Integer.parseInt(in.readLine());
		}
		max=n[0];
		for(i=0;i<5;i++)
		{
			if(n[i]>max)
				max=n[i];
		}
		m=0;
		max1=max;
		while(max>0)
		{
			r=max%10;
			max/=10;
			if(r>m)
				m=r;
		}
		System.out.println("THE LARGEST DIGIT OF LARGEST NUMBER "+max1+" IS : "+m);
	}
}