package ARRAY;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[] {14, 23, 45, 56, 77};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 56));
        System.out.println(binarySearch(arr, 0, arr.length - 1, 20));
    }

    public static int binarySearch(int[] arr, int start, int end, int target){
        if(start > end){
            return -1;
        }

        int mid = (start + end) / 2;

        if(arr[mid] == target)
            return mid;
        if(arr[mid] > target)
            return binarySearch(arr, start, mid - 1, target);

        return binarySearch(arr, mid + 1, end, target);
    }
}
