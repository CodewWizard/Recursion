#include<stdio.h>

int rotate(int arr[], int size, int beg, int end, int key){

        int mid =(beg + end) / 2;
        if(arr[mid] == key){
            return mid;
        }
        if(arr[beg] <= arr[mid]){
            if(key >= arr[beg] && key <= arr[mid]){
                return rotate(arr, size, beg, mid - 1, key);
            }
            else{
                return rotate(arr, size, mid + 1, end, key);
            }
        }

        else{
            if(key >= arr[mid] && key <= arr[end]){
                return rotate(arr, size, mid + 1, end, key);
            }
            else{
                return rotate(arr, size, beg, mid - 1, key);
            }
        }
        
}


int main(){
    int arr[] = {4, 5, 6, 7, 1, 2, 3};
    int size = 7;
    int res = rotate(arr, size, 0, size - 1, 4);
    printf("%d", res);
}