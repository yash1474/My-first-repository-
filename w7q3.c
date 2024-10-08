
#include <stdio.h>

#define MAX_PROCESSES 10

void priority_scheduling(int burst_time[], int priority[], int n) {
    int waiting_time[MAX_PROCESSES], turnaround_time[MAX_PROCESSES];
    int completed[MAX_PROCESSES] = {0};
    int time = 0;

    for (int i = 0; i < n; i++) {
        int highest_priority_index = -1;
        int highest_priority = -1;

  
        for (int j = 0; j < n; j++) {
            if (!completed[j] && priority[j] > highest_priority) {
                highest_priority = priority[j];
                highest_priority_index = j;
            }
        }

        if (highest_priority_index != -1) {
            waiting_time[highest_priority_index] = time;
            time += burst_time[highest_priority_index];
            turnaround_time[highest_priority_index] = waiting_time[highest_priority_index] + burst_time[highest_priority_index];
            completed[highest_priority_index] = 1;

            printf("Process %d completed at time %d\n", highest_priority_index + 1, turnaround_time[highest_priority_index]);
        }
    }
}

int main() {
    int burst_time[MAX_PROCESSES];
    int priority[MAX_PROCESSES];
    int n;

    printf("Enter the number of processes: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        printf("Enter burst time for process %d: ", i + 1);
        scanf("%d", &burst_time[i]);
        printf("Enter priority for process %d (higher number means higher priority): ", i + 1);
        scanf("%d", &priority[i]);
    }

    priority_scheduling(burst_time, priority, n);

    return 0;
}
