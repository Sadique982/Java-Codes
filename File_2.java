import java.io.*;
import java.util.StringTokenizer;
class File_2
{
    public static void main(String args[])throws Exception
    {
        String s,txt,s1,n="",n1="",edit="",g,p="";
        double d;
        int i,f=0,k=0,x,y,z;
        DataInputStream in=new DataInputStream(System.in);
        FileReader fr=new FileReader("student.txt");
        BufferedReader br= new BufferedReader(fr);
        System.out.print("Enter the name of student whose record you want to modify-");
        s=in.readLine();
		txt=br.readLine();
        while(txt!=null)
        {
            StringTokenizer st= new StringTokenizer(txt);
			z=st.countTokens();
            if(k==0)
            {
                for(i=1;i<=z;i++)
                {
                    s1=st.nextToken();
                    if(f==0)
                    {
                        if(s1.equalsIgnoreCase(s))
                        {
                            f=1;
                            break;
                        }
                        if(i==z)
                            n=n+txt+"\n";
                    }   
                }
            }
            else
                n=n+txt+"\n";
            if(f==1)
            {
                f=0;k=1;
				StringTokenizer st1= new StringTokenizer(txt);
                System.out.print("Your previous Roll no. was-\t"+st1.nextToken()+"\n Enter your new Roll No.-\t");
                x=Integer.parseInt(in.readLine());
                System.out.print("Your previous Name was-\t"+st1.nextToken()+"\n Enter your new Name-\t");
                g=in.readLine();
                System.out.print("Your previous Total Marks was-\t"+st1.nextToken()+"\n Enter your new Total Marks-\t");
                y=Integer.parseInt(in.readLine());
				d=y/3.0;
				if(d<=45)
					p="D";
				if(d>45 && d<=60)
					p="C";
				if(d>60 && d<=75)
					p="B";
				if(d>75 && d<=90)
					p="A";
				if(d>90)
					p="A+";
                edit=x+" "+g+" "+y+" "+d+" "+" "+p;
                n=n+edit+"\n";
            }
			txt=br.readLine();
        }
        br.close();
        fr.close();
		
		
		FileWriter fw=new FileWriter("student.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        pw.print(n);
		pw.close();
		bw.close();
		fw.close();
		
		
		
        FileReader fr1 = new FileReader("student.txt");
		BufferedReader br1=new BufferedReader(fr1);
        System.out.println("\t\tTHE FILE IS ");
        txt=br1.readLine();
        while(txt!=null)
        {
            System.out.println(txt);
            txt=br1.readLine();
        }
		br1.close();
		fr1.close();
    }
}