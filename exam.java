import java.io.*;
class exam
{
	public static void main(String arg[])throws Exception
	{
		DataInputStream in=new DataInputStream(System.in);
		while(true)
		{
			System.out.println("\t1. SPY NUMBER");
			System.out.println("\t2. CHANGING CASE");
			System.out.println("\t3. CITY AND TEMPERATURE ARRAY");
			System.out.println("\t4. PERCENTAGE SORTING");
			System.out.println("\t5. EXIT");
			System.out.print("\tENTER YOUR CHOICE CODE AS : ");
			int m=Integer.parseInt(in.readLine());
			switch(m)
			{
				case 1:
					spy_number obj=new spy_number();
					break;
				case 2:
					changing_case ob=new changing_case();
					break;
				case 3:
					temp obj1=new temp();
					break;
				case 4:
					sort ob1=new sort();
					break;
				case 5:
					return;
				default:
					System.out.println("WRONG CHOICE");
			}
		}		
	}
}
class spy_number
{
	spy_number()throws Exception
	{
		int n,p=1,s=0,r;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("ENTER ANY NUMBER : ");
		n=Integer.parseInt(in.readLine());
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s+r;
			p=p*r;
		}
		if(p==s)
			System.out.println("A SPY NUMBER");
		else
			System.out.println("NOT A SPY NUMBER");
	}
}
class changing_case
{
	changing_case()throws Exception
	{
		String s,s1="";
		int i;
		char ch;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("ENTER ANY STRING : ");
		s=in.readLine();
		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
			{
				if(ch>=65&&ch<=90)
					ch+=32;
				else
					ch-=32;
			}
			s1=s1+ch;
		}
		System.out.println("NEW STRING : "+s1);
	}
}
class temp
{
	temp()throws Exception
	{
		DataInputStream in=new DataInputStream(System.in);
		int t[]=new int[10];
		String n[]=new String[10];
		int tot=0,i,max,min,p1,p2;
		double avg;
		for(i=0;i<10;i++)
		{
			System.out.println("ENTER NAME OF CITY AND ITS TEMPERATURE");
			n[i]=in.readLine();
			t[i]=Integer.parseInt(in.readLine());
			tot+=t[i];
		}
		avg=tot/10;
		max=min=t[0];p1=p2=0;
		for(i=0;i<10;i++)
		{
			if(t[i]>max)
			{
				max=t[i];
				p1=i;
			}
			if(t[i]<min)
			{
				min=t[i];
				p2=i;
			}
		}
		System.out.println("MAXIMUM TEMP. IS "+max+" of CITY "+n[p1]);
		System.out.println("MINIMUM TEMP. IS "+min+" of CITY "+n[p2]);
		System.out.println("AVERAGE TEMP. IS : "+avg);
	}
}
class sort
{
	sort()throws Exception
	{
		DataInputStream in=new DataInputStream(System.in);
		String n[]=new String[35],s;
		double per[]=new double[35];
		int i,j,p,n1=35;
		double max;
		for(i=0;i<n1;i++)
		{
			System.out.println("ENTER NAME OF STUDENT "+(i+1));
			n[i]=in.readLine();
			System.out.println("ENTER PERCENTAGE OF STUDENT "+(i+1));
			per[i]=Double.parseDouble(in.readLine());
		}
		//SORTING
		for(i=0;i<n1;i++)
		{
			max=per[i];
			s=n[i];
			p=i;
			for(j=(i+1);j<n1;j++)
			{
				if(per[j]>max)
				{
					max=per[j];
					s=n[j];
					p=j;
				}
			}
			per[p]=per[i];
			per[i]=max;
			n[p]=n[i];
			n[i]=s;
		}
		System.out.println("TOP 10 STUDENT'S");
		System.out.println("RANK\t"+"NAME\t"+"PERCENTAGE");
		for(i=0;i<10;i++)
		{
			System.out.println((i+1)+"\t"+n[i]+"\t"+per[i]+"%");
		}
	}
}