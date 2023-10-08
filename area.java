import java.io.*;
class classname
{
public void circle(int r)
{          
double ar;
ar=3.14*r*r;
System.out.println("the area of circle is "+ar);
}
public int rectangle()throws Exception
{
DataInputStream in= new DataInputStream(System.in);
int l,b,ar;
System.out.println("enter length and breadth of a rectangle");
l=Integer.parseInt(in.readLine());
b=Integer.parseInt(in.readLine());
ar=l*b;
return(ar);
}
public double triangle(int a,int b,int c)
{
double ar,s;
s=(a+b+c)/2.0;
ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
return(ar);
}
public void square()throws Exception
{
int s,ar;
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter the side of square");
s=Integer.parseInt(in.readLine());
ar=s*s;
System.out.println("the area of square is"+ar);
}

public static void main(String arg [])throws Exception 
{
classname obj=new classname();
int a,b,c,d,r1;
double r2;
DataInputStream in= new DataInputStream(System.in);
System.out.println("enter the radius");
a=Integer.parseInt(in.readLine());

obj.circle(a);
r1=obj.rectangle();
System.out.println("the area of rectangle is"+r1);
System.out.println ("enter the 3 sides of triangle");
b=Integer.parseInt(in.readLine());
c=Integer.parseInt(in.readLine());
d=Integer.parseInt(in.readLine());
r2=obj.triangle(b,c,d);
System.out.println("the area of triangle is"+r2);
obj.square();

}
}












