
import java.util.Scanner;

public class w4q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and colums of matrices ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int mat[][]=new int[row][col];
        int mat2[][]=new int[row][col];
        int sum[][]=new int[row][col];
        System.out.println("Enter first matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter second matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Sum of matrices is ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum[i][j]=mat[i][j]+mat2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
    
}
