
import java.util.Scanner;

public class w4q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and colums of first matrices ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.println("Enter rows and colums of second matrices ");
        int row2=sc.nextInt();
        int col2=sc.nextInt();
        if(col!=row2){
            System.out.println("col of first matrix should be equal to row of second matrix ");
            sc.close();
            return;
        }
        int mat[][]=new int[row][col];
        int mat2[][]=new int[row2][col2];
        int mul[][]=new int[row][col2];
        System.out.println("Enter first matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter second matrix");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col2;j++){
                for(int k=0;k<col;k++){
                    mul[i][j]+=mat[i][k]*mat2[k][j];
                }
            }
        }
        System.out.println("Multiplication of matrices is ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col2;j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println(); 
        }

        sc.close();

    }
}
