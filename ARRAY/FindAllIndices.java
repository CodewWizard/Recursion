package ARRAY;

import java.util.*;

public class FindAllIndices {
    public static void main(String[] args) {
        int[] arr = new int[] {21, 8, 6, 6, 25};
        System.out.println(find(arr, 0, 6, new ArrayList<>()));
        System.out.println(find(arr, 0, 10, new ArrayList<>()));
        System.out.println(find2(arr, 0, 6));
    }

    public static ArrayList<Integer> find(int[] arr, int index, int target, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return find(arr, index + 1, target, list);
    }

    public static ArrayList<Integer> find2(int[] arr, int index, int target){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = find2(arr, index + 1, target);

        list.addAll(ansFromBelowCalls);
        return list;
    }
}
