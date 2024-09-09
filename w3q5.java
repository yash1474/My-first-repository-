
import java.util.Scanner;

public class w3q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
       
        int b=sc.nextInt();
        int mul=a*b;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("hcf is "+a);
        System.out.println("lcm is "+mul/a);
        sc.close();
    }
    
}
