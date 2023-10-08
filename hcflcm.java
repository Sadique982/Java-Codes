import java.io.*;
class classname
{
public static void main(String arg[])throws Exception
{
int n,m,l=1,x,y,a;

DataInputStream in=new DataInputStream(System.in);
System.out.println("enter 2 no.");
n=Integer.parseInt(in.readLine());
m=Integer.parseInt(in.readLine());
x=n;
y=m;

while(n%m!=0)
{
a=n%m;
n=m;
m=a;
}
l=(x*y)/m;
System.out.println("the lcm is"+l);
System.out.println("hcf is"+m);
}
}













