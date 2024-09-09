

import java.util.Scanner;

public class w2q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(isPrime(n)){
            System.out.println(n+" is prime");
        }
        else{
            System.out.println(n+" is not prime");
        }
        sc.close();
        
    }
    public static boolean isPrime(int n){
        if(n==2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
}
