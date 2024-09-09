
import java.util.Scanner;
public class w4q4 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter size of array");
            int n=sc.nextInt();
            int arr[]=new int[n];
            int max=Integer.MIN_VALUE;
            System.out.println("Enter array elements ");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            System.out.println("Largest element is "+max);
            sc.close();
    }
    
}
