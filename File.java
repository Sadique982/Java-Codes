import java.io.*;
class File
{
	public static void main(String args[])throws Exception
	{
		int i,r,m,y;
		String s,g="",txt,x;
		double p;
		DataInputStream in=new DataInputStream(System.in);
		FileWriter fw=new FileWriter("student.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		PrintWriter pw=new PrintWriter(bw);
		System.out.print("Enter the Roll No. of Student-\t");
		r=Integer.parseInt(in.readLine());
		System.out.print("Enter the Name of Student-\t");
		s=in.readLine();
		System.out.print("Enter the Total Marks scored in 3 subjects of Student-\t");
		m=Integer.parseInt(in.readLine());
		p=m/3.0;
		x=Integer.toString(m);
		y=x.indexOf(".");
		if(p<=45)
			g="D";
		if(p>45 && p<=60)
			g="C";
		if(p>60 && p<=75)
			g="B";
		if(p>75 && p<=90)
			g="A";
		if(p>90)
			g="A+";
		pw.print(r+"\t"+s+"\t"+m+"\t"+p+"\t"+g);
        pw.println();
		pw.close();
		bw.close();
		fw.close();
        FileReader fr = new FileReader("student.txt");
		BufferedReader br=new BufferedReader(fr);
        System.out.println("\t\tTHE FILE IS ");
        System.out.println("\t\tName\tMarks\tPercentage\tGrade ");
        txt=br.readLine();
        while(txt!=null)
        {
            System.out.println("\t\t"+txt);
            txt=br.readLine();
        }
		br.close();
		fr.close();
	}
}