import java.io.*;
import java.util.StringTokenizer;
class File_1
{
    public static void main(String args[])throws Exception
    {
		int i,r,m,f=0;
		String s,g="",s1="";
		double p;
		DataInputStream in=new DataInputStream(System.in);
		FileReader fr = new FileReader("student.txt");
		BufferedReader br=new BufferedReader(fr);
		System.out.println("Enter the Name Or Roll No. of student whose record you want to search");
		g=in.readLine();
		s=br.readLine();
		while(s!=null)
		{
			StringTokenizer st = new StringTokenizer(s);	
			for(i=0;i<st.countTokens();i++)
			{
				s1=st.nextToken();
				if(g.equalsIgnoreCase(s1))
				{
					System.out.println("\t\tTHE DETAIL'S ARE-");
					System.out.println("\t\t"+s);
					f=1;
					break;
				}
			}
			s=br.readLine();
		}
		if(f==0)
			System.out.println("Record Not Present");
		br.close();
		fr.close();
	}
}