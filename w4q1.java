
import java.util.Scanner;

public class w4q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of elements ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        double avg=(double)sum/n;
        System.out.println("sum of array elements is "+sum);
        System.out.println("average of array elements is "+avg);

        int max=arr[0],min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("maximum of array elements is "+max);
        System.out.println("minimum of array elements is "+min);
        sc.close();
    }
}