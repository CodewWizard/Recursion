#include<stdio.h>
#include<stdbool.h>

bool linear(int arr[], int t, int size, int index){
    if(index >= size){
        return false;
    }
    return arr[index] == t|| linear(arr, t, size, index+1);
}


int main(){
    int arr[] = {1,2,3,4,5};
    int t = 31;
    int size = 5;
    printf("%d",linear(arr, t, size, 0));
}