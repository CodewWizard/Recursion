#include<stdio.h>
#include<stdbool.h>

bool binary(int arr[], int t, int start, int end, int size){
   if(start > end){
        return false;
   }
   int mid = (start + end ) / 2;

   if(arr[mid] > t){
        return binary(arr, t, start, mid - 1, size);
   }
   if(arr[mid] == t){
    return true;
   }
   return binary(arr, t, mid + 1, end, size);
}


int main(){
    int arr[] = {1,2,3,4,5};
    int t = 11;
    int size = 5;
    printf("%d",binary(arr, t, 0, size - 1, size));
}