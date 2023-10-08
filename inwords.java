import java.io.*;
class classname
{
public void words(int n)
{
int a,b,r=0;
while(n>0)
{
a=n%10;
n=n/10;
r=r*10+a;
}
while(r>0)
{
b=r%10;
r=r/10;
switch(b)
{
case 0:System.out.print("zero");
break;
case 1:System.out.print("one");
break;
case 2:System.out.print("two");
break;
case 3:System.out.println("three");
break;
case 4:System.out.println("four");
break;
case 5:System.out.println("five");
break;
case 6:System.out.println("six");
break;
case 7:System.out.println("seven"); 
break;
case 8:System.out.println("eight");
break;
case 9:System.out.println("nine");
break;
}
}
}
public static void main (String arg[])throws Exception
{
int n;
DataInputStream in=new DataInputStream (System.in);
System.out.println("enter any no.");
n=Integer.parseInt(in.readLine());
classname obj=new classname();
obj.words(n);
}
}
