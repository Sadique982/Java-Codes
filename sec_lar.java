import java.io.*;

class Prac {
    public static void main(String[] args) throws Exception {
        int a[] = new int[5];
        int x = 0, y = 0;
        int temp=y;
        for (int i = 0; i < 5; i++) {
           DataInputStream in = new DataInputStream(System.in);
           System.out.println("Enter any Number :");
            a[i] = Integer.parseInt(in.readLine());
            if(i==0){
                y=a[0];
                temp=y;
            }
            if (a[i] > y && a[i] < x) {
                temp = y;
                y = a[i];
            }
            if (x < a[i]) {
                x = a[i];
            }
            if (x == y) {
                y = temp;
            }
        }
        System.out.println("largest number in array is :" + x);
        System.out.println("Second largest number in array is :" + y);
    }
}