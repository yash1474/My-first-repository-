
import java.util.Scanner;


public class w1q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year you want to check");
        int year=sc.nextInt();
        if(year%4==0&&(year%400==0||year%100!=0)){
            System.out.println(year +" is a leap year");
        }
        else{
            System.out.println(year +" is not a leap year");
        }
        sc.close();
    }
    
}
