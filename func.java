import java.io.*;
class unit
{
public double bill(int u)
{
double p,tp;
if(u<=100)
p=1.5*u;
if(u>=101 && u<=250)
p=100*1.5+(u-100)*2.5;
if(u>=251 && u<=500)
p=100*1.5+150*2.5+(u-250)*3.5;
if(u>500 && u<=800)
p=100*1.5+150*2.5+250*3.5+(u-500)*4.5;
if(u>800 && u<=1000)
p=100*1.5+150*2.5+250*3.5+300*4.5+(u-800)*5.0;
if(u>1000)
p=100*1.5+150*2.5+250*3.5+300*4.5+200*5.0+(u-1000)*5.5;
tp=(10/100)*p;
return(tp);
}
public static void main(String arg[])throws Exception
{
int a;
double tb;
DataInputStream in =new DataInputStream(System.in);
System.out.println("enter the units");
a=Integer.parseInt(in.readLine());
unit obj=new unit();
tb=obj.bill(a);
System.out.println("the total bill is"+tb);
}
}