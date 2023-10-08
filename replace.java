import java.io.*;
class replace
{
	public static void main(String arg[])
	{
		String s;
		s="26 JANUARY IS CELEBRATED AS REPUBLIC DAY IN INDIA";
		System.out.println("THE SENTENCE WHICH HAS TO CHANGE ITSELF IS:-\n"+s);
		int x,y,z=s.indexOf('Y');;
		x=s.indexOf(' ');
		y=s.indexOf(' ',x+1);
		String s1="15 AUGUST"+s.substring(y);
		x=s1.indexOf("REPUBLIC");
		y=s1.indexOf(' ',x);
		String s2=s1.substring(0,x)+"INPENDENCE"+s1.substring(y);
		System.out.println("THE SENTENCE AFTER CHANGING IS:-\n"+s2);
	}

}