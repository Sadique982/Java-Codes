import java.io.*;
class salary
{
public static void main(String arg[])throws Exception
{
int p,t=1;
double Si,r=5;
DataInputStream in = new DataInputStream(System.in);
System.out.println("enter the principal");
p=Integer.parseInt(in.readLine());
Si=(p*r*t)/100.0;
System.out.println("the Si for first year is"+Si);
p=p+(int)Si;
Si=(p*r*t)/100.0;
System.out.println("the Si for second year is"+Si);
p=p+(int)Si;
Si=(p*r*t)/100.0;
System.out.println("the Si for third year is"+Si);
}
}