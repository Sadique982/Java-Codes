import java.io.*;
class classname
{
int a,b;
public void input(int x,int y)
{
a=x;
b=y;
}
public void display()
{
System.out.println("value of a is"+a);

System.out.println("value of b is"+b);
}
public void exchange(classname n)
{
n.a=n.a+n.b;
n.b=n.a-n.b;
n.a=n.a-n.b;
}
public static void main(String arg[])throws Exception
{
int p,q;
DataInputStream in=new DataInputStream(System.in);
classname a1=new classname();
classname a2=new classname();
System.out.println("enter the value of p & q");
p=Integer.parseInt(in.readLine());
q=Integer.parseInt(in.readLine());
a1.input(p,q);
a1.display();
a2.exchange(a1);
a1.display();
}
}