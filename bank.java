import java.io.*;
class bank
{
	int acno;
	String n,ad,dob,ph;
	double b;
	public void create_account()throws Exception
	{
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("enter the account no.");
		acno=Integer.parseInt(in.readLine());
		System.out.println("enter the name");
		n=in.readLine();
		System.out.println("enter the date of birth");
		dob=in.readLine();
		System.out.println("enter the address");
		ad=in.readLine();
		System.out.println("enter the phone number");
		ph=in.readLine();
		System.out.println("enter the balance");
		b=Double.parseDouble(in.readLine());
	}
	public void deposit(int x)throws Exception
	{
		int p;
		if(x<=50000)
		b+=x;
		else
		{
			DataInputStream in=new DataInputStream(System.in);
			System.out.println("enter the pan card number");
			p=Integer.parseInt(in.readLine());
			if(p>0)
			b=b+x;
			else
			b=b+x-(x*10/100);
		}
		System.out.println("TOTAL BALANCE AFTER DEPOSIT IS-"+b);
	}
	public void withdraw(int y)
	{
		if(y>b)
		System.out.println("withdraw not possible");
		else if(b-y>1000)
		b=b-y;
		else
		b=b-(y+100);
		System.out.println("TOTAL BALANCE AFTER WITHDRAW IS-"+b);
	}
	public void display()
	{
		System.out.println("account no is-"+acno);
		System.out.println("Name is-"+n);
		System.out.println("address is-"+ad);
		System.out.println("phone number is-"+ph);
		System.out.println("dob is-"+dob);
		System.out.println("balance is-"+b);
	}
	public static void main(String arg[])throws Exception
	{
		int ch=0,p,i,q;
		DataInputStream in=new DataInputStream(System.in);
		bank obj=new bank();
		while(ch<=4)
		{
			System.out.println("1 for create account");
			System.out.println("2 for deposit in an account");
			System.out.println("3 for withdraw");
			System.out.println("4 for display");
			System.out.println("5 for exit");
			System.out.println("enter your choice");
			ch=Integer.parseInt(in.readLine());
			switch(ch)
			{
				case 1:
				obj.create_account();
				break;
				case 2:
				System.out.println("enter the amount for deposit");
				p=Integer.parseInt(in.readLine());
				obj.deposit(p);
				break;
				case 3:
				System.out.println("enter the amount to withdraw");
				q=Integer.parseInt(in.readLine());
				obj.withdraw(q);
				break;
				case 4:
				obj.display();
			}
		}
	}
}