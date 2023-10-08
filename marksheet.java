import java.io.*;
class marksheet
{
        static int r,m1,m2,m3,m4,m5,m6,t;
        static double p;
        static String g,n,c,dob,add,ph,s1,s2,s3,s4,s5,s6,s[]=new String [6],tab="";
        marksheet()throws Exception
        {
                DataInputStream in=new DataInputStream(System.in);
                System.out.println("ENTER THE ROLL NUMBER");
                r=Integer.parseInt(in.readLine());
                System.out.println("ENTER THE NAME OF STUDENT");
                n=in.readLine();
                System.out.println("ENTER THE CLASS");
                c=in.readLine();
                System.out.println("ENTER THE DATE OF BIRTH");
                dob=in.readLine();
                System.out.println("ENTER THE ADDRESS");
                add=in.readLine();
                System.out.println("ENTER THE PHONE NUMBER");
                ph=in.readLine();
        }
        static void input_mark()throws Exception
        {
                DataInputStream in=new DataInputStream(System.in);
                System.out.println("ENTER THE NAME OF SUBJECT'S AND MARKS SCORED");
                System.out.println();
                System.out.println("FIRST SUBJECT NAME AND ITS MARKS");
                s1=in.readLine();
                m1=Integer.parseInt(in.readLine());
                System.out.println("SECOND SUBJECT NAME AND ITS MARKS");
                s2=in.readLine();
                m2=Integer.parseInt(in.readLine());
                System.out.println("THIRD SUBJECT NAME AND ITS MARKS");
                s3=in.readLine();
                m3=Integer.parseInt(in.readLine());
                System.out.println("FOURTH SUBJECT NAME AND ITS MARKS");
                s4=in.readLine();
                m4=Integer.parseInt(in.readLine());
                System.out.println("FIFTH SUBJECT NAME AND ITS MARKS");
                s5=in.readLine();
                m5=Integer.parseInt(in.readLine());
				System.out.println("SIXTH SUBJECT NAME AND ITS MARKS");
                s6=in.readLine();
                m6=Integer.parseInt(in.readLine());
				s[0]=s1;s[1]=s2;s[2]=s3;s[3]=s4;s[4]=s5;s[5]=s6;
				for(int i=0;i<6;i++)
				{
					int l=s[i].length();
					if(l>tab.length())
						for(int k=tab.length();k<=l;k++)
							tab=tab+" ";
				}
        }
        static void calculate_result()
        {
                t=m1+m2+m3+m4+m5+m6;
                p=t/6.0;
                if(p<40.0)
                g="F";
                if(p>=40.0&&p<=54.9)
                g="D";
				if(p>=55.0&&p<=59.9)
                g="D";
                if(p>=60.0&&p<=69.9)
                g="C";
                if(p>=70.0&&p<=79.9)
                g="B";
                if(p>=80.0&&p<=89.9)
                g="A";
                if(p>=90.0)
                g="A+";
        }
        static void display()
        {
                System.out.println("\t\t\t\tST. MARY'S SCHOOL");
                System.out.println("\t\t\t\t\tNAJIBABAD");
                System.out.println("\t\t\t\t\t2019-2020");
                System.out.println();
                System.out.println("\tNAME OF THE STUDENT-"+n+"\tCLASS-"+c+"\tROLLNUMBER-"+r);
                System.out.println();
                System.out.println("\tDATE OF BIRTH-"+dob+"\n\tPHONE NUMBER-"+ph+"\n\tADDRESS-"+add);
                System.out.println();
                System.out.println("\tSUBJECT NAME"+tab+"MARKS OBTAIN");
                System.out.println();
                System.out.println("\t1."+s1+tab+m1);
                System.out.println("\t2."+s2+tab+""+m2);
                System.out.println("\t3."+s3+tab+m3);
                System.out.println("\t4."+s4+tab+m4);
                System.out.println("\t5."+s5+tab+m5);
                System.out.println("\t6."+s6+tab+m6);
                System.out.println();
                System.out.println("TOTAL MARKS OBTAIN ARE-"+t);
                System.out.println("PERCENTAGE SCORED IS-"+p+"%");
                System.out.println("GRADE-"+g);
        }
        public static void main(String arg[])throws Exception
        {
				DataInputStream in=new DataInputStream(System.in);
                marksheet inr=new marksheet();
                input_mark();
                calculate_result();
                display();
        }
}