import java.io.*;
class Char
{
	public static void main(String[] args)throws Exception
	{

		char n[][],c1,c2,c3;
		int m,i,j;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Enter Size of Array :");
		m=Integer.parseInt(in.readLine());
		n= new char[m][m];
		System.out.println("Enter Three Character in a string:");
		String s=in.readLine();
		c1=s.charAt(0);
		c2=s.charAt(1);
		c3=s.charAt(2);
		for(i=0;i<m;i++)
		{
			for(j=0;j<m;j++)
			{
				if((i==j)||((i+j)==m-1))
					n[i][j]=c3;
				else if(i==0||i==m-1)
					n[i][j]=c1;
				else if(j==0||j==m-1)
					n[i][j]=c2;
				else
				{
					if(i>j)
					{
						if(i>m/2)
							n[i][j]=c1;
						else
							n[i][j]=c2;
					}
					else
					{
						if(j>m/2)
							n[i][j]=c2;
						else
							n[i][j]=c1;
					}
				}
			}
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<m;j++)
				System.out.print(n[i][j]+" ");
			System.out.println();
			System.out.println();
		}
	}
}