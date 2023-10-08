import java.io.*;
class classname
{
public void febo(int n)
{
int i,s=0,a=0,b=1;
System.out.println(a+" "+b);
for(i=1;i<=(n-2);i++)
{
s=a+b;
System.out.println(" "+s);
a=b;
b=s;
}
}
public static void main(String arg[])throws Exception
{
int n;
DataInputStream in=new DataInputStream (System.in);
System.out.println ("enter the no.of terms");
n=Integer.parseInt(in.readLine());
classname obj =new classname();
obj.febo(n);
}
}
