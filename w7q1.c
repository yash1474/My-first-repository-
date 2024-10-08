
#include <stdio.h>

int main() {
    int n, i, first, second;

    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);

    if (n < 2) {
        printf("Array must contain at least two elements.\n");
        return 0;
    }

    int arr[n];

    printf("Enter %d elements:\n", n);
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    first = second = -1; 

    for (i = 0; i < n; i++) {
        if (arr[i] > first) {
            second = first; 
            first = arr[i]; 
        } else if (arr[i] > second && arr[i] != first) {
            second = arr[i]; 
        }
    }

    if (second == -1) {
        printf("There is no second largest element (all elements might be the same).\n");
    } else {
        printf("The second largest element is: %d\n", second);
    }

    return 0;
}
