

import java.util.Scanner;

public class w3q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a string");
        String s=sc.nextLine();
        String s2=s.toLowerCase();
        int vowel=0,cons=0;
        for(int i=0;i<s.length();i++){
            char c=s2.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowel++;
            }
            else if(c>='a'&&c<='z'){
                cons++;
            }
        }
        System.out.println("vowels= "+vowel+" consonents= "+cons);
        sc.close();
    }
    
}
