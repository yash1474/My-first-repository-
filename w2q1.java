
public class w2q1 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.print("Fibonacci sequence upto 10 numbers -\n"+a+" "+b+" ");
        for(int i =1;i<=8;i++){
            int temp=b;
            b=a+b;
            a=temp;
            System.out.print(b+" ");
        }
    }
    
}
