import java.io.*;
import java.util.*;
final class bank
{
	int accountNumber[]=new int[10000];
	String AccountHolderName[]=new String[10000];
	char AccountType1[]=new char[10000];
	String AccountType[]=new String[10000];
	long accountBalance[]=new long[10000];
	String password[]=new String[10000];
	String date[]=new String[10000];
	long pan_card[]=new long[10000];
	String dob[]=new String[10000];
	String c[]=new String[10000];
	String notification[]=new String[10000];
	long a;
	int b=10;
	String s;


	public static void main(String[] args)throws Exception
	{
		bank obj = new bank();
	}
	
	
	
	bank()throws Exception
	{
		existing_account();														//CALLING THE FUNCTION OF DEFAULT 10 ACCOUNTS IN BANK
		DataInputStream in=new DataInputStream(System.in);
		int ch;
		System.out.println("\t\t\tWelcome to ST. MARY'S BANK");
		System.out.println("\t\t\t--------------------------\n\n");
		while(true)
		{
			System.out.println("\t\tSelect any Choice Number From below menu...");
			System.out.println("\t\t1. Create Account\n\t\t2. Display all Account \n\t\t3. Login\n\t\t4. Exit Portal");
			System.out.print("\t\tEnter Your Choice Code 1-4 : ");
			ch=Integer.parseInt(in.readLine());
			System.out.println();
			System.out.println();
			System.out.println();
			switch(ch)
			{
				case 1: 
					createAccount();
					break;
				case 2:
					allDisplayAccount();
					break;
				case 3:
					login();
					break;
				case 4:
					System.out.println("\t\t\tThanks for using our services");
					System.out.println("\t\t\t-----------------------------");
					System.exit(0);
					break;
				default:
					System.out.println("\t\t\tWrong Choice!!!");
					System.out.println("\t\t\t---------------");
			}
		}
	}


	public void existing_account()
	{
		accountNumber[0]=78600;
		accountNumber[1]=21000;
		accountNumber[2]=12121;
		accountNumber[3]=34243;
		accountNumber[4]=12764;
		accountNumber[5]=22313;
		accountNumber[6]=46274;
		accountNumber[7]=12224;
		accountNumber[8]=98822;
		accountNumber[9]=12776;

		
		AccountHolderName[0]="MOHAMMED SADIQUE";
		AccountHolderName[1]="MOHAMMAD ANAS";
		AccountHolderName[2]="RAHUL SINGH";
		AccountHolderName[3]="VIJEY CHAUHAN";
		AccountHolderName[4]="ARRTI SHARMA";
		AccountHolderName[5]="Chintu Tyagi";
		AccountHolderName[6]="VIRAT KOHLI";
		AccountHolderName[7]="NARENDRA MODI";
		AccountHolderName[8]="ADITYA NATH YOGI";
		AccountHolderName[9]="AMIT SHAH";
	
		AccountType1[0]='s';
		AccountType1[1]='s';
		AccountType1[2]='s';
		AccountType1[3]='s';
		AccountType1[4]='c';
		AccountType1[5]='c';
		AccountType1[6]='c';
		AccountType1[7]='c';
		AccountType1[8]='c';
		AccountType1[9]='c';
	
		AccountType[0]="Savings Account";
		AccountType[1]="Savings Account";
		AccountType[2]="Savings Account";
		AccountType[3]="Savings Account";
		AccountType[4]="Current Account";
		AccountType[5]="Current Account";
		AccountType[6]="Current Account";
		AccountType[7]="Current Account";
		AccountType[8]="Current Account";
		AccountType[9]="Current Account";
	
		
		accountBalance[0]=99991093;
		accountBalance[1]=342222;
		accountBalance[2]=25462;
		accountBalance[3]=23400;
		accountBalance[4]=47600;
		accountBalance[5]=987555;
		accountBalance[6]=444563574;
		accountBalance[7]=42300000;
		accountBalance[8]=421444;
		accountBalance[9]=5467000;
			
		
		password[0]="sadique375";
		password[1]="123987";
		password[2]="qwerty978";
		password[3]="1989";
		password[4]="2175";
		password[5]="1q2w3e4r5t";
		password[6]="1234567890";
		password[7]="234234";
		password[8]="qazwsx";
		password[9]="789456";
		
		
		date[0]="Wed Sep 11 11:12:55 GMT 2019";
		date[1]="Tue Nov 05 14:18:52 GMT 2018";
		date[2]="Thr Nov 06 13:23:42 GMT 2017";
		date[3]="Mon Jan 14 12:18:52 GMT 2016";
		date[4]="Wed Mar 20 09:43:22 GMT 2015";
		date[5]="Wed Mar 27 09:43:22 GMT 2015";
		date[6]="Wed Mar 13 09:43:22 GMT 2015";
		date[7]="Wed Mar 6 19:43:22 GMT 2014";
		date[8]="Tue Mar 5 03:43:22 GMT 2013";
		date[9]="Wed Mar 20 10:43:22 GMT 2012";
			
		
		pan_card[0]=12345;
		pan_card[1]=67890;
		pan_card[2]=23674;
		pan_card[3]=19007;
		pan_card[4]=67532;
		pan_card[5]=73932;
		pan_card[6]=78532;
		pan_card[7]=77122;
		pan_card[8]=22324;
		pan_card[9]=21345;
		
	
		dob[0]="20 January 2004";
		dob[1]="29 September 2004";
		dob[2]="12 December 1976";
		dob[3]="03 March 1987";
		dob[4]="30 June 2000";
		dob[5]="20 May 1999";
		dob[6]="21 May 2003";
		dob[7]="22 June 1990";
		dob[8]="31 January 1970";
		dob[9]="31 December 1965";
		
		
		for(int i=0;i<10;i++)
			notification[i]="";
	}
		
	


	public void createAccount()throws Exception
	{
		//Random rand = new Random();
		Date q=new Date();
		date[b]=String.valueOf(q);
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("----------------Welcome to Account Creation Portal-------------------");
		System.out.print("\tEnter Your Name : ");
		AccountHolderName[b]=in.readLine();
		System.out.print("\tEnter Yours Date Of Birth : ");
		dob[b]=in.readLine();
		System.out.print("\tEnter Yours Pan Card Number : ");
		pan_card[b]=Long.parseLong(in.readLine());
		System.out.print("\tEnter New Password : ");
		password[b]=in.readLine();
		System.out.print("\tEnter Your Account Type\n\t'S'forSavings\n\t'C'Current : ");
		AccountType1[b]=(char)in.read();

		switch (AccountType1[b])
		{
			case 'S':
			case 's':
				AccountType[b]="Savings Account";
				break;

			case 'c':
			case 'C':
				AccountType[b]="Current Account";
				break;

			default:
				System.out.println("\tYOUR ACCOUNT IS TAKEN AS SAVINGS AS YOU HAVE ENTERED WRONG TYPE");
				AccountType[b]="Savings Account";
				Thread.sleep(1500);
				break;
		}
		System.out.print("\tEnter your starting balance : ");
		try
		{
			DataInputStream o=new DataInputStream(System.in);
			accountBalance[b]=Long.parseLong(o.readLine());
	                  
			while(accountBalance[b]<500)
			{
				System.out.println("\tOops!!! Your Account balance should be minimum 500 or more.\n");
				System.out.print("\tEnter your starting amount : ");
				accountBalance[b]=Long.parseLong(o.readLine());
			}
		}
		catch(Exception e)
		{
			DataInputStream s=new DataInputStream(System.in);
			accountBalance[b]=Long.parseLong(s.readLine());
	                  
			while(accountBalance[b]<500)
			{
				System.out.println("\tOops!!! Your Account balance should be minimum 500 or more.\n");
				System.out.print("\tEnter your starting amount : ");
				accountBalance[b]=Long.parseLong(s.readLine());
			}		   
		}
		accountNumber[b]=(int)(Math.random()*10000);
		//accountNumber[b]=rand.nextInt(999999999);
		notification[b]="";
		System.out.println("\t\tAccount Created Successfully.");
		System.out.println("\t\tYour Account Number is: "+accountNumber[b]);
		System.out.println("\t\tPlease Note it Down.");
		System.out.println("------------------------------------------------------------");
		b++;
		Thread.sleep(1500);
	}
	
	
	public void allDisplayAccount() throws Exception
	{
		int i;
		for(i=0;i<b;i++)
		{
			try
			{
				System.out.println("\t\tDisplaying Account Information for Account Number : "+accountNumber[i]);
				System.out.println("\t\t---------------------------------------------------------");
				System.out.println("\t\tAccount Number                      : "+accountNumber[i]);
				System.out.println("\t\tAccount Name                        : "+AccountHolderName[i]);
				System.out.println("\t\tAccount Type                        : "+AccountType[i]);
				System.out.println("\t\tAccount balance                     : "+accountBalance[i]);
				System.out.println("\t\tPan Card Number                     : "+pan_card[i]);
				System.out.println("\t\tDate of birth of Account Holder     : "+dob[i]);
				if(notification[i].compareTo("")==0)
					System.out.println("\t\tLatest Notification                 : No new notification");
				else
					System.out.println("\t\tLatest Notification                 : "+notification[i]+" on "+c[i]);
				System.out.println("\t\t---------------------------------------------------------\n\n");   
				Thread.sleep(1350);
			}
			catch(Exception e)
			{
				if(notification[i].compareTo("")==0)
					System.out.println("\t\tLatest Notification                  : No new notification");
				else
					System.out.println("\t\tLatest Notification                  : "+notification[i]+" on "+c[i]);
				System.out.println("\t\t---------------------------------------------------------\n\n");   
				Thread.sleep(1000);
			}
		}
		System.out.println("\t\tTotal Accounts in Bank :"+b+"\n\n");
		Thread.sleep(1500);
	}
	
	
	
	
	
	public void DepositAmount(int p) throws Exception
	{
		String z="";
		Date q=new Date();
		DataInputStream in=new DataInputStream(System.in);
		long depositAmt,pan;
		System.out.println("\t\t---------------------Welcome to Deposit Portal-------------\n\n");
		System.out.println("You are Depositing amount for Account Number: "+accountNumber[p]);
		System.out.println("\nEnter the Amount to Deposit : ");
		depositAmt=Long.parseLong(in.readLine());
		z=Long.toString(depositAmt);
		if(depositAmt<50000)
		{
			c[p]=String.valueOf(q);
			accountBalance[p]+=depositAmt;
			notification[p]="Amount of Rs."+z+" was deposited";
			System.out.println("Amount Deposited Successfully.. \nUpdated Balance: "+accountBalance[p]);
			System.out.println("\t\t-----------------------------------------------------------\n\n");
		}
		else
		{
			System.out.println("Enter your's Pan Card Number");
			pan=Long.parseLong(in.readLine());
			if(pan==this.pan_card[p])
			{
				c[p]=String.valueOf(q);
				accountBalance[p]+=depositAmt;
				notification[p]="Amount of Rs."+z+" was deposited";
				System.out.println("Amount Deposited Successfully.. \nUpdated Balance: "+accountBalance[p]);
				System.out.println("\t\t-----------------------------------------------------------\n\n");
			}
			else
				System.out.println("Your pan card number is wrong");
		}
		Thread.sleep(1500);
	}

	
	public void WithdrawAmount(int p) throws Exception
	{
		String z="";
		Date q=new Date();
		DataInputStream in=new DataInputStream(System.in); 
		long withdrawAmt;
		System.out.println("\t\t---------------Welcome to Withdrawing Portal----------------\n\n");
		System.out.println("You are Withdrawing amount for Account Number: "+accountNumber[p]);
		System.out.println("\nEnter the Amount to Withdraw : ");
		withdrawAmt=Long.parseLong(in.readLine());
		z=Long.toString(withdrawAmt);
		if(withdrawAmt<=accountBalance[p])
		{
			accountBalance[p]-=withdrawAmt;
			c[p]=String.valueOf(q);
			notification[p]="Amount of Rs."+z+" was deposited";
			System.out.println("Amount Withdrawn Successfully..\nUpdated Balance: "+accountBalance[p]);
			System.out.println("\t\t-----------------------------------------------------------\n\n");
		}
		else
		System.out.println("Amount Withdrawn Unsuccessfully.. Balance: "+accountBalance[p]);
		Thread.sleep(1500);
        
	}

	public void transferAmt(int p)throws Exception
	{  
		long transfer_amt=0;
		int ac,i,w=0;
		String a1="";
		Date q=new Date();
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("\t\t---------------Welcome to Transfer Portal----------------\n\n");
		System.out.println("Enter the account no to which money is to be transfered");
		ac=Integer.parseInt(in.readLine());
		for(i=0;i<b;i++)
		{
			if(ac==accountNumber[i])
			{
				w=1;
				System.out.println("\nEnter the Amount to transfer: ");
				transfer_amt=Long.parseLong(in.readLine());
				if(transfer_amt<=accountBalance[p])
				{
					a1=Long.toString(transfer_amt);
					accountBalance[p]-=transfer_amt;
					c[p]=String.valueOf(q);
					notification[p]="Amount of Rs."+a1+" was transferred to "+AccountHolderName[i];
					System.out.println("Amount tarnsfer Successfully.. \nUpdated Balance: "+accountBalance[p]);
					c[i]=c[p];
					notification[i]="Amount of Rs."+a1+" was transferred to your account by "+AccountHolderName[p];
					accountBalance[i]+=transfer_amt;
				}
				else
					System.out.println("Your account has less money than the amount to be transferred");
				System.out.println("\t\t---------------------------------------------------------\n\n");
				break;
			}
		}
		if(w==0)
		{
			System.out.println("No Acount exist by account number : "+ac);
			System.out.println("\t\t---------------------------------------------------------\n\n");
		}
	}
	
	
	
	public void DisplayAccount(int p) throws Exception
	{
		System.out.println("\t\tDisplaying Account Information for Account Number : "+accountNumber[p]);
		System.out.println("\t\t---------------------------------------------------------");
		System.out.println("\t\tAccount Number                      : "+accountNumber[p]);
		System.out.println("\t\tAccount Name                        : "+AccountHolderName[p]);
		System.out.println("\t\tAccount Type                        : "+AccountType[p]);
		System.out.println("\t\tAccount balance                     : "+accountBalance[p]);
		System.out.println("\t\tYour Date of Birth                  : "+dob[p]);
		System.out.println("\t\tYour Pan Card Number                : "+pan_card[p]);
		System.out.println("\t\tYour Password                       : _Hidden_");
		try
		{
			if(notification[p].compareTo("")==0)
				System.out.println("\t\tLatest Notification                 : No new notification");
			else
				System.out.println("\t\tLatest Notification                 : "+notification[p]+" on "+c[p]);
		}
		catch(Exception e)
		{
			if(notification[p].compareTo("")==0)
				System.out.println("\t\tLatest Notification                  : No new notification");
			else
				System.out.println("\t\tLatest Notification                  : "+notification[p]+" on "+c[p]);
		}
		System.out.println("\t\tAccount was created on              : "+date[p]);
		System.out.println("\t\t---------------------------------------------------------");
		Thread.sleep(1500);
	}
	

	public void loan(int p)throws Exception
	{
		String z="";
		Date q=new Date();
		int ch,tu,size;
		String d;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("\t\t------------------Welcome to The loan portal------------------\n\n");
		System.out.println("Enter the type of loan for you want to apply ");
		System.out.println("1-business loan");
		System.out.println("2-housing loan");
		System.out.println("3-Persnol loan");
		System.out.println("4-Automobile loan");
		ch=Integer.parseInt(in.readLine());
		if(ch==1)
		{
			System.out.println("Requirement For business loan");
			System.out.println("ITR for last year");
			System.out.println("Registration Form of Company");
			System.out.println("-----------------------------------");
			System.out.println("Submit the above Detail To the Bank");
			System.out.println("If detail are Submitted then enter : \"yes\"");
			d=in.readLine();
			if(d.equalsIgnoreCase("yes"))
			{
				System.out.println("Enter the annual turnover of the company");
				tu=Integer.parseInt(in.readLine());
				if(tu>=4000000)
				{
					System.out.println("your loan Application is approved..\nyou may come to the bank for further process");
					c[p]=String.valueOf(q);
					notification[p]="Your Request for loan is grantted";
				}
				else
					System.out.println("your application is decline");
			}
			else
				System.out.println("your application is decline");
		}	
		else if(ch==2)
		{
			System.out.println("Requirement For housing loan");
			System.out.println("The papers of the house");
			System.out.println("the map of the house to be build");
			System.out.println("-----------------------------------");
			System.out.println("Submit the above Detail To the Bank");
			System.out.println("If detail are Submitted then enter : \"yes\"");
			d=in.readLine();
			if(d.equalsIgnoreCase("yes"))
			{
				System.out.println("your loan Application is approved..\nyou may come to the bank for further process");
				c[p]=String.valueOf(q);
				notification[p]="Your Request for loan is grantted";
			}
			else
				System.out.println("your application is decline");
		}
		else if(ch==3)
		{
			System.out.println("Requirement For persnol loan");
			System.out.println("ITR for last year");
			System.out.println("Paper's of the land to be sumbited");
			System.out.println("-----------------------------------");
			System.out.println("Enter the Size of the land");
			size=Integer.parseInt(in.readLine());
			if(size>10000)
			{
				System.out.println("If detail are Submitted then enter : \"yes\"");
				d=in.readLine();
				if(d.equalsIgnoreCase("yes"))
				{
					System.out.println("your loan Application is approved..\nyou may come to the bank for further process");
					c[p]=String.valueOf(q);
					notification[p]="Your Request for loan is grantted";
				}
				else
					System.out.println("your application is decline");
			}
			else
				System.out.println("your application is decline");
		}
		else if(ch==4)
		{
			System.out.println("Requirement For autoobile loan");
			System.out.println("The RC of the Car");
			System.out.println("Sumbit the estimate of the car");
			System.out.println("Submit the above Detail To the Bank");
			System.out.println("-----------------------------------");
			System.out.println("If detail are Submitted then enter : \"yes\"");
			d=in.readLine();
			if(d.equalsIgnoreCase("yes"))
			{
				System.out.println("your loan Application is approved..\nyou may come to the bank for further process");
				c[p]=String.valueOf(q);
				notification[p]="Your Request for loan is grantted";
			}
			else
				System.out.println("your application is decline");
		} 
		else
			System.out.println("wrong choice");

		System.out.println("\t\t--------------------------------------------------------------\n\n");
	}


	public void delete(int p)
	{
		int size=b;
		for(int j=p;j<size-1;j++)
		{
			accountNumber[j]=accountNumber[j+1];
			AccountHolderName[j]=AccountHolderName[j+1];
			AccountType1[j]=AccountType1[j+1];
			AccountType[j]=AccountType[j+1];
			accountBalance[j]=accountBalance[j+1];
			password[j]=password[j+1];
			date[j]=date[j+1];
			pan_card[j]=pan_card[j+1];
			dob[j]=dob[j+1];
			notification[j]=notification[j+1];
			c[j]=c[j+1];
		}
		b--;
	}
	
	
	
	
	public void login() throws Exception
	{
		String z="";
		int ch;
		int ctr=0;
		int accNum;
		String passWd;
		Date q=new Date();
		System.out.println("\t--------------WELCOME TO LOG-IN PORTAL------------------------\n\n");
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Enter Account Number : ");
		accNum=Integer.parseInt(in.readLine());
		System.out.println("Enter Your Password  : ");
		passWd=in.readLine(); 
		for(int i=0;i<b;i++)
		{
			if(accNum==this.accountNumber[i] && passWd.equals(this.password[i]))
			{
				ctr++;
				a=accNum;
				s=passWd;
				System.out.println("\n\nLogged In Successfully with account number: "+this.accountNumber[i]);
				System.out.println("------------------------------------------\n");
				while(true)
				{
					System.out.println("Choose Option Number From Below Menu");
					System.out.println("1.Deposit Amount");
					System.out.println("2.Withdraw Amount");
					System.out.println("3.Transfer Amount");
					System.out.println("4.Display Account Info");
					System.out.println("5.delete Account");
					System.out.println("6.Loan");
					System.out.println("7.Log Out");
					System.out.println("8.Exit");
					System.out.print("Enter your choice code 1-8 : ");
					ch=Integer.parseInt(in.readLine());
					switch(ch)
					{
						case 1:
							DepositAmount(i);
							break;
						case 2:
							WithdrawAmount(i);
							break;
						case 3:
							transferAmt(i);
							break;
						case 4:
							DisplayAccount(i);
							break;
						case 5:
							delete(i);
							System.out.println("Your account is deleted.");
							System.out.print("You would take your remaining balance within 15 days from bank ");
							System.out.println("otherwise the remaining amount will be given to bank");
							break;
						case 6:
							loan(i);
							break;
						case 7:
							break;
						case 8:
							break;
						default:
							System.out.println("You have entered a wrong choice. Please enter a valid choice code only from 1-8...");
					}
					if(ch==5||ch==7)
					{
						System.out.println("\t--------------------------------------------------------------\n\n");
						Thread.sleep(1500);
						break;
					}
					if(ch==8)
					{
						System.out.println("\t\tThanks for using our services");
						System.out.println("\t\t-----------------------------\n");
						System.out.println("\t--------------------------------------------------------------\n\n");
						System.exit(0);
					}
				}
				break;
			}
		}

		if(ctr==0)
		{
			System.out.println("You have Entered Incorrect Account Number or Password.\nOr The account does not exist. Please Check Again.");
			System.out.println("\t--------------------------------------------------------------\n\n");
			Thread.sleep(1500);
			System.exit(0);
		}
	}
}