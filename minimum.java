import java.io.*;
class number
{
public static void main(String arg[])throws Exception
{
int a,b,c;
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter two numbers");
a=Integer.parseInt(in.readLine());
b=Integer.parseInt(in.readLine());
c=Math.min(a,b);
System.out.println("the minimum is"+c);
}
}
