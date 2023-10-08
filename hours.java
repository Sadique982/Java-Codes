import java.io.*;
class time
{ 
int h,m,s;
public void input(int a,int b,int c)
{
h=a;
m=b;
s=c;
}
public void display()
{
System.out.println("the hours are"+h);
System.out.println("minutes are"+m);
System.out.println("seconds are"+s);
}
public void addtime(time t1,time t2)
{
int th,ts,tm;
ts=t1.s+t2.s;
tm=ts/60;
ts=ts%60;
ts=ts%60;
tm=tm+t1.m+t2.m;
th=tm/60;
tm=tm%60;
th=th+t1.h+t2.h;
System.out.println("the total hours is"+th);
System.out.println("the total minutes are"+tm);
System.out.println("the total seconds are"+ts);
}
public static void main(String arg[])throws Exception
{
int p,q,r;
DataInputStream in=new DataInputStream (System.in);
time a1=new time();
time a2=new time();
time a3=new time();
System.out.println("enter the first time");
p=Integer.parseInt(in.readLine());
q=Integer.parseInt(in.readLine());
r=Integer.parseInt(in.readLine());
a1.input(p,q,r);
a1.display();
System.out.println("enter the second time");
p=Integer.parseInt(in.readLine());
q=Integer.parseInt(in.readLine());
r=Integer.parseInt(in.readLine());
a2.input(p,q,r);
a2.display();
a3.addtime(a1,a2);
}
}
