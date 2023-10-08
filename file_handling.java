import java.io.*;
class file_handling
{
	public static void main(String []arg)throws Exception
	{
		String z;
		file_handling in=new file_handling();
		DataInputStream s=new DataInputStream(System.in);
		System.out.println("ENTER THE FILE NAME--");
		z=s.readLine();
		System.out.println("ENTER 1 FOR editing FILE--"+z);
		System.out.println("ENTER 2 FOR READING FILE--"+z);
		System.out.println("ENTER ANY VALUE EXCEPT 1 AND 2 FOR DOING BOTH THE THING IN FILE--"+z);
		char a=(char)s.read();
		if(a=='1')
			in.add(z);
		else if(a=='2')
			in.read(z);
		else
		{
			System.out.println("FILE HAS THESE THINGS IN IT");
			in.read(z);
			System.out.println("ENTER YOUR DESIRED TEXT INTO THE FILE");
			in.add(z);
			System.out.println("AFTER EDITING THE FILE,IT HAVE THESE TEXT IN IT--");
			in.read(z);
		}
	}
	public void read(String s1)throws Exception
	{
		int i;
		FileInputStream file;
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			file=new FileInputStream(s1);
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
	public void add(String s1)throws Exception
	{
		int i;
		char ch;
		int p;
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE TEXT WHICH YOU WANT TO REPLACE IN FILE--"+s1);
		String s=in.readLine();
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
			FileOutputStream file=new FileOutputStream(s1);
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
}