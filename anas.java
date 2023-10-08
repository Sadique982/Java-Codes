import java.io.*;
import java.util.*;
class anas
{	
	int acc;
	long pn;
	String n,add;
	public static void main(String args[])throws Exception
	{
		FileWriter fw=new FileWriter("banking.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.close();
		fw.close();
		int ch=0,x,y,ac;
		DataInputStream in=new DataInputStream(System.in);
		anas obj=new anas();
		while(ch!=8)
		{
			System.out.println("1-Create Account");	
			System.out.println("2-Display");
			System.out.println("3-Deposit Money");
			System.out.println("4-Withdraw Money");
			System.out.println("5-Modify Account");
			System.out.println("6-Delete Account");
			System.out.println("7-Search Account");
			System.out.println("8-Exit");
			ch=Integer.parseInt(in.readLine());
			if(ch==1)
			obj.createaccount();		
			if(ch==2)
				obj.display();
			if(ch==3)
			{
				System.out.println("Enter the Account number to Deposit");
				x=Integer.parseInt(in.readLine());
				System.out.println("Enter the money to be Diposit");
				y=Integer.parseInt(in.readLine());
				//obj.deposit();
			}
			if(ch==4)
			{
				System.out.println("Enter the Account number to Withdraw");
				x=Integer.parseInt(in.readLine());
				System.out.println("Enter the money to be Withdraw");
				y=Integer.parseInt(in.readLine());
				//obj.withdraw();
			}
			if(ch==5)
			{
				System.out.println("Enter the Account number to Modify");
				x=Integer.parseInt(in.readLine());
				//obj.modify();	
			}
			if(ch==6)
			{
				System.out.println("Enter the Account number to delete");
				x=Integer.parseInt(in.readLine());
				//obj.delete();	
			}
			if(ch==7)
			{
				System.out.println("Enter the Account number to search");
				x=Integer.parseInt(in.readLine());
				//obj.search();	
			}
		}
	}
	
	public void createaccount()throws Exception
	{
		DataInputStream in=new DataInputStream(System.in);
		acc=(int)(Math.random()*1000000);
		FileReader fi=new FileReader("banking.txt");
		BufferedReader br=new BufferedReader(fi);
		String txt=br.readLine();
		while(txt!=null)
		{
			int p=txt.indexOf(' ');
			String s1=txt.substring(0,p);
			String s2=Integer.toString(acc);
			while(s2.equals(s1))
			{
				acc=(int)(Math.random()*1000000);
				s2=Integer.toString(acc);
			}
			txt=br.readLine();
		}
		br.close();
		fi.close();
		System.out.println("Enter Your Name");
		n=in.readLine();
		System.out.println("Enter Your Address");
		add=in.readLine();
		System.out.println("Enter Your Phone Number");
		pn=Long.parseLong(in.readLine());
		FileWriter fw=new FileWriter("banking.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		PrintWriter pw= new PrintWriter(bw);
		pw.println(acc+"\t"+n+"\t"+add+"\t"+pn);
		pw.close();
		bw.close();
		fw.close();
		display();
	}
	public void display() throws Exception
	{
		FileReader fi=new FileReader("banking.txt");
		BufferedReader br=new BufferedReader(fi);
		String txt=br.readLine();
		while(txt!=null)
		{
			System.out.println("\t\t"+txt);
			txt=br.readLine();
		}
		System.out.println("\n\n\n");
		br.close();
		fi.close();
	}
}