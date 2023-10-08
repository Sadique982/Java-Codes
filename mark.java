import java.io.*;
class mark
{
	String name;
	int m1,m2,m3,max,age;
	double avg;
	public mark(String n,int a,int b,int c,int d)
	{
		name=n;
		age=d;
		m1=a;
		m2=b;
		m3=c;
	}
	public void compute()
	{
		if(m1>m2&&m1>m3)
			max=m1;
		else if(m2>m1&&m2>m3)
			max=m2;
		else
			max=m3;
		
		avg=(m1+m2+m3)/3.0;
	}
	private void display()
	{
		System.out.println("NAME OF THE STUDENT IS-"+name);
		System.out.println("AGE OF THE STUDENT IS-"+age);
		System.out.println("MARKS IN FIRST SUBJECT-"+m1);
		System.out.println("MARKS IN SECOND SUBJECT-"+m2);
		System.out.println("MARKS IN THIRD SUBJECT-"+m3);
		System.out.println("HIGHEST MARKS SCORED IN THREE SUBJECT:-"+max);
		System.out.println("AVGERAGE OF THE THREE SUBJECTS MARKS:-"+avg);
	}
	public static void main(String args[])throws Exception
	{
		int ag,x,y,z;
		String na;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("enter the name of student");
		na=in.readLine();
		System.out.println("enter the age of student");
		ag=Integer.parseInt(in.readLine());
		System.out.println("enter the marks in first subject");
		x=Integer.parseInt(in.readLine());
		System.out.println("enter the marks in second subject");
		y=Integer.parseInt(in.readLine());
		System.out.println("enter the marks in third subject");
		z=Integer.parseInt(in.readLine());
		mark obj=new mark(na,x,y,z,ag);
		obj.compute();
		obj.display();
	}
}