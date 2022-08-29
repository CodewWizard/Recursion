public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {4, 6, 9, 10, 15};
        int ans = binary(arr,6, 5, 0, 4);
        System.out.println(ans);
    }
    public static int binary(int arr[], int t, int n, int beg, int end){
        int mid;
        if(beg > end){
            return -1;
        }
            mid = (beg + end) / 2;
            if(arr[mid] == t){
                return mid;
            }
            if(arr[mid] > t){
                return binary(arr, t, n, beg, mid - 1);
            }
            else{
                return  binary(arr, t, n, mid + 1, end);
            }
    }
}
