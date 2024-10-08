
#include <stdio.h>

#define MAX_PROCESSES 10

void round_robin(int burst_time[], int n, int quantum) {
    int remaining_time[MAX_PROCESSES];
    for (int i = 0; i < n; i++) {
        remaining_time[i] = burst_time[i];
    }

    int time = 0;
    int all_done;

    do {
        all_done = 1; 

        for (int i = 0; i < n; i++) {
            if (remaining_time[i] > 0) {
                all_done = 0; 

                if (remaining_time[i] > quantum) {
                    time += quantum;
                    remaining_time[i] -= quantum;
                } else {
                    time += remaining_time[i];
                    printf("Process %d completed at time %d\n", i + 1, time);
                    remaining_time[i] = 0;
                }
            }
        }
    } while (!all_done);
}

int main() {
    int burst_time[MAX_PROCESSES];
    int n, quantum;

    printf("Enter the number of processes: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        printf("Enter burst time for process %d: ", i + 1);
        scanf("%d", &burst_time[i]);
    }

    printf("Enter time quantum: ");
    scanf("%d", &quantum);

    round_robin(burst_time, n, quantum);

    return 0;
}
