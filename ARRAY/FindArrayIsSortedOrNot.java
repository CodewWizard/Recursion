package ARRAY;

public class FindArrayisSortedOrNot {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 2, 5};
        System.out.println(check(arr, 0));
    }

    public static boolean check(int[] arr, int index) {
        if(index == arr.length - 1) return true;

        return arr[index] < arr[index + 1] && check(arr, index + 1);
    }
}
