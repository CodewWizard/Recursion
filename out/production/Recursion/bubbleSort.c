#include<stdio.h>

void display(int arr[], int size){
    for (int i = 0; i < size; i++)
    {
        printf("%d ",arr[i]);
    }   
}

void swap(int arr[], int a, int b){
    int temp;
    temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
} 

void sort(int arr[], int size){
    for (int i = 0; i < size - 1; i++)
    {
        for (int j = 0; j < size -1; j++)
        {
            if(arr[j] > arr[j + 1]){
                swap(arr, j, j+1);
            }
        }
    }
}

int main(){
    int arr[] = {3, 4, 6, 2, 5};
    int size = 5;
    sort(arr, size);
    display(arr, size);
}