import java.util.Scanner;
public class w1q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter operation you want to perform 1.addition 2.subtraction 3.multiplication 4.division");
        int op=sc.nextInt();
        double res;
        switch(op){
            case 1:
                res=a+b;
                break;
            case 2:
                res=a-b;
                break;
            case 3:
                res=a*b;
                break;
            case 4:
                res =(double)a/b;
                break;
            default:
                res=-1;
                System.out.println("try again");
                
                
        }
        System.out.println("The result is "+res);
        sc.close();
        
    }
}
