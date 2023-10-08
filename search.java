import java.io.*;
class search
{
	public static void main(String []arg)throws Exception
	{
		int n[],i,l,h,m,tag,f=0,ch;
		n=new int[10];
		DataInputStream in=new DataInputStream(System.in);
		for(i=0;i<10;i++)
		{
			System.out.println("ENTER THE NUMBER");
			n[i]=Integer.parseInt(in.readLine());
		}
		System.out.println("ENTER THE NUMBER TO BE SEARCHED IN ARRAY");
		tag=Integer.parseInt(in.readLine());
		System.out.println("\t\t=====================================\n\t\tENTER YOUR CHOICE FOR USING TECHNIQUE\n\t\t=====================================\n\t\t1 FOR BINARY SEARCH TEACHNIQUE\n\t\t2 FOR LINEAR OR SELECTION SEARCH TEACHNIQUE");
		ch=Integer.parseInt(in.readLine());
		switch(ch)
		{
			case 1:
			l=n[0];
			h=n[9];
			while(l<=h)
			{
				m=(l+h)/2;
				if(tag==n[m])
				{
					f=1;
					break;
				}
				else if(tag<n[m])
					h=m-1;
				else
					l=m+1;
			}
			if(f==1)
				System.out.println("THE NUMBER IS PRESENT IN THE ARRAY");
			else
				System.out.println("THE NUMBER IS NOT PRESENT IN THE ARRAY");
			break;
			case 2:
			for(i=0;i<10;i++)
			{
				if(n[i]==tag)
				{
					f=1;
				}
			}
			if(f==1)
				System.out.println("THE NUMBER IS PRESENT IN THE ARRAY");
			else
				System.out.println("THE NUMBER IS NOT PRESENT IN THE ARRAY");
			break;
			default:
			System.out.println("YOU HAVE ENTERED WRONG CHOICE");
		}
	}
}