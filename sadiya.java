import java.io.*;
class pattern
{
public static void main (String arg [])throws Exception
{
int i,j,k,l,a;
DataInputStream in=new DataInputStream(System.in);
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
for(l=2;l<=5;l++)
{
for(a=5;a>=l;a--)
{
System.out.print(" ");
}
for(k=i;k>1;k--)
{
System.out.println("*");
}
System.out.println( );
}
}
}
}
