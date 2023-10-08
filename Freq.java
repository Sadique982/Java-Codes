import java.util.*;
import java.io.*;
class Freq
{
	public static void main(String arg[])throws Exception
	{
		String s,n,s1="",s2="";
		int i,j,f=0;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Enter two Strings");
		s=in.readLine();
		n=in.readLine();
		StringTokenizer St=new StringTokenizer(s);
		int z=St.countTokens();
		for(i=0;i<z;i++)
		{
			s1=St.nextToken();
			f=0;
			StringTokenizer st=new StringTokenizer(n);
			int p=st.countTokens();
			for(j=0;j<p;j++)
			{
				s2=st.nextToken();
				if(s1.equals(s2))
					f=1;
			}
			if(f==1)
				System.out.println(s1);
		}
	}
}