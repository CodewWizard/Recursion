package SUBSEQUENCEnSUBSET;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetII {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int arr[] = {1, 2, 3};
        Arrays.sort(arr);
        subset2(arr, 0, new ArrayList<>(), ans);
        for (List<Integer> list: ans) {
            System.out.println(list);
        }
    }


    public static void subset2 (int[] arr, int index, List<Integer> ds, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for (int i = index; i < arr.length; i++) {
            if(i != index && arr[i] == arr[i - 1]) continue;
            ds.add(arr[i]);
            subset2(arr,i + 1, ds, ans);
            ds.remove(ds.size() - 1);
        }
    }
}
