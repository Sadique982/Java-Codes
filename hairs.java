import java.io.*;
class classname
{
public static void main(String arg[])throws Exception
{
int i,j,k,l,a=5;
for(i=1;i<=5;i++)
{
for(k=1;k<=a;k++)
{
System.out.print(" ");
}
for(j=1;j<=i;j++)
{
System.out.print(j);
}
for(l=i-1;l>=1;l--)
{
System.out.print(l);
}
System.out.println();
a--;
}
}
}