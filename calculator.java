import java.io*;
class classname 
{
public int add(int a,int b)
{
int c;
c=a+b;
return(c);
}
public int sub(int a,int b)
{
int c;
c=a-b;
return(c);
}
public void product()throws Exception
{
int p=1,a=1,n;
while(a!=0)
{
DataInputStream in = new DataInputStream(System.in);
System.out.println("enter any no.");
n=Integer.parseInt(in.readLine());
p=p*n;
System.out.println("enter 1 for next no. and 0 for product");
a=Integer.parseInt(in.readLine());
}
System.out.println("The product is"+p);
}
public int divide(int a,int b)
{
int r;
if(a>b)
r=a/b;
else
r=b/a;
return(r);
}
public int mod(int a,int b)
{
int r;
r=a%b;
return(r);
}
public double percentage (double a,double b)
{
double r;
if(a>b)
r=(b/a)*100.0;
else
(b>a)
r=(a/b)*100.0;
return(r);
}
public double average()
{
double r,av;
int n,a,b,s=0,c=0;
while(a!=0)
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter eny no.");
n=Integer.parseInt(in.readLine());
s=s+n;
System.out.println("enter next no. and 0 for the sum ");
a=Integer.parseInt(in.readLine());
c++;
av=s/c;
return(av);
}

public static void main(string arg[])throws Exception
{
int ch=0,a1,a2,a3;
double a4,a5;
DataInputStream in = new DataInputStream(System.in);
classname in=new classname();
while(ch<=7)
{
System.out.println("enter 1 for addition");
System.out.println("2 for subtraction");
System.out.printlnn("3 for multiplication");
System.out.println("enter 4 for divide");
System.out.println("enter 5 for mod");
System.out.println("enter 6 for percentage");
System.out.println("enter 7 for average");
System.out.println("enter your choice");
ch=Integer.parseInt(in.readLine());
switch(ch);
{
case 1:DataInputStream in=new DataInputStream(System.in);
System.out.println("enter any 2 no.");
a1=Integer.parseInt(in.readLine());
a2=Integer.parseInt(in.readLine());
a3=obj.add(a1,a2);
System.out.println("the total is"+a3);
break;
case 2:DataInputStream in=new DataInputStream(System.in);
System.out.println("enter any 2 no.");
a4=Integer.parseInt(in.readLine());
a5=Integer.parseInt(in.readLine());
a6=obj.sub(a4,a5);
System.out.println("the difference is"+a6);
break;
case3:obj.product();
break;
case 4 :DataInputStream in=new DataInputStream(System.in);
System.out.println("enter any 2 no.");
a7=Integer.parseInt(in.readLine());
a8=Integer.parseInt(in.readline());
a9=obj.divide(a7,a8);
System.out.println("the result is"+a9);
break;
case 5:
