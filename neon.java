import java.io.*;
class classname
{
public static void main(String arg[])throws Exception
{
int i,s2=0,b,m,sq,x,y;
DataInputStream in = new DataInputStream(System.in);
System.out.println("enter any 2 no.");
x=Integer.parseInt(in.readLine());
y=Integer.parseInt(in.readLine());
for(i=x;i<=y;i++)
{
m=i;
s2=0;
sq=m*m;
while(sq>0)
{
b=sq%10;
sq=sq/10;
s2=s2+b;
}
if(i==s2)
System.out.println(" "+i);
}
}
}

