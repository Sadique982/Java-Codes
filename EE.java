import java.io.*;
import java.util.*;
class EE
{
    public static void main(String args[])throws Exception
    {
        int bn,i,x=2;
        String an,pn,id,rd;
		double p,f;
        boolean eof=false;
		/*FileOutputStream fo = new FileOutputStream("book.bin");
		DataOutputStream Do = new DataOutputStream(fo);
		DataInputStream in=new DataInputStream(System.in);
		for(i=0;i<x;i++)
        {
            System.out.println("Enter");
            bn=Integer.parseInt(in.readLine());
            an=in.readLine();
            pn=in.readLine();
            id=in.readLine();
            rd=in.readLine();
            p=Double.parseDouble(in.readLine());
            f=Double.parseDouble(in.readLine());
            Do.writeInt(bn);		
            Do.writeChars(an);
            Do.writeChars(pn);
            Do.writeChars(id);
            Do.writeChars(rd);
            Do.writeDouble(p);
            Do.writeDouble(f);
		}
		Do.close();
		fo.close();*/
		FileInputStream fi = new FileInputStream("book.bin");
		DataInputStream Di=new DataInputStream(fi);
		for(i=0;i<x;i++)
        {
			eof=false;
            while(!eof)
            {
                System.out.println("\t\t\tThe file is \n");
				try
                {
				//	bn=Di.readInt();		
                    an=Di.readLine();
                    //pn=Di.readLine();
                    //id=Di.readLine();
                    //rd=Di.readLine();
                   // p=Di.readDouble();
                  //  f=Di.readDouble();
                   System.out.println("\t"+an+"\t"+pn+"\t"+id+"\t"+rd+"\t"+p+"\t"+f);
				}
				catch(EOFException e)
				{
                    System.out.println("\t\t\tEnd of File");
                    eof=true;
				}
            }
		}
		Di.close();
		fi.close();
	}
}