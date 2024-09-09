

import java.util.Scanner;


public class w2q6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write a number or string");
        String s=sc.next();
        String rev="";
        for(int i=0;i<s.length();i++){
            rev=s.charAt(i)+rev;
        }
        if(rev.equals(s)){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
        sc.close();
    }
    
}
