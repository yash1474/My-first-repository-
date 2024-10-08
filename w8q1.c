
#include <stdio.h>

int main() {
    int arr[] = {0,1,2,3,4,5,6,8};  
    int n = sizeof(arr) / sizeof(arr[0]);  
    int total = (n * (n + 1)) / 2;  
    int sum = 0;
    
    for (int i = 0; i < n; i++) {
        sum += arr[i];  
    }
    
    int missingNumber = total - sum;  
    printf("The missing number is: %d\n", missingNumber);
    
    return 0;
}
