#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_TASKS 100
#define TASK_NAME_LENGTH 50

typedef struct {
    int id;
    char name[TASK_NAME_LENGTH];
} Task;

Task tasks[MAX_TASKS];
int taskCount = 0;

void addTask() {
    if (taskCount >= MAX_TASKS) {
        printf("Task list is full!\n");
        return;
    }
    Task newTask;
    newTask.id = taskCount + 1;
    printf("Enter task name: ");
    scanf(" %[^\n]", newTask.name);
    tasks[taskCount++] = newTask;
    printf("Task added successfully!\n");
}

void displayTasks() {
    if (taskCount == 0) {
        printf("No tasks to display!\n");
        return;
    }
    printf("Task List:\n");
    for (int i = 0; i < taskCount; i++) {
        printf("ID: %d, Name: %s\n", tasks[i].id, tasks[i].name);
    }
}

void deleteTask() {
    if (taskCount == 0) {
        printf("No tasks to delete!\n");
        return;
    }
    int id;
    printf("Enter task ID to delete: ");
    scanf("%d", &id);
    int found = 0;
    for (int i = 0; i < taskCount; i++) {
        if (tasks[i].id == id) {
            found = 1;
            for (int j = i; j < taskCount - 1; j++) {
                tasks[j] = tasks[j + 1];
            }
            taskCount--;
            printf("Task deleted successfully!\n");
            break;
        }
    }
    if (!found) {
        printf("Task not found!\n");
    }
}

int main() {
    int choice;
    while (1) {
        printf("\nTask Management System\n");
        printf("1. Add Task\n");
        printf("2. Display Tasks\n");
        printf("3. Delete Task\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice) {
            case 1:
                addTask();
                break;
            case 2:
                displayTasks();
                break;
            case 3:
                deleteTask();
                break;
            case 4:
                exit(0);
            default:
                printf("Invalid choice! Please try again.\n");
        }
    }
    return 0;
}

