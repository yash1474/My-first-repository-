
import java.util.Scanner;
public class w3q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a decimal number");
        int n=sc.nextInt();
        String bin="";
        while(n>0){
            bin =n%2+bin;
            n/=2;
        }
        System.out.println("Binary equivalent of this number is "+bin);
        sc.close();
    }
    
}
