

public class w5q1 {
    public static void main(String[] args) {
        int arr1[]={2,5,9,13,45,70};
        int arr2[]={1,4,7,20,23,46,66,90};
        int n1=arr1.length;
        int n2=arr2.length;
        int sor[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                sor[k]=arr1[i];
                i++;
            }
            else{
                sor[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            sor[k]=arr1[i];
            i++;k++;
        }
        while(j<n2){
            sor[k]=arr2[j];
            j++;k++;
        }
        for (int p=0;p<n1+n2;p++) {
            System.out.print(sor[p]+" ");
        }

    }
    
}
