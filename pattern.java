import java.io.*;
class pattern
{
public static void main (String arg [])throws Exception
{
int i,j,k;
DataInputStream in=new DataInputStream(System.in);
for(i=1;i<=5;i++)
{
for(int z=1;z<=4;z++)
for(j=1;j<=i;j++)
{
System.out.print("*");
}
for(k=i;k>1;k--)
{
System.out.print("*");
}
System.out.println( );
}
}
}

