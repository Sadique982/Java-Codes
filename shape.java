import java.io.*;
class shape
{
	public void area (int s)
	{
		int a=s*s;
		System.out.println("THE AREA OF SQUARE IS-"+a);
	}
	public void area(int l,int b)
	{
		int a=l*b;
		System.out.println("THE AREA OF RECTANGLE IS-"+a);
	}
	public void area(int a,int b,int c)
	{
		double s,ar;
		s=(a+b+c)/2.0;
		ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("THE AREA OF TRIANGLE IS-"+ar);
	}
	public void circle()throws Exception
	{
		int r;
		double a;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("ENTER THE RADIUS OF CIRCLE");
			r=Integer.parseInt(in.readLine());
		a=3.14*r*r;
		System.out.println("THE AREA OF CIRCLE IS-"+a);
	}
	public static void main(String arg[])throws Exception
	{
		int x,y,p,q,r,t,l,b,m;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("ENTER THE SIDE OF SQUARE");
			t=Integer.parseInt(in.readLine());
		System.out.println("ENTER THE  2 SIDES OF RECTANGLE(length and breadth)");
			l=Integer.parseInt(in.readLine());
			b=Integer.parseInt(in.readLine());
		System.out.println("ENTER THE 3 SIDES OF TRIANGLE");
			p=Integer.parseInt(in.readLine());
			q=Integer.parseInt(in.readLine());
			r=Integer.parseInt(in.readLine());
		shape obj=new shape();
		obj.area(t);
		obj.area(l,b);
		obj.area(p,q,r);
		obj.circle();
	}
}