import java.io.*;
class Refrence
{
	int a[][],r,c;
	
	void input()throws Exception
	{
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Enter the Number of Rows and coloums of the matrix");
		r=Integer.parseInt(in.readLine());
		c=Integer.parseInt(in.readLine());
		a=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("Enter the number\t: ");
				a[i][j]=Integer.parseInt(in.readLine());
			}
		}
	}
	
	
	Refrence check(Refrence obj1,Refrence obj2)
	{
		if(obj1.c==obj2.r)
		{
			r=obj1.r;
			c=obj2.c;
		}
		else
		{
			r=0;
			c=0;
		}
		return(this);
	}
	
	void multiply(Refrence obj1,Refrence obj2)
	{
		int i=0,j=0,p,q;
		a=new int[r][c];
		for(p=0;p<r;p++)
		{
			for(q=0;q<c;q++)
			{
				a[p][q]=0;
			}
		}
		if(r==0 && c==0)
		{
			System.out.println("Multiplication of matrix cannot be possible");
			System.exit(0);
		}
		else
		{
			for(p=0;p<r;p++)
			{
				int f=0;
				for(q=0;q<c;q++)
				{
					f++;
					a[p][q]+=obj1.a[p][i]*obj2.a[i][q];
					i++;
					q--;
					if(f==2)
					{
						q++;
						f=0;
					}
					if(i==obj1.c)
						i=0;
				}
			}
			
		}
	}	
	
	void display()
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String arg[])throws Exception
	{
		Refrence obj1=new Refrence();
		Refrence obj2=new Refrence();
		Refrence obj3=new Refrence();
		obj1.input();
		System.out.println("MATRIX ONE");
		obj1.display();
		obj2.input();
		System.out.println("MATRIX TWO");
		obj2.display();
		obj3=obj3.check(obj1,obj2);
		System.out.println("RESULTANT MATRIX");
		obj3.multiply(obj1,obj2);
		obj3.display();
	}
}