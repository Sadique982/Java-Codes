import java.io.*;
class encryption
{
	public static void main(String arg[])throws Exception
	{
		String s="",s1="",q="";
		char ch;
		int i;
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		encryption obj=new encryption();
		System.out.println("ENTER YOUR CHOICE AS :");
		System.out.println("1.SECURING FILE");
		System.out.println("2.UNCODE FILE");
		System.out.println("3.SECURING TEXT");
		int c=Integer.parseInt(in.readLine());
		if(c==1)
		{
			System.out.println("Enter the file name which is to be secured : ");
			s=in.readLine();
			q=obj.copy(s);
			obj.add(q,"decrypt.txt");
			for(i=0;i<q.length();i++)
			{
				ch=q.charAt(i);
				if(ch!=' ')
					ch+=39;
				s1=s1+ch;
			}
			System.out.println("YOUR FILE IS SUCCESSFULLY SECURED AS : ");
			obj.add(s1,"encrypt.txt");
			obj.read("encrypt.txt");
		}
		if(c==2)
		{
			System.out.println("Enter the file name which is to be uncode : ");
			s=in.readLine();
			q=obj.copy(s);
			obj.add(q,"encrypt.txt");
			for(i=0;i<q.length();i++)
			{
				ch=q.charAt(i);
				if(ch!=' ')
					ch-=39;
				s1=s1+ch;
			}
			System.out.println("YOUR FILE IS SUCCESSFULLY UNCODE AS : ");
			obj.add(s1,"decrypt.txt");
			obj.read("decrypt.txt");
		}
		if(c==3)
			obj.text();
		
	}
	public void add(String s,String s2)throws Exception
	{
		int i;
		char ch;
		int p;
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int c=s.length();
		int a[]=new int[c];
		c=0;
		for(i=0;i<s.length();i++)
		{
			int n=i;
			ch=s.charAt(i);
			for(p=n;p<=i;p++)
			{
				a[n]=(int)ch;
			}
		}
		try
		{
			FileOutputStream file=new FileOutputStream(s2);
			for(i=0;i<a.length;i++)
				file.write(a[i]);
			file.close();
		}
		catch(IOException ern)
		{
			System.out.println("ERROR IN THE FILE WRITE OPERANTION");
			System.out.println("ERR0R NUMBER-"+ern.toString());
		}
	}
	public void read(String s2)throws Exception
	{
		int i;
		FileInputStream file;
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			file=new FileInputStream(s2);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
			return;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("PROBLEM IN OPERATION");
			return;
		}
		do
		{
			i=file.read();
			if(i!=-1)
				System.out.print((char)i);
		}
		while(i!=-1);
			file.close();
	}
	public String copy(String s2)throws Exception
	{
		String f="";
		int i=0;
		FileInputStream file=null;
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			file=new FileInputStream(s2);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
			System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("PROBLEM IN OPERATION");
			System.exit(0);
		}
		do
		{
			i=file.read();
			if(i!=-1)
			{
				f=f+(char)i;
			}
		}
		while(i!=-1);
			file.close();
		return f;
	}
	

	public void text()throws Exception
	{
		int i;
		char ch;
		String s,s1="";
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE TEXT WHICH IS TO BE SECURED : ");
		s=in.readLine();
		add(s,"decrypt.txt");
		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch!=' ')
				ch+=39;
			s1=s1+ch;
		}
		System.out.println("YOUR FILE IS SUCCESSFULLY SECURED AS : ");
		add(s1,"encrypt.txt");
		read("encrypt.txt");
	}
}