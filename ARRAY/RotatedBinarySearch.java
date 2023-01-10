package ARRAY;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3};
        System.out.println(binarySearch(arr, 10, 0, arr.length - 1));
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = (start + end) / 2;
        if(arr[mid] == target){
            return mid;
        }

        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                return binarySearch(arr, target, start, mid - 1);
            }
            else {
                return binarySearch(arr, target, mid + 1, end);
            }
        }

        if(target >= arr[mid] && target <= arr[end]){
            return binarySearch(arr, target, mid + 1, end);
        }
        else{
            return binarySearch(arr, target, start, mid - 1);
        }
    }
}
