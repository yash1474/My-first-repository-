

import java.util.Scanner;

public class w3q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n/=10;
        }
        System.out.println("sum of the digits is "+sum);
        sc.close();
    }
}
