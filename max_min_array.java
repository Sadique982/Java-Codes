import java.io.*;
class array
{
	public static void main(String []arg)throws Exception
	{
		int a,n[]=new int[10],max,min;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("ENTER ANY 10 NUMBERS");
		for(a=0;a<10;a++)
		{
			System.out.print((a+1)+" NUMBER IS-");
			n[a]=Integer.parseInt(in.readLine());
		}
		max=n[0];
		min=n[0];
		for(a=0;a<10;a++)
		{
			if(max<n[a])
			max=n[a];
			if(min>n[a])
			min=n[a];
		}
		System.out.println("MAXIMUM NUMBER PRESENT IN ARRAY IS-"+max+"\nMINIMUM NUMBER PRESENT IN ARRAY IS-"+min);
	}
}