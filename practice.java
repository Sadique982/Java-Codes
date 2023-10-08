import java.io.*;
class practice
{
	public static void main(String[] arg)throws Exception
	{
		DataInputStream in=new DataInputStream(System.in);
		int ques[][][]=new int[2][2][2];
		String s;
		int i,j,k;
		//System.out.print(ques[0].length());
		//System.out.print("\t"+ques1.length());
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				for(k=0;k<2;k++)
				{
					System.out.print("ENTER ANY NUMBER : ");
					s=in.readLine();
					ques[i][j][k]=Integer.parseInt(s);
				}
			}
		}
		System.out.print("THE 2*2*2 DIMENSIONAL ARRAY IS: \n");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				for(k=0;k<2;k++)
				{
					System.out.print(ques[i][j][k]+"\t");
				System.out.print("\t\t");
				}
			}
			System.out.print("\n");
		}
	}
}