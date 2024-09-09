

import java.util.Scanner;

public class w3q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a binary number");
        int n=sc.nextInt();
        int dec=0;
        int i=0;
        while(n>0){
            dec=dec+((n%10)*(int)Math.pow(2, i));
            n/=10;
            i++;
        }
        System.out.println("decimal equivalent of this number is "+dec);
        sc.close();
    }
    
}
