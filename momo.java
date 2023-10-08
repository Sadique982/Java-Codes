import java.io.*;
class classname
{
public void perfect(int x,int y)
{
int i,j,s;
for (i=x;i<=y;i++)
{
s=0;
for (j=1;j<i;j++)
{
if(i%j==0)
s=s+j;
}
if(s==i)
System.out.println(" "+i);
}
}
public static void main(String arg[])throws Exception
{
int x,y;
classname obj=new classname();
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter any 2 no.");
x=Integer.parseInt(in.readLine());
y=Integer.parseInt(in.readLine());
obj.perfect(x,y);
}
} 

