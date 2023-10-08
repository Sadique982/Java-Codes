import java.io.*;
class employee
{
public static void main(String arg[])throws Exception 
{
int bp;
double da,hra,pf,gross,net;
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter the value in basic pay");
bp=Integer.parseInt(in.readLine());
da=bp*30.0/100.0;
hra=bp*15.0/100.0;
pf=bp*12.5/100.0;
gross= bp+da+hra;
net=gross-pf;
System.out.println("the gross pay is"+gross);
System.out.println("the net pay is "+net);
}
}