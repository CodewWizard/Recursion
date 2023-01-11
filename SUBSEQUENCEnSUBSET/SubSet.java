package SUBSEQUENCEnSUBSET;

import java.util.*;
public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> res = subSet(arr);

        for (List<Integer> list : res) {
            System.out.println(list);
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        subSetWithRecursive(arr, ans, 0);
        System.out.println(ans);
     }

    public static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();

            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

    public static void subSetWithRecursive(int[] arr, List<List<Integer>> outer, int index){
        if(arr.length == index){
            return;
        }
        int n = outer.size();
        for (int i = 0; i < n; i++) {
            List<Integer> inner = new ArrayList<>(outer.get(i));
            inner.add(arr[index]);
            outer.add(inner);
        }
        subSetWithRecursive(arr, outer, index + 1);
    }
}
