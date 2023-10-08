import java.io.*;
class String_arrange {
    public static void main(String [] args) throws IOException {
        String s,s1="",s2="";
        int i,j,c=1;
        char ch;
        DataInputStream in=new DataInputStream(System.in);
        System.out.print("Enter Any Sentence : ");
        s=in.readLine();
		int l=s.lastIndexOf(' ');
        System.out.println("Word\tFrequency");
        System.out.println("----\t---------");
        for(i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch!=' ')
                s1=s1+ch;
            if(ch==' '||i==s.length()-1){
				
                c=1;
                for(j=i+1;j<=l;j++){
                    ch=s.charAt(j);
                    if(ch!=' ')
                        s2=s2+ch;
					if(ch==' '||i==s.length()-1){
                        if (s1.equalsIgnoreCase(s2)) {
							c++;
                            s=s.substring(i)+s.substring(j+1,s.length());
							l=s.lastIndexOf(' ');
                        }
						s2="";
                    }
                }
                System.out.println(s1+"\t"+c+"==========="+s);
                s1="";
			}
        }
    }
}
