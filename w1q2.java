

import java.util.Scanner;


public class w1q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("even no.");
        }
        else{
            System.out.println("odd no.");
        }
        sc.close();
    }
    
}
