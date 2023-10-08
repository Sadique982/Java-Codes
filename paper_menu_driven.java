import java.io.*;
class paper_menu_driven
{
	public static void main(String[] args)throws Exception
	{
		String s1="",s2="",s3="";
		int k;
		char ch,chr,j;
		int i,s=0,p=1;
		System.out.print("------\nSERIES\n------\n");
		for(i=1;i<=10;i++)
		{
			p=p*i;
			s=s+p;
		}
		System.out.println("THE SUM IS : "+s);
		p=0;
		
		
		DataInputStream in=new DataInputStream(System.in);
		System.out.print("------\nSERIES\n------\n");
		System.out.print("ENTER THE WORD: ");
		String q=in.readLine();
		for(i=q.length()-1;i>=0;i--)
		{
			ch=q.charAt(i);
			p++;
			for(k=1;k<=p;k++)
				System.out.print(ch);
			System.out.print("\n");
		}
		
		System.out.print("------------------\nALPHABETICAL ORDER\n------------------\n");
		System.out.print("ENTER THE SENTENCE: ");
		String n=in.readLine();
		n=n.toUpperCase();
		System.out.print("THE NEW ARRANGED SENTENCE : ");
		for(i=0;i<n.length();i++)
		{
			ch=n.charAt(i);
			if(ch!=' ')
				s1=s1+ch;
			if(ch==' '||i==n.length()-1)
			{
				for(j='A';j<='Z';j++)
				{
					for(k=0;k<s1.length();k++)
					{
						chr=s1.charAt(k);
						if(j==chr)
							s2+=chr;
					}
				}
				System.out.print(s2+" ");
				s1=s2="";
			}
		}
	}
}