import java.io.*;
class string
{
	public static void main(String []args)throws Exception
	{
		String s,s1="",n[],n1[];
		char ch;
		int i,ctr=0,c=0,j,p=0;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("ENTER THE SENTENCE-");
		s=in.readLine();
		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch==' ')
				ctr++;
		}
		System.out.println("WORD\t\tFREQUENCY");
		n=new String[ctr+1];
		n1=new String[n.length];
		ctr=0;
		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch!=' ')
				s1=s1+ch;
			if(ch==' '||i==s.length()-1)
			{
				n[ctr]=s1;
				ctr++;
				s1="";
			}
		}
		for(i=0;i<n.length;i++)
		{
			ctr=0;
			for(j=0;j<c;j++)
			{
				if(n[i].equalsIgnoreCase(n1[j]))
				{
					p=1;
					break;
				}
			}
			if(p==0)
			{
				n1[c]=n[i];
				c++;
				for(j=i;j<n.length;j++)
				{
					if(n[i].equalsIgnoreCase(n[j]))
						ctr++;
				}
				System.out.println(n[i]+"\t\t"+ctr);		
			}
			else
				p=0;
		}
	}
}