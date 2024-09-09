
import java.util.Scanner;

public class w5q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the interval ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Prime numbers between this interval are");
        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        sc.close();

    }
    public static boolean isPrime(int n){
        if(n==2||n==3){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
