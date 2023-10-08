import java.io.*;
class aaa{
	public static void main(String arg[])throws Exception{
		int i,j,k,a=4;
		for(i=1;i<=5;i++){
			for(k=1;k<=a;k++){
				System.out.print(" ");
			}
			for(j=i;j<=2*i-1;j++){
				System.out.print(j);
			}
			System.out.println();
			a--;
		}
	}
}