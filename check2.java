import java.io.*;
public class check2
{   String str;
    int w;
      void check1(int a)
    {
        char ch=str.charAt(a);
		 System.out.println(ch);
        if(ch>=65 && ch<=90)
        {
            w++;
        }
        a=str.indexOf(' ',a);
        if(a!=-1)
        {
            a++;
            check1(a);
        }
    }
    void display(){
        str="Hii my Name is Mohd Sadique okkk understand";
        w=0;
        check1(0);
    System.out.println(str);
       System.out.println(w);
    }
    public static void main(String arg[])
    {
        check2 obj=new check2();
        obj.display();
    }
}