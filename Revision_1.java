import java.io.*;
class Revision_1
{
	public static void main(String arg[])throws Exception
	{
		String txt,name,dop,dos;
		int i,no,qt,n;
		double price,amt=0.0;
		boolean eof=false;
	/*	DataInputStream in=new DataInputStream(System.in);
		System.out.print("Enter the Number of Products Bought : ");
		n=Integer.parseInt(in.readLine());
		FileWriter fw =new FileWriter("product.txt",true);
		BufferedWriter bw =new BufferedWriter(fw);
		PrintWriter pw=new PrintWriter(bw);
		
		
		FileOutputStream fout = new FileOutputStream("product.bin",true);
		DataOutputStream dout=new DataOutputStream(fout);
		
		for(i=1;i<=n;i++)
		{
			System.out.println("\t\tEnter The Details about the buy : ");
			System.out.print("Enter the Product Number : ");
			no=Integer.parseInt(in.readLine());
			System.out.print("Enter the Product Name : ");
			name=in.readLine();
			System.out.print("Enter the Quantity of Product : ");
			qt=Integer.parseInt(in.readLine());
			System.out.print("Enter the Product Price : ");
			price=Double.parseDouble(in.readLine());
			System.out.print("Enter the Date of Purchase : ");
			dop=in.readLine();
			System.out.print("Enter the Date of Sale : ");
			dos=in.readLine();
			amt=qt*price;
			
			pw.println(no+" "+name+" "+qt+" "+price+" "+dop+" "+dos+" "+amt);

			dout.writeInt(no);dout.writeChars(name);dout.writeInt(qt);dout.writeDouble(price);dout.writeChars(dop);dout.writeChars(dos);dout.writeDouble(amt);
		}
		pw.close();
		bw.close();
		fw.close();
		
		dout.close();
		fout.close();
		
		FileReader fr=new FileReader("product.txt");
		BufferedReader br=new BufferedReader(fr);
		txt=br.readLine();
		while(txt!=null)
		{
			System.out.println(txt);
			txt=br.readLine();
		}
		br.close();
		fr.close();
		
		System.out.println();
		System.out.println();
		Thread.sleep(1500);*/
		
		FileInputStream fin=new FileInputStream("product.bin");
		DataInputStream din=new DataInputStream(fin);
		while(!(eof))
		{
			try
			{
				name=din.readLine();
				dop=din.readLine();
				dos=din.readLine();
				no=din.readInt();
				qt=din.readInt();
				price=din.readDouble();
				amt=din.readDouble();
				System.out.println(no+" "+name+" "+qt+" "+price+" "+dop+" "+dos+" "+amt);
			}
			catch(EOFException e)
			{
				eof=true;
				System.out.println("End of File");
			}
		}
	}
}