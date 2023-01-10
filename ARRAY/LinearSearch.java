package ARRAY;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[] {21, 8, 6, 36, 25};
        System.out.println(linearSearch(arr, 0, 25));
        System.out.println(linearSearch(arr, 0, 23));
    }

    public static int linearSearch(int[] arr, int index, int target){
        if(index == arr.length)
            return -1;

        if(arr[index] == target)
            return index;

        return  linearSearch(arr, index + 1, target);
    }
}
